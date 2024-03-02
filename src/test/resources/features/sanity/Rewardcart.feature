Feature: To validaty reward cart functionality

Scenario: To validate reward add to cart and redemption
Given user starts "chrome" browser
    And user launch PWA using URL "https://bstl-pwa.skordev.com/#/login"
    And user click on langauge change icon
    And user change the language Thai to English
    When user enter the  username  "norm@bstl.com"
    When user enter the  password "pass"
    And user click on terms & conditions check box
    And user click on login button
    When user select the reward on home page
    And user click on add to cart button
    And user click on view cart button
    And user click on checkout button
    And user click on place your order button
    And user click on view your order button
    And user click on profile tab
    And user click on signout button
    

