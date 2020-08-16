package stepDefinitions;

import implementation.ImplementationClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsletterSubscribe extends ImplementationClass{

	

@When("you are scrolled down and click on textbox")
public void you_are_scrolled_down_and_click_on_textbox() {
 ImplementationClass.ScrollDown();
}

@When("Enter a valid email address")
public void enter_a_valid_email_address() throws InterruptedException {
	ImplementationClass.Insertemail();
    // Write code here that turns the phrase above into concrete actions
}

@When("Clicked on Inspir me")
public void clicked_on_inspir_me() throws InterruptedException {
	ImplementationClass.InspireMeClick();
    // Write code here that turns the phrase above into concrete actions
}

@Then("A confirmation message appear that you are checked In!")
public void a_confirmation_message_appear_that_you_are_checked_in() {
	ImplementationClass.ValidateCheckIn();
    // Write code here that turns the phrase above into concrete actions
}


@When("Enter an invalid email address")
public void enter_an_invalid_email_address() throws InterruptedException {
ImplementationClass.Insertinvalidemail();
}

@When("Clicked on Inspire me")
public void clicked_on_inspire_me() throws InterruptedException {
ImplementationClass.InspireMeClick();
}



@Then("Error Message displayed")
public void error_message_displayed() {
	ImplementationClass.ValidateErrorMessage();
    // Write code here that turns the phrase above into concrete actions
}


}
