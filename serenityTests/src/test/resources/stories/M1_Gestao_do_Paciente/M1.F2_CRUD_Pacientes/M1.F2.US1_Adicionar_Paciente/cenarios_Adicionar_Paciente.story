Scenario: Cadastrar Paciente com Sucesso
Given The user Nikola Tesla wants to registrate
When He fulfills the form with the his name Nikola Tesla and press OK
Then The system should return the message: o cadastro foi preenchido com sucesso

Scenario: Register 'João of Silva' when there is already one patient with the same name
Given: Patient 'João of Silva' is registered in the system
When: the following data is given






Then: An alert should appear warning about a possible   duplicated entry
And: Maria Cardoso confirms
And: The patient should be registered anyway
And: An input on auditing system is added





