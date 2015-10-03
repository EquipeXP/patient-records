package com.unicamp.serenityTests.steps;

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
        assertThat(dictionaryPage.getPatients(), hasItem(containsString(patient)));
    }

    @Step
    public void is_the_main_page() {
        dictionaryPage.open();
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
}