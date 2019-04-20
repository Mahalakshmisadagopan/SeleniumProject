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
And Click on leads link 
And Navigate to Find leads
And Navigate to Email tab
And Enter your email address as <Gmail> 
And Click on the Find leads button 
And Click on first resulting lead
And Click on Edit button
And After Edit print Edit values
Then Verify edit successfully completed

Examples:
|username|pwd|Gmail|
|DemoSalesManager|crmsfa|xyz@gmail.com|
|DemoCSR|crmsfa|test123@gmail.com|


#Scenario: Lead Creation in Leaftaps
