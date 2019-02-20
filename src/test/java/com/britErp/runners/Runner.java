package com.britErp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        features = "src/test/resources/features",
        glue = "com/britErp/step_definitions",
        tags = ""
)
public class Runner {
}
