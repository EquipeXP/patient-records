Scenario: Add new information about patient evolution
Given That the patient is coming on a reschedule
When Manoel de Abreu tries to add some new information regarding the patient evolution
Then The new data inputed should be sucessfully recorded in the database

Scenario: Register new data added in the audit trail
Given That the patient is coming on a reschedule
When Manoel de Abreu tries to add some new information regarding the patient evolution
Then The new data inputed should be properly logged in the audit system