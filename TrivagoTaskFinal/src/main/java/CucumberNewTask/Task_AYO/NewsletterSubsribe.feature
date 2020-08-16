@feature_Subscribe_to)the_Newsletter
Feature: Subscribe to the Newsletter

@Scenario1
Scenario: Open Webdriver and click on scroll down before footer, then enter a valid e-mail address and click Inspire me
Given https://room5.trivago.com/ is running 
When you are scrolled down and click on textbox
And Enter a valid email address
And Clicked on Inspire me
Then A confirmation message appear that you are checked In!

@secnario2Negative
Scenario: Open Webdriver and click on scroll down before footer, then enter invalid e-mail address and click Inspire me
Given https://room5.trivago.com/ is running
When you are scrolled down and click on textbox
And Enter an invalid email address
And Clicked on Inspire me
Then Error Message displayed