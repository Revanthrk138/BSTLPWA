Feature: To validate login functionality of BSTL PWA

  Scenario: To validate login using valid username and valid password
    Given user starts "chrome" browser
    And user launch PWA using URL "https://bstl-pwa.skordev.com/#/login"
    And user click on langauge change icon
    And user change the language Thai to English
    When user enter the  username  "norm@bstl.com"
    When user enter the  password "pass"
    And user click on terms & conditions check box
    And user click on login button
    And user close the "chrome" browser
