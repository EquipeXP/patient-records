package com.unicamp.serenityTests.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.StartSOAPESteps;

public class M2F11US1DefinitionSteps {
	
	@Steps
	StartSOAPESteps startSOAPESteps;

	
	@Given("That '$patient' is coming on a reschedule")
	public void givenThatPatientIsComingReschedule(String patient){
		
	}
	
	@When("'$doctor' reports that '$patient' '$data'")
	public void thenDoctorAddNewInfo(){
		
	}
	
	@Then("The info that '$patient' '$data' must be recorded")
	public void thenInfoIsRecored(){
		
	}
	
	@Then("The new information '$data' is properly logged in the audit system")
	public void thenNewInfoIsLogged(){
		
	}
}
