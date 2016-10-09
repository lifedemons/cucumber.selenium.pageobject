package com.cucumber.selenium.pageobject.example.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"
        },
        glue = "com.cucumber.selenium.pageobject.example.steps",
        features = "classpath:features"
)
public class SearchTest {
}
