Scenario: Register 'João of Silva' when there is already one patient with the same name
Given 'Manoel de Abreu' is on the new patient page
When '<Name>', '<Phone>', '<Gender>', '<Birth>', '<Address>', '<maritalStatus>', '<breed>' and '<ethinicity>' are given

Examples:
|Name		|Phone			|Gender		|Birth					|Address				|maritalStatus	|breed		|ethinicity	|
|Joao of Silva	|19 999866969	|Masculino	|19/02/1988 14:37:46	|Rua das paredes, 999	|Viúva(o)		|Bangladeshi|Panamenho	|

Then The following Alert should appear warning about a possible duplicated entry

Examples:
|Alert																	|
|Esse paciente que sera adicionado muito provavelmente esta duplicado	|

And Maria Cardoso confirms
And The patient should be registered anyway
And An input on auditing system is added


Scenario: Successfully register 'João of Silva'
Given 'Manoel de Abreu' is on the new patient page
When user insert data name, telephone,  admGender, birthTime, address, maritalState, breed and ethnicity.
Then user should see 'Paciente adicionado com sucesso'.
And an input on auditing system is added.

Examples:	
name | telephone |  admGender | birthTime | address | maritalState | breed | ethnicity
João Silva | 19 999866969 | Masculino | 19/02/1988 14:37:46 | Rua das paredes, 999 | Viúva(o) | Bangladeshi | Panamenho 


Scenario: Auditory trail
Given 'Manoel de Abreu' is on the new patient page
When Maria Cardoso tries to register 'Joao of Silva'
Then A Auditory log is created

Scenario: Unsuccessfully register 'João of Silva' because one or more mandatory field among (Nome, Endereço, Telefone, …) is missing
Given 'Manoel de Abreu' is on the new patient page 
When One of the following data Name, Phone, Gender, Birth, Address, maritalStatus, Breed and Ethinicity are missing
|Name			|Phone			|Gender		|Birth					|Address				|maritalStatus	|breed		|ethinicity	|
|				|19 999866969	|Masculino	|19/02/1988 14:37:46	|Rua das paredes, 999	|Viúva(o)		|Bangladeshi|Panamenho	|

Then An Alert should appear for each missing Field
|Field	|Alert								|
|Name	|O nome do paciente e obrigatorio	|
|Address|O endereco e obrigatorio			|
|Phone	|O telefone e obrigatorio			|
|Breed	|O Genero e obrigatorio				|

And The patient shouldn’t be registered
And An input on auditing system is added