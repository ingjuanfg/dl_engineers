
Feature: Checking Language
  As Client
  I want to get the available languages
  To validate the language page


Scenario:Get available languages in the page
  Given that user want to know available languages
  When he gets the languages using the API
  Then should get all the available languages
