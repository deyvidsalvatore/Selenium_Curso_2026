Feature: I can access the subpages through the navigation bar

  Scenario: Navigate through the free sections
    Given I navigate to www.freerangetesters.com
    When I try to access the free sections through the navigation bar
    Then I am redirected to the right page
