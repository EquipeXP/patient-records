package com.unicamp.serenityTests.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.IncludePatientSteps;

import net.thucydides.core.annotations.Steps;

public class M1F2US1DefinitionSteps {
	
	@Steps
	IncludePatientSteps includePatientSteps;

	@Given("'$user' is on the new patient page")
	public void givenTheUserIsOnTheNewPatientPage(@Named("user") String user) {
		includePatientSteps.is_on_the_new_patient_page();
	}
	
	@When("<name>, <phone>, <gender>, <birth>, <address>, <maritalstatus>, <breed> and <ethinicity> are given")
	public void whenDemographicDataIsInputed(@Named("name") String name, @Named("phone") String phone,
			@Named("gender") String gender, @Named("birth") String birth, @Named("address") String address,
			@Named("maritalstatus") String maritalstatus,@Named("breed") String breed, 
			@Named("ethinicity") String ethinicity) {
		
		includePatientSteps.fillForm(name, phone, gender, birth, address, maritalstatus, breed, ethinicity);
		includePatientSteps.saveForm();
	}
	
	@When("'$secretary' tries to register '$patient'")
	public void whenSecretaryTriesToRegister(@Named("secretary") String secretary, 
			@Named("patient") String patient) {

	}
	
	@Then("An $alert should appear")
	public void thenAnAlertShouldAppear(String alert){
		includePatientSteps.shoudlSeeMessage(alert);
	}
	
	@Then("The patient shouldn't be registered")
	public void thenPatientShouldntBeRegistered(){
		
	}
	
	@Then("an input on auditing system is added")
	public void thenAnInputToAuditIsAdded(){
		
	}

	@Then("A Auditory log is created")
	public void thenAAuditoryLogIsCreated() {
//		includePatientSteps.check_log_created();
	}
}
