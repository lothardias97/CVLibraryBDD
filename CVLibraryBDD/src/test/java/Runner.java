import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(

        features = "C:\\Users\\DELL\\Downloads\\CVLibrary.com\\CVLibraryBDD\\src\\test\\resources\\search.feature",
        tags = "@smoke",
        glue = {"hooks","steps"},
        plugin ={"pretty","json:target/cucumber-reports/reports.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "html:target/cucumber-reports/reports2.html"})




public class Runner {
}
