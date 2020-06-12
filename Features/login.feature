Feature: OrangeHRM feature

#Scenario: OrangeHRM Scenario

#Given user is in login page

#When user enter username and password
#Then user click on login button

#Data Driven without using Examples keyword
#Scenario: Data Driven test without using Examples keyword

#Given user is in login page
#When user enter "Admin" and "admin123"
#Then user click on login button

#Data Driven with using Examples keyword
Scenario Outline: Data Driven test with using Examples keyword

Given user is in login page
When user enters "<username>" and "<password>"
Then user click on login button

Examples:
    | username | password |
    | Admin    | admin123 |
    | Admin    | admin    |
      
      

