Scenario: Successfully register 'João of Silva'
Given 'Manoel de Abreu' is on the new patient page
When <name>, <phone>, <gender>, <birth>, <address>, <maritalstatus>, <breed> and <ethinicity> are given
Then An <alert> should appear
And an input on auditing system is added

Examples:	
|name		|phone			|gender		|birth					|address				|maritalstatus	|breed		|ethinicity	|alert|
|João Silva | 19 999866969 | Masculino | 19/02/1988 14:37:46 | Rua das paredes, 999 |Casado|Inglês|Panamenho| Paciente adicionado com sucesso|


Scenario: Unsuccessfully register 'João of Silva' because one or more mandatory field among (Nome, Endereço, Telefone, …) is missing
Given 'Manoel de Abreu' is on the new patient page 
When <name>, <phone>, <gender>, <birth>, <address>, <maritalstatus>, <breed> and <ethinicity> are given
Then An <alert> should appear
And The patient shouldn't be registered
And an input on auditing system is added

Examples:
|name		|phone			|gender		|birth					|address				|maritalstatus	|breed		|ethinicity	|alert|
|				|19 999866969	|Masculino	|19/02/1988 14:37:46	|Rua das paredes, 999	|Casado|Inglês|Panamenho|O nome do paciente e obrigatorio	|
|João of Silva	|19 999866969	|Masculino	|19/02/1988 14:37:46	|						|Casado|Inglês|Panamenho|O endereco e obrigatorio			|
|João of Silva	|				|Masculino	|19/02/1988 14:37:46	|Rua das paredes, 999	|Casado|Inglês|Panamenho|O telefone e obrigatorio			|


Scenario: Auditory trail
Given 'Manoel de Abreu' is on the new patient page
When 'Maria Cardoso' tries to register 'Joao of Silva'
Then A Auditory log is created