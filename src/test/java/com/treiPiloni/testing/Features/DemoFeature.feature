Feature: This is a demo feature

  Scenario: Check navigation to home-page
    Given I navigate to home-page
    And  I click on search Icon

#
#  Scenario Outline: check search text field
#    Given I navigate to home-page
#    And  I click on search Icon
#    Then I type <firstKeyword> and <secondKeyword>
#    Examples:
#      |firstKeyword|secondKeyword|
#      |first|yasss|
#      |moreKeywords|MOAR |
