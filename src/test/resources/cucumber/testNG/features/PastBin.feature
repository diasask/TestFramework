@smoke
Feature: User have ability to create new pasteBin paste

  Background:
    Given User open pastBin site

  Scenario Outline: Create paste with params
    When User write text in paste "<text>"
    And User choose paste expiration 10 Minutes
    And User write title of the paste "<title>"
    And User create new paste
    Then New paste is created
    Examples:
      | text                 | title       |
      | Test cucumber        | test        |
      | Test cucumber second | test second |


  Scenario Outline: Create paste with bash syntax
    When User write text in paste "<text>"
    And User choose highlight syntax in bash
    And User write title of the paste "<title>"
    And User create new paste
    Then New paste is created
    Examples:
      | text                                                                                                                                             | title                                  |
      | git config --global user.name 'New Sheriff in Town' 'git reset $(git commit-tree HEAD^{tree} -m 'Legacy code')' 'git push origin master --force' | how to gain dominance among developers |