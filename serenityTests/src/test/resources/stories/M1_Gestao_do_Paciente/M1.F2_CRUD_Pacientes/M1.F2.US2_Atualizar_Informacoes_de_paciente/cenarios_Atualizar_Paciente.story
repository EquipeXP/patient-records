Scenario: Successfully update a patient ‘João of Silva’
Given ‘João da Silva’ is now ‘Divorciado(a)’
When Maria Cardoso changes the field ‘Estado civil’
Then The new patient data should be registered with 
And The old patient data should stay stored
And An input on auditing system should be added

Scenario: Try editing a immutable field
Given ‘João of Silva’ already has a CNS registered
When Maria Cardoso tries to edit ‘João of Silva’ CNS
Then An alert should appear saying ‘CNS é um campo imutável.’
And ‘João of Silva’ data should not change
And An input on auditing system should be added