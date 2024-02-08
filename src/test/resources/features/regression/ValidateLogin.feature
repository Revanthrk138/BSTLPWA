Feature: To validate login functionality of BSTL PWA

  #browser launch this is for comments
  Background: 
    Given user starts "chrome" browser
    And user launch PWA using URL "https://bstl-pwa.skordev.com/#/login"
    And user click on langauge change icon using xpath "//div[@class='dropdown']"
    And user change the language Thai to English using xpath "//div[@class='txt--label']"

  @regression
  Scenario: To validate login using valid username and valid password
    When user enters username  'norm@bstl.com' in textbox using xpath "//input[@type='text']"
    And user enters password 'pass' in textbox using xpath "//input[@type='password']"
    And user click on terms & conditions check box using xpath "//input[@type='checkbox']"
    And user click on login button using xpath "//button[@type='submit']"
    And user close the "chrome" browser
