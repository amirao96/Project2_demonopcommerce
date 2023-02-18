package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;

public class D03_currenciesStepDef {

    P03_homePage homePage = new P03_homePage();
    @When("user select {string} currency from the home page")
    public void userSelectCurrencyFromTheHomePage(String currency) {
        homePage.customerCurrency().selectByVisibleText(currency);
    }

    @Then("Euro Symbol {string} is shown on the {int} products displayed in Home page")
    public void euroSymbolIsShownOnTheProductsDisplayedInHomePage(String currencySymbol, int productsNumber) {


    }
}
