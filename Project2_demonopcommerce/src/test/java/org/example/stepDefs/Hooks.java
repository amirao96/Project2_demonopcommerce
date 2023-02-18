package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void OpenBrowser(){
        // 1- Bridge between your code and your browser
        // using WebDriverManager dependency
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        // Browser configs
        driver.manage().window().maximize();
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to the desired url
        String url = "https://demo.nopcommerce.com/";
        driver.navigate().to(url);
    }

    @After
    public static void quitDriver() throws InterruptedException {
        //Quit driver
        Thread.sleep(3000);
        driver.quit();

    }
}
