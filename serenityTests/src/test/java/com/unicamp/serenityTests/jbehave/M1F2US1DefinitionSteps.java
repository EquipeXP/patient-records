package com.unicamp.serenityTests.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.IncludePatientSteps;

public class M1F2US1DefinitionSteps {
	
	IncludePatientSteps includePatientSteps;

	/**********************************************************************/
	@Given("Patient '$patient' is not registered in the system")
	public void givenPatientIsNotRegistered(String patient) {

	}

	@When("user insert data '$name', '$telephone',  '$admGender', '$birthTime', '$address', '$maritalState', '$breed' and '$ethnicity'")
	public void whenUserInsertData(String name, String telephone,
			String admGender, String birthTime, String address,
			String maritalState, String breed, String ethnicity) {
		includePatientSteps.insert_data(name, telephone, admGender, birthTime,
				address, maritalState, breed, ethnicity);
	}

	@Then("user should see '$message'")
	public void thenUserShouldSee(String message) {
		includePatientSteps.shoudlSeeMessage(message);
	}

	/**********************************************************************/
	@Given("Patient '$patient' is registered in the system")
	public void givenThePatientIsRegistered(String patient) {
//		includePatientSteps.check_patient_registered(patient);
	}

	@When("'$name', '$phone', '$gender', '$birth', '$address', '$maritalStatus', '$breed' and '$ethinicity' are given")
	public void whenDemographicDataIsInputed(String name, String telephone,
			String admGender, String birthTime, String address,
			String maritalState, String breed, String ethnicity) {
		includePatientSteps.insert_data(name, telephone, admGender, birthTime, address,
				maritalState, breed, ethnicity);
	}

	@Then("The following '$alert' should appear warning about a possible duplicated entry")
	public void thenAnAlertShouldApear(String alert) {
		includePatientSteps.shoudlSeeMessage(alert);
	}

	/**********************************************************************/
	@Given("Patient '$patient' is not registered in the system")
	public void givenThePatientIsntRegistered(String patient) {
//		includePatientSteps.check_patient_not_registered(patient);
	}

	@When("Secretary tries to register Patient")
	public void whenSecretaryTriesToRegister() {

	}

	@Then("A Auditory log is created")
	public void thenAAuditoryLogIsCreated() {
//		includePatientSteps.check_log_created();
	}

	/**********************************************************************/
	// Este @Given eh o mesmo do Cenario acima !
	@When("One of the following data: $name, $phone, $gender, $birth, $address, $maritalStatus, $breed and $ethinicity is missing")
	public void whenDataIsMissing(String name, int telephone, String admGender,
			String birthTime, String address, String maritalState,
			String breed, String ethnicity) {

//		includePatientSteps.check_empty_data(name, telephone, admGender, birthTime,
//				address, maritalState, breed, ethnicity);
	}

}