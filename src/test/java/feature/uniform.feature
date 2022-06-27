Feature: Uniform login page

  Background: Background section
    Given User is on homepage


@Regression
  Scenario Outline: Login with unauthorized user
    When user enter invalid Username "<username>" and password "<password>"
    Then validation message appears
    
    Examples: 
      | username | password |
      | admin    |   Admin |
      
@Regression
Scenario Outline: Login with authorized user
    When user enter valid Username "<username>" and password "<password>"
    Then validation message appears
    When user goes to menu
    When user goes to reports
And user clicks Marketing
And click on Affiliate activity
Then user navigates to Affiliate Activity Report 

    Examples: 
      | username | password |
      | admin    |   Admin@123 |      
      
      

   