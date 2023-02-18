package org.example.testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/main/resources/features",
                glue = "org.example.stepDefs",

                // el tag ally b3mlo f el feature w a7oto hna hwa ally hyt3mlo running
                // w mkan ma ba7ot el tag by3ml run l ally ma7tot 3alih
                // lw kan abl el feature hy3ml run l kol el tests ally feha
                // 7ata lw leha tags tania
                // b5tar a3ml run lel feature kolha wala scenarios mo3yna
                tags = "@smoke",

                // to generate my report and choose its format
                // and it has more than one string
                plugin = {
                        "pretty",
                        "html:target/cucumber.html",
                        "html:target/cucumber.json",
                        "html:target/cukes.xml",
                        "html:target/rerun.txt"

                }
        )

public class runners extends AbstractTestNGCucumberTests {
}
