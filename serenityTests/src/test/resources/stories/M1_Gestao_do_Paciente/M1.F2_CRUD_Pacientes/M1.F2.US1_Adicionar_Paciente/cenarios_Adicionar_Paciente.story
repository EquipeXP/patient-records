Scenario: Cadastrar Paciente com Sucesso
Given The user Nikola Tesla wants to registrate
When He fulfills the form with the his name Nikola Tesla and press OK
Then The system should return the message: o cadastro foi preenchido com sucesso















Scenario: Successfully register ‘João of Silva’
Given: Patient ‘João of Silva’ is not registered in the system
When: name, telephone,  admGender, birthTime, address, maritalState, breed and ethnicity is inserted.
Then: Patient is registered succesfully.
And: An input on auditing system is added.

Examples:
name | telephone |  admGender | birthTime | address | maritalState | breed | ethnicity
João Silva | 19 999866969 | Masculino | 19/02/1988 14:37:46 | Rua das paredes, 999 | Viúva(o) | Bangladeshi | Panamenho 