      Feature: AutomationPractice End To End TestCase

      @LogInWithExampleKeyword
      Scenario Outline: Verify user can login with datatable
      Given User launched the automationpratice.com  application
      When User clicks on signin button in the header
      And User enter emailid '<EmailId>' in the signin page
      And User enter password '<Password>' in the signin page
      And User clicks signin button in signin page
      Then User verify username '<UserName>' displayed in the header
      
      Examples:
      |EmailId|Password|UserName|
      |kkgan@gmail.com|qwerty|kakkaak dadaefa|
      |mahesathya12@gmail.com|121291|Sathya Mahe|
      
     