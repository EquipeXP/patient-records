package com.unicamp.serenityTests.pages;

import static org.hamcrest.MatcherAssert.assertThat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://localhost:8080/#/")
public class SOAPEPage extends PageObject {
	
	private WebElement subjectiveTab = find(By.id("subjective_tab"));
	private WebElement objectiveTab  = find(By.id("objective_tab"));
	private WebElement analysisTab   = find(By.id("analysis_tab"));
	private WebElement planTab       = find(By.id("plan_tab"));
	private WebElement evolutionTab  = find(By.id("evolution_tab"));
	

	public List<String> getSOAPELink(String patient) {
		WebElementFacade lnk = find(By.partialLinkText(patient));
		// return lnk.toString();
		return new ArrayList<String>();
		// TOFIX
	}

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

	
	public void assertTab(String tab){
		
		switch (tab) {
			case "SUBJETIVO":
				subjectiveTab.findElement(By.tagName("a")).click();
				break;
				
			case "OBJETIVO":
				objectiveTab.findElement(By.tagName("a")).click();
				break;
				
			case "ANALISE":
				analysisTab.findElement(By.tagName("a")).click();
				break;
				
			case "PLANO":
				planTab.findElement(By.tagName("a")).click();
				break;
				
			case "EVOLUCAO":
				evolutionTab.findElement(By.tagName("a")).click();
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

}
