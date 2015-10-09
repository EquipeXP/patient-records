package com.unicamp.serenityTests.steps;

import com.unicamp.serenityTests.pages.MainPepPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class IncludePatientSteps extends ScenarioSteps {

	MainPepPage mainPepPage;

	@Step
	public void insertName(String name) {
		mainPepPage.typeName(name);
	}

	@Step
	public void insertPhoneNumber(String phoneNumber) {
		mainPepPage.typePhone(phoneNumber);
	}

	@Step
	public void selectGender(String gender) {
		mainPepPage.chooseGender(gender);
	}

	@Step
	public void insertBirthDate(String birthDate) {
		mainPepPage.typeBirthDate(birthDate);
	}

	@Step
	public void insertAddress(String address) {

	}

	@Step
	public void selectMaritalState(String maritalState) {

	}

	@Step
	public void selectRace(String race) {

	}

	@Step
	public void selectEthnicity(String ethnicity) {

	}

	@Step
	public void saveForm() {

	}

	@Step
	public void cancelForm() {

	}

	@Step
	public void fillForm(String name, String phoneNumber, String gender,
			String birthDate, String address, String maritalState, String race,
			String ethnicity) {

		insertName(name);
		insertPhoneNumber(phoneNumber);
		selectGender(gender);
		insertBirthDate(birthDate);
		insertAddress(address);
		selectMaritalState(maritalState);
		selectRace(race);
		selectEthnicity(ethnicity);
	}

	@Step
	public void insert_data(String name, String phoneNumber, String gender,
			String birthDate, String address, String maritalState, String race,
			String ethnicity) {

		fillForm(name, phoneNumber, gender, birthDate, address, maritalState,
				race, ethnicity);
		saveForm();
	}

}
