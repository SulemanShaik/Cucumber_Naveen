@FuntionalTest
Feature: OrangeHRM application testing

@SmokeTest @RegressionTest
Scenario: login with correct username and correct password
Given This is valid login test

@SmokeTest
Scenario: login with incorrect username and incorrect password
Given This is invalid login test

@RegressionTest
Scenario: Add an employee
Given This is an add employee test

@RegressionTest
Scenario:  Employee list
Given This is an  employee list test

@SmokeTest
Scenario: Job Title
Given This is an job title test

@SmokeTest @RegressionTest
Scenario:  Pay Grades
Given This is an pay grades test

@SmokeTest @End2End
Scenario: Employment status
Given This is an employment status test

@End2End
Scenario: Job categories  
Given This is an Job categories test

@End2End
Scenario: work shifts
Given This is an work shifts test





 
