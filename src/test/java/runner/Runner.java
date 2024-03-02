package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(glue="steps", features="src/test/resources/features/regression/ValidateLogin.feature"
, dryRun=false,
  tags="@regression",
  monochrome = true,
  stepNotifications=true)            
// glue will attach the all cucumber steps & dry riun only run whoch don't have steps
public class RegressionRunner {

}
