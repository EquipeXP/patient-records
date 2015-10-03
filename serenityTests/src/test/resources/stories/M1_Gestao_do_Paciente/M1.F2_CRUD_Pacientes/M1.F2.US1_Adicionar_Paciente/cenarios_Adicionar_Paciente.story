Scenario: Cadastrar Paciente com Sucesso
Given The user Nikola Tesla wants to registrate
When He fulfills the form with the his name Nikola Tesla and press OK
Then The system should return the message: o cadastro foi preenchido com sucesso

Scenario: Register 'João of Silva' when there is already one patient with the same name
Given: Patient 'João of Silva' is registered in the system
When: Name, Phone, Gender, Birth, Address, maritalStatus, Breed and Ethinicity are given

|Name		|Phone			|Gender		|Birth					|Address				|maritalStatus	|breed		|ethinicity	|
|Joao Silva	|19 999866969	|Masculino	|19/02/1988 14:37:46	|Rua das paredes, 999	|Viúva(o)		|Bangladeshi|Panamenho	|

Then: The following Alert should appear warning about a possible duplicated entry
|Alert																	|
|Esse paciente que sera adicionado muito provavelmente esta duplicado	|
And: Maria Cardoso confirms
And: The patient should be registered anyway
And: An input on auditing system is added





