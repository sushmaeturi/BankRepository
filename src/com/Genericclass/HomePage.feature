Feature: This feature file is design to validate the Home page Functnationalities with
the below listed scenarios


Scenario: This scenario is to validate the secure login, Username, password, and Login in functionalities.
Given launch the application
|ff|http://server/bank/|
And click on admintab
And enter username, password
|admin|admin|
Then add staff details
|Sushma|F|06-NOV-2018|unmarried|revenue|19-Dec-2017|Madinaguda|9640031110|sushma221@gmail.com|jagsushma1|
