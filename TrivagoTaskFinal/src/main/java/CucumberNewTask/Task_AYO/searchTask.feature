@feature_Searchfor_any_location_onMagazine_by_using_the_searchbar
Feature: Search for any location on Magazine by using the search bar

@Scenario1Positive
Scenario: click on search icon and enter a country name to search for then click Enter
Given https://magazine.trivago.com/ is running 
When I click on search icon 
And write country name and click Enter
Then results related to country name will be displayed.

@secnario2Negative
Scenario: Enter a not found country name to get No Results.
Given Searchbox is opened and empty.
When I enter invalid country name.
Then I get No Results related in the search page.