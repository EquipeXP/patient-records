package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.hamcrest.core.IsEqual;

import com.unicamp.serenityTests.pages.InsertPatientPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class StartSOAPESteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	SOAPEPage SOAPEPg;

	@Step
	public void isOnTheSearchPage() {
		// TODO Auto-generated method stub
		
	}

	@Step
	public void clickModeStartSOAPEForUser(String user) {
		// TODO Auto-generated method stub
		
	}

	@Step
	public void shouldSeeSOAPEModeForUser(String user) {
		// TODO Auto-generated method stub
		
	}

	
	@Step
	public void is_on_the_user_consultation_page(Integer id) {
		
	}

	@Step
	public void header_should_have_patient_information(String name, String birthdate, String gender, String maritalStatus) {
		
	}

}
