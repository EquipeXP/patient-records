package com.unicamp.serenityTests.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.StartSOAPESteps;

public class M2F3US1DefinitionSteps {

	@Steps
	StartSOAPESteps startSOAPESteps;
	
	//@Given("User is on the Search Page")
	@Given("User is at Search Page")
	public void givenTheUserIsOnTheSearchPage(@Named("user") String user) {
		startSOAPESteps.isOnTheSearchPage();
	}
	
	@When("mode Start Soape for '$user' is clicked")
	public void whenModeStartSOAPEforUserIsClicked(@Named("user") String user) {
		startSOAPESteps.clickModeStartSOAPEForUser(user);
	}
	
	@Then("Start Soape mode opens for '$user'")
	public void thenStartSOAPEModeOpensForUser(@Named("user") String user) {
		startSOAPESteps.shouldSeeSOAPEModeForUser(user);
	}	
}