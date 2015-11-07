Scenario: Input Objective Data
Given user is at objective data tab
When user insert a <objective> description
Then objective data should have <objective>

Examples

| objective |
| Height = 1.92m, Weight = 134.0Kg, Arterial pressure = 162mm Hg (systolic)/ 107 mm Hg (Diastolic), Heart Rate = 142BPM  |

Examples

| message |
| objective inserted |

Scenario: Input Objective Data
Given user is at objective data tab
When user does not fill objective
Then user should see <message>

Examples

| message |
| objective data not inserted |