package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class P03_homePage {
    public Select customerCurrency(){
        WebElement customerCurrency = Hooks.driver.findElement(By.id("customerCurrency"));
        customerCurrency.click();

        Select customerCurrencyList = new Select(customerCurrency);
        return customerCurrencyList;
    }

    public List<WebElement> itemGrid(){
        List<WebElement> itemGrid = Hooks.driver.findElements(By.className("item-grid"));

        return itemGrid;
    }

}
