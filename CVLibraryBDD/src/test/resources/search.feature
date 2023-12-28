Feature:Search for jobs on CV library

  Background:
    Given user is on CV Library web page
    When user accepts cookies

    @smoke
    Scenario:Verify software tester jobs in london
      And User searches for "Software Tester" jobs in jobtitle
      And user searches for "London" in location
      And user selects  miles in distance
      And user clicks on findjobs
      Then user verifies Software Tester jobs in London