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

	public void isRecepcionist(String string) {
		// TODO Auto-generated method stub
		
	}

	public void isDoctor(String string) {
		// TODO Auto-generated method stub
		
	}

	public void isOpen(String nome) {
		// TODO Auto-generated method stub
		
	}

	public void selectField(String string, String dados_Clinicos) {
		// TODO Auto-generated method stub
		
	}

	public void selectProfile(String string, String nome) {
		// TODO Auto-generated method stub
		
	}

	public void showDemographicPage(String nome, String telefone,
			String generoAdm, String horNasc, String end, String estado_Civil,
			String race, String etnia) {
		// TODO Auto-generated method stub
		
	}

}