@feature_Verify_that_links_in_homepage_are_working
Feature: Verify that the links in homepage are working

@Scenario1
Scenario: Open Webdriver and click on any link on Home page, and check url changed.
Given https://room5.trivago.com/ is running 
When I scroll down and click on any link at Homepage
Then Page url should be changed to reflect new page opened.
