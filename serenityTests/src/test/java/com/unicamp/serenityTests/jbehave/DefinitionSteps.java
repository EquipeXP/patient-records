package com.unicamp.serenityTests.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.EndUserSteps;

public class DefinitionSteps {

	@Steps
	EndUserSteps endUser;

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
	
	
	/**********************************************************************/
	@When("user insert data '$name', '$telephone',  '$admGender', '$birthTime', '$address', '$maritalState', '$breed' and '$ethnicity'")
	public void whenUserInsertData(String name, int telephone,
			String admGender, String birthTime, String address,
			String maritalState, String breed, String ethnicity) {
		endUser.insert_data(name, telephone, admGender, birthTime, address,
				maritalState, breed, ethnicity);
	}
    
    @Then("user should see '$message'")
	public void thenUserShouldSee(String message) {
		endUser.should_see_msg(message);
	}
    
    /**********************************************************************/
    @Given("Patient '$patient' is registered in the system")
    public void givenThePatientIsRegistered() {
    	endUser.check_patient_registered();
    }

    @When("'$name', '$phone', '$gender', '$birth', '$address', '$maritalStatus', '$breed' and '$ethinicity' are given")
    public void whenDemographicDataIsInputed(String name, int telephone,
			String admGender, String birthTime, String address,
			String maritalState, String breed, String ethnicity) {
    	endUser.insert_data(name, telephone, admGender, birthTime, address,
				maritalState, breed, ethnicity);
    }

    @Then("The following '$alert' should appear warning about a possible duplicated entry")
    public void thenAnAlertShouldApear(String alert) {
    	endUser.should_see_msg(alert);
    }
    
    /**********************************************************************/
    @Given ("Patient '$patient' is registered in the system")
    public void givenThePatientIsntRegistered(String patient){
    	endUser.check_patient_not_registered();
    }
    
    @When("Secretary tries to register Patient")
    public void whenSecretaryTriesToRegister(){
    
    }
    
    @Then("A Auditory log is created")
    public void thenAAuditoryLogIsCreated(){
    	endUser.check_log_created();
    }


}
