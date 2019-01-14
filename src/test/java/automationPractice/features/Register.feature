Feature: Regiser feature for www.automationpractice.com site
  As a customer
  I want to register successfuly for shopping
Background:
    Given User is on the home page

  #happy path scenario
  @register @smoke
  Scenario Outline: Registered successfully with mandatory field
    When User selects SignIn link
    Then User should be on the regitration page
    When I enters email as "<email>"
    And I select create account button
    And I complete personnel information "<title>"and"<firstname>"and"<surname>"and"<password>"
    And I complete address details "<address1>"and"<city>"and"<state>"and "<postcode>"and"<country>"and"<mobile>"and"<alias>"
    And I select register
    Then I should login and see message as "<message>"
    Examples:
        |email                  |title | firstname | surname|password|address1    |city    |state  | postcode|country       | mobile| alias     |message|
        |temp                   |Mr    |   jags    | White  |abcde   |P.O. Box123 | chatham|Alaska | 99501   |United States |0123456789| newaccount|Welcome|


#Unhappy path scenario
  @register1 @smoke
  Scenario Outline: Registration un-successfull with no data
    When User selects SignIn link
    Then User should be on the regitration page
    When I enters email as "<email>"
    And I select create account button
    And I complete personnel information "<title>"and"<firstname>"and"<surname>"and"<password>"
    #And I complete address details "<address1>"and"<city>"and"<state>"and "<postcode>"and"<country>"and"<mobile>"and"<alias>"
    And I select register
    Then I should see error message as "<message>"
    Examples:
        |email|title | firstname | surname|password|address1    |city    |state  | postcode|country       | mobile| alias     |message|
        |temp |      |           |        |       |             |        |       |         |              |       |           |errors |


