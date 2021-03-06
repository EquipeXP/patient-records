package com.unicamp.serenityTests.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.hamcrest.core.IsEqual;

import com.unicamp.serenityTests.pages.InsertPatientPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class IncludePatientSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	
	InsertPatientPage insertPatientPage;

	@Step
	public void is_on_the_new_patient_page() {
		insertPatientPage.open();
	}
	
	@Step
	public void insertName(String name) {
		insertPatientPage.typeName(name);
	}

	@Step
	public void insertPhoneNumber(String phoneNumber) {
		insertPatientPage.typePhone(phoneNumber);
	}

	@Step
	public void selectGender(String gender) {
		insertPatientPage.chooseGender(gender);
	}

	@Step
	public void insertBirthDate(String birthDate) {
		insertPatientPage.typeBirthDate(birthDate);
	}

	@Step
	public void insertAddress(String address) {
		insertPatientPage.typeAddress(address);
	}

	@Step
	public void selectMaritalState(String maritalState) {
		insertPatientPage.chooseMaritalStatus(maritalState);
	}

	@Step
	public void selectRace(String race) {
		insertPatientPage.chooseBreed(race);
	}

	@Step
	public void selectEthnicity(String ethnicity) {
		insertPatientPage.chooseEthnicity(ethnicity);
	}

	@Step
	public void saveForm() {
		insertPatientPage.clickOnSave();
	}

	@Step
	public void cancelForm() {
		insertPatientPage.clickOnCancel();
	}

	@Step
	public void fillForm(String name, String phone, String gender,String birth,
			String address,String maritalstatus,String breed,String ethinicity) {

		insertName(name);
		insertPhoneNumber(phone);
		selectGender(gender);
		insertBirthDate(birth);
		insertAddress(address);
		selectMaritalState(maritalstatus);
		selectRace(breed);
		selectEthnicity(ethinicity);
	}

	@Step
	public void insert_data(String name, String phoneNumber, String gender,
			String birthDate, String address, String maritalState, String race,
			String ethnicity) {

		fillForm(name, phoneNumber, gender, birthDate, address, maritalState,
				race, ethnicity);
		saveForm();
	}
	
	@Step
	public void shoudlSeeMessage(String message) {
		assertThat("Message was on screen", insertPatientPage.getMessage().equals(message));
	}

}
