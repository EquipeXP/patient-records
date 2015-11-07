package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;

import com.unicamp.serenityTests.pages.EvaluateDiseasePage;

import net.thucydides.core.annotations.Step;

public class IncludeEvaluationSteps {
	private static final long serialVersionUID = 1L;
	
	EvaluateDiseasePage evaluateDiseasePage;
	
	@Step
	public void is_on_the_evaluation_page() {
		evaluateDiseasePage.open();
	}
	
	@Step
	public void insertDisease(String disease) {
		evaluateDiseasePage.typeDisease(disease);
	}
	
	@Step
	public void insertType(String type) {
		evaluateDiseasePage.chooseType(type);
	}
	
	@Step
	public void insertComment(String comment) {
		evaluateDiseasePage.typeComment(comment);
	}
	
	@Step
	public void fillForm(String disease, String type, String comment) {
		this.insertDisease(disease);
		this.insertType(type);
		this.insertComment(comment);
	}
	
	@Step
	public void saveForm() {
		this.evaluateDiseasePage.clickOnSave();
	}
	
	@Step
	public void cancelForm() {
		this.evaluateDiseasePage.clickOnCancel();
	}

	@Step
	public void fillFormMissingData(String disease, String type, String comment) {
		// TODO Auto-generated method stub
		
	}
	
	@Step
	public void shoudlSeeMessage(String message) {
		assertThat("Message was on screen", evaluateDiseasePage.getMessage().equals(message));
	}

}
