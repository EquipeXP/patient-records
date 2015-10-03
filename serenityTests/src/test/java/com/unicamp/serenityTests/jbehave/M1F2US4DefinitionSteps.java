package com.unicamp.serenityTests.jbehave;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.unicamp.serenityTests.steps.EndUserSteps;

public class M1F2US4DefinitionSteps {
    @Steps
    EndUserSteps endUser;

    @Given("Maria Cardoso is a recepcionist")
    public void mariaCardosoIsARecepcionist() {
        endUser.isRecepcionist("Maria Cardoso");
    }
    
    @Given("Manoel de Abreu is doctor")
    public void manoelDeAbreuIsClinic() {
        endUser.isDoctor("Maria Cardoso");
    }
    
    @Given("'<Nome>' profile is open")
    @Alias("'$Nome' profile is open")
    public void isOpen(String Nome) {
        endUser.isOpen(Nome);
    }

    @When("Manoel de Abreu selects '$Dados_Clinicos' data")
    @Alias("Manoel de Abreu selects '<Dados_Clinicos>' data")
    public void doctorSelectsField( String Dados_Clinicos) {
    	endUser.selectField("Doctor", Dados_Clinicos);
    }
    
    @When("Maria Cardoso selects '$Nome' profile")
    @Alias("Maria Cardoso selects '<Nome>' profile")
    public void recepcionistSelectsProfile( String nome) {
    	endUser.selectProfile("Recepiocist", nome );
    }
    
    
    
    
    
   
    
    @Then("show profile data: '$Nome' , '$Telefone' , '$GeneroAdm' , '$HorNasc' , '$End' , '$Estado_Civil' , '$Race' , '$Etnia'")
    @Alias("show profile data: '<Nome>' , '<Telefone>' , '<GeneroAdm>' , '<HorNasc>' , '<End>' , '<Estado_Civil>' , '<Race>' , '<Etnia>'")
    public void showDemographicData(String Nome, String Telefone, String GeneroAdm, String HorNasc, String End, String Estado_Civil, String Race, String Etnia) {
        endUser.showDemographicPage(Nome, Telefone, GeneroAdm, HorNasc, End, Estado_Civil, Race, Etnia);
    }
    
    
}
