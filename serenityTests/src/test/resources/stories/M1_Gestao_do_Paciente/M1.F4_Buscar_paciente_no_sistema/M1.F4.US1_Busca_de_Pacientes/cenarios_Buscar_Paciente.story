Scenario: Search for a patient and finds multiple options
Given: There are 3 different patients called "João of Silva"
When: Maria Cardoso searches for "João of Silva"
Then: A list with '3' correct results must appear 
And: An input on auditing system is added

Scenario: Search for a patient with multiple parameters
Given: There are 3 different patients called "João of Silva"
When: Maria Cardoso searches for "João of Silva; CPF:406952168-21"
Then: A list with '1' correct results must appear 
And: An input on auditing system is added

Scenario: Search for a patient with multiple parameters wrongly
Given: There are 3 different patients called "João of Silva"
When: Maria Cardoso searches for "João of Silva; CPF:3"
Then: A message informing that no result were found
And: An input on auditing system is added