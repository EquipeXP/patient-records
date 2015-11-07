Scenario: Add new information about patient evolution
Given That 'Joao Silva' is coming on a reschedule
When 'Manoel de Abreu' reports that 'Joao Silva' 'is improving'
Then The info that 'Joao Silva' 'is improving' must be recorded

Scenario: Register new data added in the audit trail
Given That 'Joao Silva' is coming on a reschedule
When 'Manoel de Abreu' reports that 'Joao Silva' 'is improving'
Then The new information 'is improving' is properly logged in the audit system