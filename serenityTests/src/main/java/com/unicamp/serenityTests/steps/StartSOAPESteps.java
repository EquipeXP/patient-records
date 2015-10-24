package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.hamcrest.core.IsEqual;

import com.unicamp.serenityTests.pages.SOAPEPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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
}
