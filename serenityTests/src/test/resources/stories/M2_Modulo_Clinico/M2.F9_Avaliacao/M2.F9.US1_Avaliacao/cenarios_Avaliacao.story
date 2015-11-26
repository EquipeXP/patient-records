Scenario: [Avaliacao] Successfully put the data in the fields
Given 'Manuel de Abreu' is on the 'Consultation page' of <patient>
And 'Manuel de Abreu' is on the 'Evaluation tab'
When <disease>, <type> and <comment> are given
Then an <alert> should appear
And an input on auditing system is added

Examples:
|disease					|type			|comment									|patient	|alert
|A00 - cólera				|Hipótese		|The quick brown fox jumps over the lazy dog|1			|Successfully evaluating data added
|A22 - carbúnculo			|Hipótese		|The quick brown fox jumps over the lazy dog|2			|Successfully evaluating data added
|A27 - leptospirose			|Definitivo		|The quick brown fox jumps over the lazy dog|3			|Successfully evaluating data added
|A51 - sífilis				|Hipótese		|The quick brown fox jumps over the lazy dog|4			|Successfully evaluating data added
|A54 - Infecção Gonocócica	|Definitivo		|The quick brown fox jumps over the lazy dog|5			|Successfully evaluating data added
|B20 - AIDS					|Hipótese		|The quick brown fox jumps over the lazy dog|6			|Successfully evaluating data added
|B58 - toxoplasmose			|Definitivo		|The quick brown fox jumps over the lazy dog|7			|Successfully evaluating data added
|J11 - Influenza (gripe)	|Hipótese		|The quick brown fox jumps over the lazy dog|8			|Successfully evaluating data added
|J45 - Asma					|Definitivo		|The quick brown fox jumps over the lazy dog|9			|Successfully evaluating data added
|J93 - Pneumotórax			|Definitivo		|The quick brown fox jumps over the lazy dog|10			|Successfully evaluating data added

Scenario: [Avaliacao] User didn't put data in some of the fields
Given 'Manuel de Abreu' is on the 'Consultation page' of <patient>
And 'Manuel de Abreu' is on the 'Evaluation tab'
When no <deseade>, <type> or <comment> are given
Then an <alert> should appear warning that some fields have no data

Examples:
|disease					|type			|comment										|alert
|							|Hipótese		|The quick brown fox jumps over the lazy dog	|Missing 'disease' field! Do you want to proceed?
|A22 - carbúnculo			|				|The quick brown fox jumps over the lazy dog	|Missing 'type' field! Do you want to proceed?
|A27 - leptospirose			|Definitivo		|												|Missing 'comment' field! Do you want to proceed?