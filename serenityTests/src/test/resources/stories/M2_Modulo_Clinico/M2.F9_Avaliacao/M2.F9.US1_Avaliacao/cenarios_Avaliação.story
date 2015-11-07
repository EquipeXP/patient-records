Scenario: Successfully put the data in the fields
Given 'Manuel de Abreu' is on the Evaluation page
When <disease>, <type> and <comment> are given
Then an <alert> should appear
And an input on auditing system is added

Examples:
|disease					|type			|comment
|A00 - cólera				|Hipótese		|The quick brown fox jumps over the lazy dog
|A22 - carbúnculo			|Hipótese		|The quick brown fox jumps over the lazy dog
|A27 - leptospirose			|Definitivo		|The quick brown fox jumps over the lazy dog
|A51 - sífilis				|Hipótese		|The quick brown fox jumps over the lazy dog
|A54 - Infecção Gonocócica	|Definitivo		|The quick brown fox jumps over the lazy dog
|B20 - AIDS					|Hipótese		|The quick brown fox jumps over the lazy dog
|B58 - toxoplasmose			|Definitivo		|The quick brown fox jumps over the lazy dog
|J11 - Influenza (gripe)	|Hipótese		|The quick brown fox jumps over the lazy dog
|J45 - Asma					|Definitivo		|The quick brown fox jumps over the lazy dog
|J93 - Pneumotórax			|Definitivo		|The quick brown fox jumps over the lazy dog

Scenario: User didn't put data in some of the fields
Given 'Manuel d Abreu' is on the Evaluation page
When no <deseade>, <type> and <comment> are given
Them an <alert> should appear warning that some fields have no data

Examples:
|disease					|type			|comment
|							|Hipótese		|The quick brown fox jumps over the lazy dog
|A22 - carbúnculo			|				|The quick brown fox jumps over the lazy dog
|A27 - leptospirose			|Definitivo		|