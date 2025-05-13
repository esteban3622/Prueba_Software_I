Feature: Navigation
    To see the subpages
    Without logging in
    I can click the navigation bar links
 
    Scenario: Users can select a plan when signing up
        Given I navigate to www.freerangetesters.com
        When I select Elegir Plan
        Then I can validate the options in the checkout page
