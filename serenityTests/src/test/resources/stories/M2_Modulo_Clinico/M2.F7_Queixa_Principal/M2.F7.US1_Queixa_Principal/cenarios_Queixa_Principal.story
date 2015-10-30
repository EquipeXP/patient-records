Scenario: Input Main Complaiant
Given user is at main complaiant tab
When user insert a <complaiant> description
Then main complaiant should have <complaiant>

Examples

| complaiant |
| My head hurts |

Examples

| message |
| complaiant inserted |

Scenario: Not Input Main Complaiant
Given user is at main complaiant tab
When user does not fill complaint
Then user should see <message>

Examples

| message |
| complaiant not inserted |