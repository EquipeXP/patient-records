package com.unicamp.serenityTests.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.SearchSteps;
import com.unicamp.serenityTests.steps.IncludePatientSteps;

public class M1F4US1DefinitionSteps {

	@Steps
	SearchSteps endUser;
	
	@Given("the user is on the PEP main page")
	public void givenTheUserIsOnThePEPMainPage() {
		endUser.is_the_main_page();
	}

	@When("the user looks at the page")
	public void whenTheUserLooksAtThePage() {

	}

	@Then("they should see the patient '$patient'")
	public void thenTheyShouldSeeThePatient(String patient) {
		endUser.should_see_patient(patient);
	}

}
