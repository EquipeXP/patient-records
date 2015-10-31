package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.unicamp.serenityTests.pages.SOAPEPage;

public class StartSOAPESteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	SOAPEPage SOAPEPg;

	@Step
	public void isOnTheSearchPage() {
		SOAPEPg.open();
	}

	@Step
	public void clickModeStartSOAPEForUser(String patient) {
		assertThat("Wrong Patient", patient.equals("Vladmir Putin"));
		SOAPEPg.enterConsultationPage("666");
	}
	
	@Step
	public void shouldSeeSOAPEModeForUser(String patient){
		assertThat("Wrong Patient", patient.equals("Vladmir Putin"));
		assertThat("Wrong User page", onPage().getDriver().getCurrentUrl() == "http://localhost:8080/#/consultation/new/" + "666/");		
	}

	@Step
	public void is_on_the_user_consultation_page(Integer id) {
		SOAPEPg.openAt("http://localhost:8080/#/consultation/new/" + id);
	}

	public void isOnMainComplaiantTab() {
		SOAPEPg.openAt("");
	}

	public void insertComplaiant(String complaiant) {
		SOAPEPg.insertComplaiant(complaiant);
	}

	public void shouldSeeMessage(String message) {
		assertThat("Patient name is on screen", SOAPEPg.getInsertComplaiantMessage().equals(message));
	}

	public void doesNotFillComplaiant() {
		SOAPEPg.doesNotFillComplaiant();
		// TODO Auto-generated method stub
		
	}

	public void mainComplaiantShouldHave(String complaiant) {
		// TODO Auto-generated method stub (something in database)	
	}

}
