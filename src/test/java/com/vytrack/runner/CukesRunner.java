package com.vytrack.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        //this plugin for html report under target folder.
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"},
        features ="src\\test\\resources/",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
