package jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.StartSOAPESteps;

import net.thucydides.core.annotations.Steps;

public class M2F1US1DefinitionSteps {

	@Steps
	StartSOAPESteps steps;

	@Given("'$user' is on the patient <id> consultation page")
	public void givenTheUserIsOnPatientConsultationPage(Integer id) {

		steps.isOnUserConsultationPage(id);
	}

	@When("'$user' sees header")
	public void whenUserSeesHeader(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("'$user' should see <name>, <birthdate>, <gender>, <maritalStatus>")
	public void therUserShouldSee(@Named("name") String name, @Named("birthdate") String birthdate,
			@Named("gender") String gender, @Named("maritalStatus") String maritalStatus) {

		steps.headerShouldHavePatientInfo(name, birthdate, gender, maritalStatus);
	}

}
