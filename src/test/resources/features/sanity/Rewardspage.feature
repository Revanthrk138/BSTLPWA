Feature: To validaty reward redemption of BSTL PWA

  Scenario: To validate e-voucher reward redemption
    Given user starts "chrome" browser
    And user launch PWA using URL "https://bstl-pwa.skordev.com/#/login"
    And user click on langauge change icon
    And user change the language Thai to English
    When user enter the  username  "norm@bstl.com"
    When user enter the  password "pass"
    And user click on terms & conditions check box
    And user click on login button
    When user click on rewards heading in header section in home page
    And user click on e-voucher reward
    When user click on redeem button
    And user click on redeem now button
    When user click on redeem now button on order confirmation page
    And click on view order button
    And user click on mark as used button
    And user click on mark as ued tab yes button
    Then user click on rewards heading in header
    And click on my wallet
    And user click on profile tab
    And user click on signout button
