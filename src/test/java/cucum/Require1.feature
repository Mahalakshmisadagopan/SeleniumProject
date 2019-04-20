Feature: Leaftaps Functionality


Background:
Given Open the Browser
And Max the Browser
And Set the Timeouts
And Load the URL

@Smoke @Regression
Scenario Outline: Positive flow for Login
Given Enter the Username as <username>
And Enter the Password as <pwd>
When Click on the Login Button 
Then Verify the login Successfull
Given Open the Crm link
And Click on Create lead  
And Enter Company name as <Company> 
And Enter First Name as <fName>
And Enter Last Name as <lname>
And Enter Gmail
When Click on the Submit Button 
Then Verify the create id Successfull

Examples:
|username|pwd|Company|lname|fName|
|DemoSalesManager|crmsfa|TCS|Mahalakshmi|Sadagopan|
|DemoCSR|crmsfa|Infosys|Karthick|TN|


#Scenario: Lead Creation in Leaftaps
