Feature: test forum login functionality and posting functionality


  Scenario: Check Log in with valid credentials.
    Given I navigate to forum web page
    And I introduce valid credentials
    And I click the login button
    Then I am logged in

    Scenario: Post new rumors
      Given I navigate to forum web page
      And I introduce valid credentials
      And I click the login button
      Then I am logged in
      And I click on go to last commode post
      Then I open a new tab with football Italia news feed
      Then I publish Milan related news