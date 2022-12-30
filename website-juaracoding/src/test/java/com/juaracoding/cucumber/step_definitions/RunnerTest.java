package com.juaracoding.cucumber.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {
//        		"src/main/resources/features/03.Testimonial.feature",
//        		"src/main/resources/features/04.TestimonialSearch.feature",
        		"src/main/resources/features/05.TestimonialEdit.feature",
//        		"src/main/resources/features/07.RincianBiayaSearch.feature"
        		},
        glue = "com.juaracoding.cucumber.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
