package com.unicamp.serenityTests.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("http://localhost:8080/#/consultation/new/")
public class EvaluateDiseasePage extends PageObject {
	

	public void typeDisease(String disease) {
		WebElementFacade value = find(By.id("diseaseName"));
		value.type(disease);
	}
	
	public void typeComment(String comment) {
		WebElementFacade value = find(By.id("comment"));
		value.type(comment);		
	}

	public void chooseType(String type) {
		WebElement select = find(By.id("diagnosesType"));
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
