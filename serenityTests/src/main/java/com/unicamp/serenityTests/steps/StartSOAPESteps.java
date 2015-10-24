package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.hamcrest.core.IsEqual;

import com.unicamp.serenityTests.pages.SOAPEPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class StartSOAPESteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	SOAPEPage SOAPEPg;

	@Step
	public void isOnTheSearchPage() {
		SOAPEPg.open();
	}

	@Step
	public void clickModeStartSOAPEForUser(String patient) {
		getDriver().findElements()
		// TODO Auto-generated method stub
		
		
	}

	@Step
	public void shouldSeeSOAPEModeForUser(String patient){
		// TOFIX
		assert(onPage().getDriver().getCurrentUrl() == "http://localhost:8080/#/consultation/new/..." );		
	}
	
	@Step
	public void is_on_the_user_consultation_page(Integer id) {
		
		SOAPEPg.openAt("http://localhost:8080/#/consultation/new/" + id);
	}

	@Step
	public void header_should_have_patient_information(String name, String birthdate, String gender, String maritalStatus) {
		
		assertThat("Patient name is on screen", SOAPEPg.getPatientNameFromHeader().equals(name));
		assertThat("Patient birth date is on screen", SOAPEPg.getPatientBirthDateFromHeader().equals(birthdate));
		assertThat("Patient gender is on screen", SOAPEPg.getPatientGenderFromHeader().equals(gender));
		assertThat("Patient marital status is on screen", SOAPEPg.getPatientMaritalStatusFromHeader().equals(maritalStatus));
	}
}
