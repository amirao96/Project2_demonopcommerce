package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    // 1- constructor from this class to use the page factory to locate the elements
    public P01_register(){
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;

    @FindBy(id = "gender-female")
    public WebElement female;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(className = "result")
    public WebElement successMessage;


    public Select DateOfBirthDayList(){
        WebElement DateOfBirthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        DateOfBirthDay.click();

        Select DateOfBirthDayList = new Select(DateOfBirthDay);
        return DateOfBirthDayList;
    }

    public Select DateOfBirthMonthList(){
        WebElement DateOfBirthMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        DateOfBirthMonth.click();

        Select DateOfBirthMonthList = new Select(DateOfBirthMonth);
        return DateOfBirthMonthList;
    }

    public Select DateOfBirthYearList(){
        WebElement DateOfBirthYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        DateOfBirthYear.click();

        Select DateOfBirthYearList = new Select(DateOfBirthYear);
        return DateOfBirthYearList;
    }

}
