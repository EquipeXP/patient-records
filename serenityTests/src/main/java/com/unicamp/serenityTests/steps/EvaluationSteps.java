package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;

import com.unicamp.serenityTests.pages.SOAPEPage;

import net.thucydides.core.annotations.Step;

public class EvaluationSteps {
	private static final long serialVersionUID = 1L;
	
	SOAPEPage soapePage;
	
	@Step
	public void is_on_the_consultation_page(String patientId) {
		soapePage.open();
		soapePage.enterConsultationPage(patientId);
	}
	
	@Step
	public void is_on_the_evaluation_tab() {
		soapePage.assertTab("ANALISE");
	}
	
	@Step
	public void insertDisease(String disease) {
		soapePage.typeDisease(disease);
	}
	
	@Step
	public void insertType(String type) {
		soapePage.chooseType(type);
	}
	
	@Step
	public void insertComment(String comment) {
		soapePage.typeComment(comment);
	}
	
	@Step
	public void fillForm(String disease, String type, String comment) {
		this.insertDisease(disease);
		this.insertType(type);
		this.insertComment(comment);
	}
	
	@Step
	public void saveForm() {
		this.soapePage.clickOnSave();
	}
	
	@Step
	public void cancelForm() {
		this.soapePage.clickOnCancel();
	}

	@Step
	public void fillFormMissingData(String disease, String type, String comment) {
		// TODO Auto-generated method stub
		
	}
	
	@Step
	public void shoudlSeeMessage(String message) {
		assertThat("Message was on screen", soapePage.getMessage().equals(message));
	}

}
