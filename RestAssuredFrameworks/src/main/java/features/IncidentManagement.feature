Feature: IncidentManagement

Scenario: Get an existing incident
Verify the incident creation

Given setup the endpoint
Given setup the authorization
When send get request
Then verify the status code
And print the response