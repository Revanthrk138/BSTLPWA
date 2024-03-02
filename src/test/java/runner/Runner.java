package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(glue ="steps", features={"/Users/139srk/eclipse-workspace/BSTLBDDCUCUMBERFRAMWORK/src/test/resources/features/regression/Rewardcart.feature"}
, dryRun=false,
  monochrome = true,
  stepNotifications=true
  ,  plugin = {
          "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" , "pretty" ,"html:target/report/report.html",
})            
// glue will attach the all cucumber steps & dry run only run which don't have steps
public class Runner {

}
