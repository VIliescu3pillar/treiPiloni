package com.treiPiloni.testing.Utils;

/**
 * Created by vlad.iliescu on 07/06/2017.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java",
glue = {"com.treiPiloni.testing.Steps", "com.treiPiloni.testing.Utils"})
public class RunCukesTest {}