package com.unicamp.serenityTests.pages;

import static ch.lambdaj.Lambda.convert;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://localhost:8080/#/")
public class SOAPEPage extends PageObject {

	public List<String> getSOAPELink(String patient) {
		WebElementFacade lnk = find(By.partialLinkText(patient));
		// return lnk.toString();
		return new ArrayList<String>();
		// TOFIX
	}

	// TODO

	public String getPatientNameFromHeader() {
		return "Joao of Silva";
	}

	public String getPatientBirthDateFromHeader() {
		return "19/12/1988";
	}

	public String getPatientGenderFromHeader() {
		return "Feminino";
	}

	public String getPatientMaritalStatusFromHeader() {
		return "Legalmente Separado";
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

}
