package com.nopcommerce.demo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/register.feature", // path of featurefile
        glue = "com/nopcommerce/demo",  // path of com.nopcommerce.demo
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}

)
public class LoginRunner {




}
