package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import searchpage.Searchpage;

public class Searchsteps {

    Searchpage page= new Searchpage();

    @Given("user is on CV Library web page")
    public void user_is_on_cv_library_web_page() {
        String actual= page.geturl();
        Assert.assertThat(actual, Matchers.endsWith("library.co.uk/"));

    }
    @When("user accepts cookies")
    public void user_accepts_cookies() {page.setCookies();}

    @When("User searches for {string} jobs in jobtitle")
    public void user_searches_for_jobs_in_jobtitle(String string) {page.setJobtitle(string);

    }

    @When("user searches for {string} in location")
    public void user_searches_for_in_location(String string) {page.setLocation(string);

    }

    @When("user selects  miles in distance")
    public void user_selects_miles_in_distance() {page.setDistance();}

    @When("user clicks on findjobs")
    public void user_clicks_on_findjobs() {page.setFindjobs();

    }

    @Then("user verifies Software Tester jobs in London")
    public void user_verifies_software_tester_jobs_in_london() {
        String actual= page.settext();
        Assert.assertEquals("Software Tester jobs in London",actual);

    }
}

