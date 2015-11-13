package com.unicamp.serenityTests.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.IncludeEvaluationSteps;

import net.thucydides.core.annotations.Steps;

public class M2F9US1DefinitionSteps {
	
	@Steps
	IncludeEvaluationSteps includeEvaluationSteps;
	
	@Given("'$user' is on the Consultation page of <patient>")
	public void givenTheUserIsOnTheConsultationPage(@Named("user") String user, 
			@Named("patient") String patient) {
		includeEvaluationSteps.is_on_the_consultation_page(patient);
	}
	
	@Given("'$user' is on the Evaluation tab")
	public void givenTheUserIsOnTheEvaluationTab(@Named("user") String user) {
		includeEvaluationSteps.is_on_the_evaluation_tab();
	}
	
	@When("<disease>, <type> and <comment> are given")
	public void whenEvaluationDataIsInputed(@Named("disease") String disease, 
			@Named("type") String type,
			@Named("comment") String comment) {
		
		includeEvaluationSteps.fillForm(disease, type, comment);
		includeEvaluationSteps.saveForm();
	}
			
    @When("no <disease>, <type> or <comment> are given")
    public void whenSomeEvaluationDataInputIsMissing(@Named("disease") String disease,
    		@Named("type") String type,
    		@Named("comment") String comment) {
    	includeEvaluationSteps.fillFormMissingData(disease, type, comment);
    	includeEvaluationSteps.saveForm();
    }
	
	@Then("An $alert should appear")
	public void thenAnAlertShouldAppear(String alert){
		includeEvaluationSteps.shoudlSeeMessage(alert);
	}
	

	@Then("an input on auditing system is added")
	public void thenAnInputToAuditIsAdded(){
		
	}
}
