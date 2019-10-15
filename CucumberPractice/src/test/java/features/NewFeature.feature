Feature: Application Login

Scenario: Home page scenario login
Given user is on Login page
When user logs in to application with valid username and password
Then home page should be loaded