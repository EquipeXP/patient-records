Scenario: Cadastrar Paciente com Sucesso
Given The user Nikola Tesla wants to registrate
When He fulfills the form with the his name Nikola Tesla and press OK
Then The system should return the message: o cadastro foi preenchido com sucesso

<<<<<<< HEAD
Scenario: Register 'João of Silva' when there is already one patient with the same name
Given: Patient 'João of Silva' is registered in the system
When: the following data is given
=======
>>>>>>> 66fb22eb5347a806b7dcebb7b964bbdd5dc46e0b






<<<<<<< HEAD
Then: An alert should appear warning about a possible   duplicated entry
And: Maria Cardoso confirms
And: The patient should be registered anyway
And: An input on auditing system is added
=======
>>>>>>> 66fb22eb5347a806b7dcebb7b964bbdd5dc46e0b





<<<<<<< HEAD
=======



Scenario: Successfully register ‘João of Silva’
Given: Patient ‘João of Silva’ is not registered in the system
When: name, telephone,  admGender, birthTime, address, maritalState, breed and ethnicity is inserted.
Then: Patient is registered succesfully.
And: An input on auditing system is added.

Examples:
name | telephone |  admGender | birthTime | address | maritalState | breed | ethnicity
João Silva | 19 999866969 | Masculino | 19/02/1988 14:37:46 | Rua das paredes, 999 | Viúva(o) | Bangladeshi | Panamenho 
>>>>>>> 66fb22eb5347a806b7dcebb7b964bbdd5dc46e0b
