package com.unicamp.serenityTests.pages;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://localhost:8080/#/")
public class SOAPEPage extends PageObject {

	public void enterConsultationPage(String patientId) {

		WebElementFacade tbody = find(By.tagName("tbody"));
		List<WebElement> trs = tbody.findElements(By.tagName("tr"));

		WebElement actionContainer = null;

		for (WebElement tr : trs) {
			List<WebElement> tds = tr.findElements(By.tagName("td"));
			if (tds.get(0).getText().equals(patientId)) {
				actionContainer = tds.get(tds.size() - 1);
				break;
			}
		}

		assertThat("Fucking thing", actionContainer != null);

		WebElement actionButton = actionContainer.findElement(By.tagName("span"));
		actionButton.click();
	}

	public void assertTab(String tab) {

		switch (tab) {
		case "SUBJETIVO":
            find(By.id("subjective_tab")).findElement(By.tagName("a")).click();
			break;

		case "OBJETIVO":
            find(By.id("objective_tab")).findElement(By.tagName("a")).click();
			break;

		case "ANALISE":
            find(By.id("analysis_tab")).findElement(By.tagName("a")).click();
			break;

		case "PLANO":
            find(By.id("plan_tab")).findElement(By.tagName("a")).click();
			break;

		case "EVOLUCAO":
            find(By.id("evolution_tab")).findElement(By.tagName("a")).click();
			break;
		}
	}

	public String getPatientNameFromHeader() {
		WebElement name = find(By.id("patient_name"));
		return name.getText();
	}

	public String getPatientBirthDateFromHeader() {
		WebElement birthDate = find(By.id("patient_birthDate"));
		return birthDate.getText();
	}

	public String getPatientGenderFromHeader() {
		WebElement gender = find(By.id("patient_genderAdm"));
		return gender.getText();
	}

	public String getPatientMaritalStatusFromHeader() {
		WebElement maritalStatus = find(By.id("patient_maritalStatus"));
		return maritalStatus.getText();
	}

	public void insertComplaiant(String complaiant) {
		// TODO Auto-generated method stub

	}

	public Object getInsertComplaiantMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void doesNotFillComplaiant() {
		// TODO Auto-generated method stub

	}
	
	/* ---------------------------------------------------------------------- */
	/* OBJECTIVE TAB -------------------------------------------------------- */
	/* ---------------------------------------------------------------------- */
	public void typeGlycemia(String glycemia) {
		WebElementFacade value = find(By.id("objective_glycemic_level"));
		value.type(glycemia);
	}

	public void typeSco(String sco) {
		WebElementFacade value = find(By.id("objective_carbon_dioxide_level"));
		value.type(sco);
	}

	public void typeSo(String so) {
		WebElementFacade value = find(By.id("objective_oxigen_level"));
		value.type(so);
	}

	public void typeFr(String fr) {
		WebElementFacade value = find(By.id("objective_respiratory_rate"));
		value.type(fr);
	}

	public void typeBpm(String bpm) {
		WebElementFacade value = find(By.id("objective_heart_rate"));
		value.type(bpm);
	}

	public void typeDiastolic(String diastolic) {
		WebElementFacade value = find(By.id("objective_pressure_2"));
		value.type(diastolic);
	}

	public void typeSystolic(String systolic) {
		WebElementFacade value = find(By.id("objective_pressure_1"));
		value.type(systolic);
	}

	public void typeTemperature(String temperature) {
		WebElementFacade value = find(By.id("objective_temperature"));
		value.type(temperature);
	}

	public void typeWeight(String weight) {
		WebElementFacade value = find(By.id("objective_weight"));
		value.type(weight);
	}

	public void typeHeight(String height) {
		WebElementFacade value = find(By.id("objective_height"));
		value.type(height);
	}

	public void fillComplaint(String complaint) {
		// TODO Auto-generated method stub
		WebElement complaintTab = find(By.id("subjective_tab"));
		complaintTab.click();
		WebElement complaintTextArea = find(By.id("main_complaint"));
		complaintTextArea.sendKeys(complaint);
	}

	public void saveSOAP() {
		WebElement saveButton = find(By.id("saveButton"));
		saveButton.click();
	}

	/* ---------------------------------------------------------------------- */
	/* EVALUATION TAB ------------------------------------------------------- */
	/* ---------------------------------------------------------------------- */
	public void typeDisease(String disease) {
		WebElement select = find(By.id("analysis_diagnostic"));
		List<WebElement> options = select.findElements(By.tagName("options"));
		for (WebElement option : options) {
			if (option.getText().equals(disease)) {
				option.click();
				break;
			}
		}
	}

	public void typeComment(String comment) {
		WebElementFacade value = find(By.id("analysis_comment"));
		value.type(comment);		
	}

	public void chooseType(String type) {
		WebElement select = find(By.id("analysis_type"));
		List<WebElement> options = select.findElements(By.tagName("options"));
		for (WebElement option : options) {
			if (option.getText().equals(type)) {
				option.click();
				break;
			}
		}
	}

	public void clickOnSave() {
		WebElement saveButton = find(By.id("saveButton"));
		saveButton.click();
	}

	public void clickOnCancel() {
		WebElement cancelButton = find(By.id("cancelButton"));
		cancelButton.click();
	}

	public String getMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElementFacade alertMessage = find(By.cssSelector(".alert-container .alert span.ng-binding.ng-scope"));
		return alertMessage.getText();
	}

	public void fillObjectiveWith(String height, String weight, String temperature, String bloodPressure,
			String cardiacFrequency, String cgb, String respiratoryFrequency, String oxygenSaturation,
			String carbonDioxSaturation) {
		WebElement complaintTab = find(By.id("objective_tab"));
		complaintTab.click();

		WebElement heightField = find(By.id("objective_height"));
		heightField.sendKeys(height);

		WebElement weightField = find(By.id("objective_weight"));
		weightField.sendKeys(weight);

		WebElement temperatureField = find(By.id("objective_temperature"));
		temperatureField.sendKeys(temperature);

		WebElement bloodPressureField1 = find(By.id("objective_pressure_1"));
		bloodPressureField1.sendKeys(bloodPressure.split(" ")[0]);

		WebElement bloodPressureField2 = find(By.id("objective_pressure_2"));
		bloodPressureField2.sendKeys(bloodPressure.split(" ")[1]);

		WebElement cardiacFrequencyField = find(By.id("objective_heart_rate"));
		cardiacFrequencyField.sendKeys(cardiacFrequency);

		WebElement cgbField = find(By.id("objective_glycemic_level"));
		cgbField.sendKeys(cgb);

		WebElement respiratoryFrequencyField = find(By.id("objective_respiratory_rate"));
		respiratoryFrequencyField.sendKeys(respiratoryFrequency);

		WebElement oxygenSaturationField = find(By.id("objective_oxigen_level"));
		oxygenSaturationField.sendKeys(oxygenSaturation);

		WebElement carbonDioxSaturationField = find(By.id("objective_carbon_dioxide_level"));
		carbonDioxSaturationField.sendKeys(carbonDioxSaturation);

	}

	public void fillEvaluationWith(String diagnostic, String type) {
		WebElement complaintTab = find(By.id("analysis_tab"));
		complaintTab.click();

		// WebElement heightField = find(By.id("objective_height"));
		// heightField.sendKeys(height);

	}

	public void fillPlanWith(String conduct) {
		WebElement complaintTab = find(By.id("plan_tab"));
		complaintTab.click();

		WebElement conductField = find(By.id("plan_conduct"));
		conductField.sendKeys(conduct);
	}

	public void fillEvolutionWith(String evolution) {
		WebElement complaintTab = find(By.id("evolution_tab"));
		complaintTab.click();

		WebElement evolutionField = find(By.id("evolution"));
		evolutionField.sendKeys(evolution);
		
	}

}
