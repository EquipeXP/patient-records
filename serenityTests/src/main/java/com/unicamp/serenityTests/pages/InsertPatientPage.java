package com.unicamp.serenityTests.pages;

import java.util.List;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://localhost:8080/#/patient/new")
public class InsertPatientPage extends PageObject {
	
	
    public void typeName(String patientName){
    	WebElementFacade value = find(By.id("patientName"));
    	value.type(patientName);
    }
    
    public void typePhone(String patientPhone){
    	WebElementFacade value = find(By.id("patientPhone"));
    	value.type(patientPhone);
    }
    
    public void typeBirthDate(String patientBirthDate){
    	WebElementFacade value = find(By.id("patientBirthDate"));
    	value.type(patientBirthDate);
    }
    
    public void typeAddress(String patientAddress){
    	WebElementFacade value = find(By.id("patientAddress"));
    	value.type(patientAddress);
    }
    
    public void chooseGender(String patientGender){
    	WebElement select = find(By.id("patientGender"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for(WebElement option : options){
            if(option.getText().equals(patientGender)) {
                option.click();
                break;
            }
        }
    }
    
    public void chooseMaritalStatus(String patientMaritialStatus){
    	WebElement select = find(By.id("patientMaritalStatus"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for(WebElement option : options){
            if(option.getText().equals(patientMaritialStatus)) {
                option.click();
                break;
            }
        }
    }

    public void chooseBreed(String patientBreed){
    	WebElement select = find(By.id("patientBreed"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for(WebElement option : options){
            if(option.getText().equals(patientBreed)) {
                option.click();
                break;
            }
        }
    }
    
    public void chooseEthnicity(String patientEthinicGroup){
    	WebElement select = find(By.id("patientEthnicGroup"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for(WebElement option : options){
            if(option.getText().equals(patientEthinicGroup)) {
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
