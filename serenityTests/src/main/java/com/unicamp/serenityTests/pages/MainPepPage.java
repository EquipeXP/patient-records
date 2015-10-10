package com.unicamp.serenityTests.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("http://localhost:8080/#/")
public class MainPepPage extends PageObject {

    public List<String> getPatients() {
        WebElementFacade rows = find(By.tagName("tbody"));
        List<WebElement> results = rows.findElements(By.tagName("td"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
    
    public void typeName(String patientName){
    	WebElementFacade value = find(By.id("patientName"));
    	value.click();
    	value.type(patientName);
    }
    
    public void typePhone(String patientPhone){
    	WebElementFacade value = find(By.id("patientPhone"));
    	value.click();
    	value.type(patientPhone);
    }
    
    public void typeBirthDate(String patientBirthDate){
    	WebElementFacade value = find(By.id("patientBirthDate"));
    	value.click();
    	value.type(patientBirthDate);
    }
    
    public void typeAddress(String patientAddress){
    	WebElementFacade value = find(By.id("patientAdress"));
    	value.click();
    	value.type(patientAddress);
    }
    
    public void chooseGender(String patientGender){
    	WebElementFacade value = find(By.id("patientGender"));
    	value.click();
    	WebElement select = value.findElement(By.name("select"));
        List<WebElement> options = select.findElements(By.tagName("option"));
        for(WebElement option : options){
            if(option.getText().equals("Name you want")) {
                option.click();
                break;
            }
        }
    }
}