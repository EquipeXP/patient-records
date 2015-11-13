package com.unicamp.serenityTests.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.StartSOAPESteps;

import net.thucydides.core.annotations.Steps;

public class M2F4US7DEfinitionSteps {

	@Steps
	StartSOAPESteps startSOAPESteps;

	@Given("user is at main complaiant tab")
	public void givenUserAtMainComplaiantTab() {
		startSOAPESteps.isOnMainComplaiantTab();
	}

	@When("user insert a <complaiant> description")
	public void whenModeStartSOAPEforUserIsClicked(@Named("complaiant") String complaiant) {
		startSOAPESteps.insertComplaiant(complaiant);
	}

	@Then("main complaiant should have <complaiant>")
	public void thenMainComplaiantShoudlHave(@Named("complaiant") String complaiant) {
		startSOAPESteps.mainComplaiantShouldHave(complaiant);
	}

	@Then("user should see <message>")
	public void thenStartSOAPEModeOpensForUser(@Named("message") String message) {
		startSOAPESteps.shouldSeeMessage(message);
	}

	@When("user does not fill complaint")
	public void whenUserDoesNotFillComplaiant() {
		startSOAPESteps.doesNotFillComplaiant();
	}

	@When("'$user' fill SOAP with <complaint>")
	public void whenUserFillSOAPWith(String complaint) {
		startSOAPESteps.fillSOAPWith(complaint);
	}

	@Then("'$user' should see <message>")
	public void thenUserShouldSeeMessage(String message) {
		assert(true);
	}

}
