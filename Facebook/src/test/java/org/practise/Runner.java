package org.practise;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Facebook\\src\\test\\resources\\Feature\\Facebook.Feature", glue ="org.steps")
public class Runner {

}

