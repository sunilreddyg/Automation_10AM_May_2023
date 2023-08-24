package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resource/features/background.feature",glue="stepdefination",monochrome=true,dryRun=false)
public class JunitRunner 
{

}
