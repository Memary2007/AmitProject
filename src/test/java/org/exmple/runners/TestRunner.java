package org.exmple.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/Feature",
        glue = {"org.exmple.stepdefs"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
