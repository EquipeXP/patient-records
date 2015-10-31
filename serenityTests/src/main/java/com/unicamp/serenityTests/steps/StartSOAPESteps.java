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
	public void isOnUserConsultationPage(Integer id) {
		SOAPEPg.openAt("http://localhost:8080/#/consultation/new/" + id);
	}

	@Step
	public void isOnMainComplaiantTab() {
		SOAPEPg.openAt("");
	}

	@Step
	public void insertComplaiant(String complaiant) {
		SOAPEPg.insertComplaiant(complaiant);
	}

	@Step
	public void shouldSeeMessage(String message) {
		assertThat("Message is on screen", SOAPEPg.getInsertComplaiantMessage().equals(message));
	}

	@Step
	public void doesNotFillComplaiant() {
		SOAPEPg.doesNotFillComplaiant();
	}

	@Step
	public void mainComplaiantShouldHave(String complaiant) {
		// TODO Auto-generated method stub (something in database)	
	}

	@Step
	public void headerShouldHavePatientInfo(String name, String birthdate, String gender, String maritalStatus) {
		assertThat("Patient name is on screen", SOAPEPg.getPatientNameFromHeader().equals(name));
		assertThat("Patient birthdate is on screen", SOAPEPg.getPatientBirthDateFromHeader().equals(birthdate));
		assertThat("Patient gender is on screen", SOAPEPg.getPatientGenderFromHeader().equals(gender));
		assertThat("Patient marital status is on screen", SOAPEPg.getPatientMaritalStatusFromHeader().equals(maritalStatus));	
	}

}
