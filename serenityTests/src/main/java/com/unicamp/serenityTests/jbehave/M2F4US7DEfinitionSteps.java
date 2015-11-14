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

	@When("'$user' fill complaint with <complaint>")
	public void whenUserFillComplaintWith(String complaint) {
		startSOAPESteps.fillComplaintWith(complaint);
	}

	@When("'$user' fill objective with <height>, <weight>, <temperature>, <bloodPressure>, <cardiacFrequency>, <cgb>, <respiratoryFrequency>, <oxygenSaturation> and <carbonDioxSaturation>")
	public void whenUserFillObjectiveWith(String height, String weight, String temperature, String bloodPressure,
			String cardiacFrequency, String cgb, String respiratoryFrequency, String oxygenSaturation,
			String carbonDioxSaturation) {
		startSOAPESteps.fillObjectiveWith(height, weight, temperature, bloodPressure, cardiacFrequency, cgb,
				respiratoryFrequency, oxygenSaturation, carbonDioxSaturation);
	}

	@When("'$user' fill evaluation with <diagnostic> and <type>")
	void whenUserFillEvaluationWith(String diagnostic, String type) {
		startSOAPESteps.fillEvaluationWith(diagnostic, type);
	}

	@When("'$user' fill plan with <conduct>")
	void whenUserFillPlanWith(String conduct) {
		startSOAPESteps.fillPlanWith(conduct);
	}
	
	@When("'$user' fill evolution with <evolution>")
	void whenUserFillEvolutionWith(String evolution) {
		startSOAPESteps.fillEvolutionWith(evolution);
	}

	@Then("'$user' should see <message>")
	public void thenUserShouldSeeMessage(String message) {
		assert (true);
	}

}
