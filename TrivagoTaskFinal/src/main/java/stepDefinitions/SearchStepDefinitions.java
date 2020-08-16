package stepDefinitions;

import implementation.ImplementationClass;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions extends ImplementationClass {
	//S1 calling OpenChrome function from ImplementationClass 
	@Given("https:\\/\\/magazine.trivago.com\\/ is running")
	public void https_magazine_trivago_com_is_running() throws InterruptedException {
		ImplementationClass.OpenChrome();

	}
	//S1 calling ClickonSearchicon from ImplementationClass 
	@When("I click on search icon")
	public void i_click_on_search_icon() {
		ImplementationClass.ClickonSearchicon();
	}
	//S1 calling EnterTextOnSearch function from ImplementationClass 
	@And("write country name and click Enter")
	public void write_country_name_and_click_Enter() throws InterruptedException {
		ImplementationClass.EnterTextOnSearch();
	}
	//S1 calling ValidateSearchResults function from ImplementationClass 
	@Then("results related to country name will be displayed.")
	public void results_related_to_country_name_will_be_displayed() throws InterruptedException {
		ImplementationClass.ValidateSearchResults();
	}
	//S2 calling Clearbox function from ImplementationClass 
	@Given("Searchbox is opened and empty.")
	public void searchbox_is_opened_and_empty() {
		ImplementationClass.Clearbox();
	}

	//S2 calling Typebox function from ImplementationClass 
	@When("I enter invalid country name.")
	public void i_enter_invalid_country_name() {
		ImplementationClass.Typebox();

	}

	//S2 calling ValidateNegativeSearch function from ImplementationClass 
	@Then("I get No Results related in the search page.")
	public void i_get_no_results_related_in_the_search_page() throws InterruptedException {
		ImplementationClass.ValidateNegativeSearch();
	}

}
