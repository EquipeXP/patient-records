Scenario: Fill SOAP
Given 'Manoel de Abreu' is on the patient <id> consultation page
When 'Manoel de Abreu' fill SOAP with <complaint>
Then 'Manoel de Abreu' should see <message>

Examples:
|id|complaint|message|
|9 | My head hurts|ok|