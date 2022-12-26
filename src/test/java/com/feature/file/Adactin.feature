Feature: To check whether Adactin application is working fine


Scenario Outline: To check whether login functionality is working fine
Given Launch the browser and and pass the URL
When User enter "<username>" in the username field
And User enters "<password>" in the password field
And User clicks on login button
Then User should get navigated to Search Hotels page

Examples:
        |username|password|
        |Arthiha1018 |IA779U    |
        |abc         |123       |



