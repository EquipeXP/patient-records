package com.unicamp.serenityTests.pages;

import static ch.lambdaj.Lambda.convert;

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
        return lnk.toString();
        //TOFIX
    }
    
}
