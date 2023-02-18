package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public void userGoToLoginPage() {
        login.loginLink.click();
    }

    @When("user login with {string} {string} and {string}")
    public void userUserLoginWithAnd(String type, String email, String password) {
        String testType = type;
        login.email.sendKeys(email);
        login.password.sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton.click();

    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();

        // Assert on getCurrentURl = https://demo.nopcommerce.com/
        String expectedLoginUrl = "https://demo.nopcommerce.com/";
        String actualLoginUrl = Hooks.driver.getCurrentUrl();
        soft.assertEquals(expectedLoginUrl, actualLoginUrl, "Valid login Url is correct ");

        // Assert on "My account" tab is displayed
        soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());

        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();

        // Assert error msg contains "Login was unsuccessful."
        soft.assertTrue(login.invalidLoginErrorMsg.getText().contains("Login was unsuccessful"));

        // Assert the color of this message is red "#e4434b"
        String actualColor = login.invalidLoginErrorMsg.getCssValue("color");
        soft.assertEquals(Color.fromString(actualColor).asHex(), "#e4434b","Message color is correct");

        soft.assertAll();
    }

}

