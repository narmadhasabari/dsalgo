@RegisterPage
Feature: RegisterPage

Background: User launch home page of an dsalgo project
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The user should be redirected to homepage
When The user clicks Register

Scenario Outline: Validating Register Functionality

Given The user is on the Register page
When The user fills the form '<UserName>' '<Password>'  '<PasswordConfirmation>' 
Then The user clicks RegisterButton
Examples:
|UserName|Password|PasswordConfirmation|
|null    |null    |Siva@1234|
|SivaShan|DsAlgo@123|DsAlgo@123|
|DianaWill|PeterJack@123|PeterJack@123|
|RajPatel|TestNg@123 |TestNg@123|