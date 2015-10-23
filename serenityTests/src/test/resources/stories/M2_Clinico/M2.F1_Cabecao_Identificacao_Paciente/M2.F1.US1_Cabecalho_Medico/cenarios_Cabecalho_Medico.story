Scenario: See patient main information
Given 'Manoel de Abreu' is on the patient <name> consultation page
When 'Manoel de Abreu' sees header
Then He should see <name>, <birthdate>, <gender>, <maritalStatus>

Examples:
|name | birthdate | gender | maritalStatus |
|Joao of Silva | 19/12/1988 | Feminino | Legalmente Separado |