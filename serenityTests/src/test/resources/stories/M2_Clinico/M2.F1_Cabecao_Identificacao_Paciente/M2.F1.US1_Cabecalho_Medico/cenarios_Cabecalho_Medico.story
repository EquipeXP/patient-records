Scenario: See patient main information
Given 'Manoel de Abreu' is on the patient <id> consultation page
When 'Manoel de Abreu' sees header
Then 'Manoel de Abreu' should see <name>, <birthdate>, <gender>, <maritalStatus>

Examples:
|id|name | birthdate | gender | maritalStatus |
|4|Joao of Silva | 19/12/1988 | Feminino | Legalmente Separado |