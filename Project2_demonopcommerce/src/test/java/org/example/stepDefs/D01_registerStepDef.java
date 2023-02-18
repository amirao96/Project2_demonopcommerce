package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("User go to register page")
    public void goRegisterPage() {
        register.registerLink.click();
    }

    @When("User enter valid username and password")
    public void validUsernameAndPassword() {
        // Click on Register Button
        register.registerLink.click();

    }

    @When("User select gender type")
    public void userSelectGenderType() {
        register.female.click();
    }

    @And("User enter {string} & {string}")
    public void userEnter(String firstname, String lastname) {
        register.firstName.sendKeys(firstname);
        register.lastName.sendKeys(lastname);
    }

    @And("User select date of birth")
    public void userSelectDateOfBirth() {
        register.DateOfBirthDayList().selectByVisibleText("17");
        register.DateOfBirthMonthList().selectByVisibleText("February");
        register.DateOfBirthYearList().selectByVisibleText("1996");
    }
    @And("User enter email")
    public void userEnterEmail() {
        // generate random email using java faker
        Faker fake = new Faker();
        String emailAddress = fake.internet().safeEmailAddress();
        System.out.println("Fake email used is: " + emailAddress);
        register.email.sendKeys(emailAddress);
    }

    @And("User enter {string} password and confirm password")
    public void userEnterPasswordAndConfirmPassword(String password) {
       register.password.sendKeys(password);
       register.confirmPassword.sendKeys(password);
    }

    @And("User click on register button")
    public void userClickOnRegisterButton() {
        register.registerButton.click();
    }

    @Then("account is created successfully")
    public void accountIsCreatedSuccessfully() {

        SoftAssert soft = new SoftAssert();
        // get text and verify the success message
        soft.assertTrue(register.successMessage.getText().contains("Your registration completed"),
                "Registration is successful");

        // get css value and verify the message color is green
        String actualColor = register.successMessage.getCssValue("color");
        soft.assertEquals(Color.fromString(actualColor).asHex(), "#4cb17c",
                 "Message color is correct");

        soft.assertAll();

    }

}
