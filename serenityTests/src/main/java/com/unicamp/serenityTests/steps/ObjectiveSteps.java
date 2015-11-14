package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;

import com.unicamp.serenityTests.pages.SOAPEPage;

import net.thucydides.core.annotations.Step;

public class ObjectiveSteps {
	private static final long serialVersionUID = 1L;
	
	SOAPEPage soapePage;

	@Step
	public void is_on_consultation_page(String patientId) {
		soapePage.open();
		soapePage.enterConsultationPage(patientId);
	}

	@Step
	public void is_at_objective_data_tab() {
		soapePage.assertTab("OBJETIVO");
		
	}
	
	@Step
	public void insertGlycemia(String glycemia) {
		soapePage.typeGlycemia(glycemia);		
	}

	@Step
	public void insertSco(String sco) {
		soapePage.typeSco(sco);
		
	}

	@Step
	public void insertSo(String so) {
		soapePage.typeSo(so);
	}

	@Step
	public void insertFr(String fr) {
		soapePage.typeFr(fr);
	}

	@Step
	public void insertBpm(String bpm) {
		soapePage.typeBpm(bpm);
	}

	@Step
	public void insertDiastolic(String diastolic) {
		soapePage.typeDiastolic(diastolic);
	}

	@Step
	public void insertSystolic(String systolic) {
		soapePage.typeSystolic(systolic);
	}

	@Step
	public void insertTemperature(String temperature) {
		soapePage.typeTemperature(temperature);
	}

	@Step
	public void insertWeight(String weight) {
		soapePage.typeWeight(weight);
	}

	@Step
	public void insertHeight(String height) {
		soapePage.typeHeight(height);
	}

	@Step
	public void fillForm(String height, String weight, String temperature,
			String systolic, String diastolic, String bpm, String fr,
			String so, String sco, String glycemia) {
		this.insertHeight(height);
		this.insertWeight(weight);
		this.insertTemperature(temperature);
		this.insertSystolic(systolic);
		this.insertDiastolic(diastolic);
		this.insertBpm(bpm);
		this.insertFr(fr);
		this.insertSo(so);
		this.insertSco(sco);
		this.insertGlycemia(glycemia);
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
	public void shouldSeeMessage(String message) {
		assertThat("Message was on screen", soapePage.getMessage().equals(message));
	}

	@Step
	public void fillFormMissingData() {
		// TODO Auto-generated method stub
		
	}

}
