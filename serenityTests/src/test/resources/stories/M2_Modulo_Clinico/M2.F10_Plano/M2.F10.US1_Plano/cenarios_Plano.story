Scenario: [Plano] Successfully put data in the fields
Given 'Manuel de Abreu' is on the 'Consultation page' of <patient>
And 'Manuel de Abreu' is on the 'Plan tab'
When <conduct> and <comment> are given
Then an <alert> should appear
And an input on auditing system is added

Examples:
|patient	|conduct		|comment	|alert
|1			|comer mais		|The quick 	|Plan saved
|2			|comer menos	|fox		|Plan saved

Scenario: [Plano] User didn't put data in some of the fields
Given 'Manuel de Abreu' is on the 'Consultation page' of <patient>
And 'Manuel de Abreu' is on the 'Plan tab'
When <conduct> or <comment> are given
Then an <alert> should appear warning that some fields have no data

Examples:
|patient	|conduct		|comment	|alert
|1			|				|The quick 	|Missing "conduct" field! Do you want to proceed?
|2			|comer menos	|			|Missing "comment" field! Do you want to proceed?