Scenario: Fill SOAP
Given 'Manoel de Abreu' is on the patient <id> consultation page
When 'Manoel de Abreu' fill complaint with <complaint>
And 'Manoel de Abreu' fill objective with <height>, <weight>, <temperature>, <bloodPressure>, <cardiacFrequency>, <cgb>, <respiratoryFrequency>, <oxygenSaturation> and <carbonDioxSaturation>
And 'Manoel de Abreu' fill plan with <conduct>
And 'Manoel de Abreu' fill evolution with <evolution>
Then 'Manoel de Abreu' should see <message>

Examples:
|id|complaint|message| height | weight | temperature | bloodPressure | cardiacFrequency | cgb | respiratoryFrequency | oxygenSaturation | carbonDioxSaturation | diagnostic | type | conduct | evolution | message |
|666 | My head hurts|ok| 1.90	  | 95     | 30          | 16 12         | 130              | 10  | 4                    | 20               | 30                   | Neoplasmas (tumores). | Definitivo | ccc | ddd | eee |