Scenario: Demographic data visualization
Given: Maria Cardoso has permission to see patient data
When: Maria Cardoso select ‘João of Silva’ profile
Then: ‘João of Silva’ demographic data should be shown
And: An input on auditing system is added

Scenario: Demographic data visualization error
Given: Maria Cardoso doesn’t have permission to see patient data
When: Maria Cardoso select ‘João of Silva’ profile
Then: An alert should show message “Você não tem acesso a esse dado”
And: An input on auditing system is added

Scenario: Clinical data visualization
Given: Manoel de Abreu have permission to see patient clinical data
And: ‘João of Silva’ profile is already open
When: Manoel de Abreu select clinical data
Then: ‘João of Silva’ clinical data should be shown
And: An input on auditing system is added

Scenario: Clinical data visualization error
Given: Manoel de Abreu doesn’t have permission to see patient clinical data
And: ‘João of Silva’ profile is already open
When: Manoel de Abreu select clinical data
Then: ‘João of Silva’ clinical data should be shown
And: An input on auditing system is added