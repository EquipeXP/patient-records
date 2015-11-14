Scenario: Input Objective Data
Given user is at objective data tab of <patient>
When user insert <height>, <weight>, <temperature>, <systolic>, <diastolic>, <bpm>, <rpm>, <so>, <sco>, <glycemia>
Then user should see <message>

Examples

|patient	|height		|weight		|temperature		|systolic		|diastolic		|bpm		|fr		|so		|sco		|glycemia	|message
|1 			|1.92m		|134.0Kg	|35 C				|162mmHg 		|107mmHg		|142		|20		|250	|250		|70mg/DL 	| objective inserted

Scenario: Input Objective Data
Given user is at objective data tab
When user does not fill objective
Then user should see <message>

Examples

| message |
| objective data not inserted |