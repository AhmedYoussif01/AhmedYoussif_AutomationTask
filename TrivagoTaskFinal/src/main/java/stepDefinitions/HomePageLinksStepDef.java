package stepDefinitions;

import implementation.ImplementationClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageLinksStepDef extends ImplementationClass {

	// calling OpenChrome function from ImplementationClass
	@Given("https:\\/\\/room5.trivago.com\\/ is running")
	public void https_magazine_trivago_com_is_running() throws InterruptedException {
		ImplementationClass.OpenChrome();

		// Write code here that turns the phrase above into concrete actions
	}

	// calling FindandClick function from ImplementationClass
	@When("I scroll down and click on any link at Homepage")
	public void i_scroll_down_and_click_on_any_link_at_homepage() throws InterruptedException {
		ImplementationClass.FindandClick();
	}
/*
	// calling validate page change function from ImplementationClass
	@Then("Page url should be changed to reflect new page opened.")
	public void page_url_should_be_changed_to_reflect_new_page_opened() {

		ImplementationClass.Validatepagechange();
	}*/
}
