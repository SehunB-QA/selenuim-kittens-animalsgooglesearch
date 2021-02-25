#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Google search various animals

  Scenario Outline: Search "<animal>" on Google Images
    Given the user can access "google.com"
    When the user types the term  "<animal>" in the search bar
    And the user clicks on the google images link
    Then the user should see images of "<animal>".

    Examples: 
      | animal  |  | Domain         |
      | monkeys |  | www.google.com |
      | cats    |  | www.google.com |
      | dogs    |  | www.google.com |
      | zebras  |  | www.google.com |
      | lions   |  | www.google.com |
