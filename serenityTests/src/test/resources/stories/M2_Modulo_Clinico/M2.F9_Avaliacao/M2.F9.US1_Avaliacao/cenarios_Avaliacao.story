Scenario: [A] Successfully put the data in the fields
Given 'Manuel de Abreu' is on the 'Consultation page' of <patient>
And 'Manuel de Abreu' is on the 'Evaluation tab'
When <disease>, <type> and <comment> are given
Then an <alert> should appear
And an input on auditing system is added

Examples:
|disease					|type			|comment									|patient
|A00 - cólera				|Hipótese		|The quick brown fox jumps over the lazy dog|1
|A22 - carbúnculo			|Hipótese		|The quick brown fox jumps over the lazy dog|2
|A27 - leptospirose			|Definitivo		|The quick brown fox jumps over the lazy dog|3
|A51 - sífilis				|Hipótese		|The quick brown fox jumps over the lazy dog|4
|A54 - Infecção Gonocócica	|Definitivo		|The quick brown fox jumps over the lazy dog|5
|B20 - AIDS					|Hipótese		|The quick brown fox jumps over the lazy dog|6
|B58 - toxoplasmose			|Definitivo		|The quick brown fox jumps over the lazy dog|7
|J11 - Influenza (gripe)	|Hipótese		|The quick brown fox jumps over the lazy dog|8
|J45 - Asma					|Definitivo		|The quick brown fox jumps over the lazy dog|9
|J93 - Pneumotórax			|Definitivo		|The quick brown fox jumps over the lazy dog|10

Scenario: [A] User didn't put data in some of the fields
Given 'Manuel de Abreu' is on the 'Consultation page' of <patient>
And 'Manuel de Abreu' is on the 'Evaluation tab'
When no <deseade>, <type> and <comment> are given
Them an <alert> should appear warning that some fields have no data

Examples:
|disease					|type			|comment
|							|Hipótese		|The quick brown fox jumps over the lazy dog
|A22 - carbúnculo			|				|The quick brown fox jumps over the lazy dog
|A27 - leptospirose			|Definitivo		|