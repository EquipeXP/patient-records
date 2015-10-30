package com.unicamp.serenityTests.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.StartSOAPESteps;

import net.thucydides.core.annotations.Steps;

public class M2F1US1DefinitionSteps {

	@Steps
	StartSOAPESteps steps;

	@Given("'$user' is on the patient <id> consultation page")
	public void givenTheUserIsOnPatientConsultationPage(@Named("id") Integer id) {

		steps.is_on_the_user_consultation_page(id);
	}

	@When("'$user' sees header")
	public void whenUserSeesHeader(){
		
	}

	@Then("'$user' should see <name>, <birthdate>, <gender>, <maritalStatus>")
	public void therUserShouldSee(@Named("name") String name, @Named("birthdate") String birthdate,
			@Named("gender") String gender, @Named("maritalStatus") String maritalStatus) {

		//steps.header_should_have_patient_information(name, birthdate, gender, maritalStatus);
	}

}
