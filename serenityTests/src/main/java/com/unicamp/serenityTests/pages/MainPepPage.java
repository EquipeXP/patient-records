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

}