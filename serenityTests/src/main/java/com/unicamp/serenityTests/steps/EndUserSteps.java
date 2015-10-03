package com.unicamp.serenityTests.steps;

import junit.framework.Assert;

import com.unicamp.serenityTests.pages.MainPepPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


public class EndUserSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	MainPepPage dictionaryPage;

	@Step
	public void should_see_patient(String patient) {
		assertThat(dictionaryPage.getPatients(),
				hasItem(containsString(patient)));
	}

	@Step
	public void is_the_main_page() {
		dictionaryPage.open();
	}

	@Step
	public void check_patient_registered(String patient) {
		Assert.assertTrue(is_patient_registered(patient));
	}

	@Step
    public void check_patient_not_registered(String patient){
		Assert.assertFalse(is_patient_registered(patient));
    }

	@Step
	public void insert_data(String name, String telephone, String admGender,
			String birthTime, String address, String maritalState,
			String breed, String ethnicity) {
		;
	}

	@Step
	public void should_see_msg(String message) {
		;
	}

	private boolean is_patient_registered(String patient) {
		return true;
	}
}