package jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.ObjectiveSteps;

import net.thucydides.core.annotations.Steps;

public class M2F8US1DefinitionSteps {
	
	@Steps
	ObjectiveSteps objectiveSteps;
	
	@Given("'user' is at objective data tab of <patient>")
	public void givenUserIsAtObjectiveDataTab(@Named("user") String user,
			@Named("patient") String patientId) {
		objectiveSteps.is_on_consultation_page(patientId);
		objectiveSteps.is_at_objective_data_tab();
	}
	
	@When("'user' insert <height>, <weight>, <temperature>, <systolic>, <diastolic>, <bpm>, <fr>, <so>, <sco>, <glycemia>")
	public void whenUserInsertObjectiveData(@Named("height") String height, 
			@Named("weight") String weight, @Named("temperature") String temperature, 
			@Named("systolic") String systolic, @Named("diastolic") String diastolic, 
			@Named("bpm") String bpm, @Named("fr") String fr, @Named("so") String so,
			@Named("sco") String sco, @Named("glycemia") String glycemia) {
		
		objectiveSteps.fillForm(height, weight, temperature, systolic, diastolic, bpm, fr, so, sco, glycemia);
		objectiveSteps.saveForm();
	}
	
	@When("When user does not fill objective")
	public void whenUserDoesNotFillObjective() {
		objectiveSteps.fillFormMissingData();
	}
	
	@Then("'user' should see <message>")
	public void thenUserShouldSee(@Named("message") String message) {
		objectiveSteps.shouldSeeMessage(message);
	}

}
