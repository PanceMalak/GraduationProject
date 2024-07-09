package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources" ,
        glue = "steps",                     //searching field
        plugin = {"pretty",                 //for creating report
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@Smoke"  //this means that @smoke will run all the +ve scenrios in alla features in the project that tagged with it
)

public class Runner {
}

