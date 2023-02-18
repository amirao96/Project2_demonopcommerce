package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    // 1- constructor from this class to use the page factory to locate the elements
    public P02_login(){
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-login")
    public WebElement loginLink;

    @FindBy(className = "email")
    public WebElement email;

    @FindBy(className = "password")
    public WebElement password;

    @FindBy(className = "button-1 login-button")
    public WebElement loginButton;

    @FindBy(className = "message-error validation-summary-errors")
    public WebElement invalidLoginErrorMsg;

}
