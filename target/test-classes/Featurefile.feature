Feature: To verify the Adactin Hotel Webpage

  Scenario: To verify Adactin Hotel LoginPage with valid Credentials
    Given User should be in Login page
    When User should enter the Username and Password
    And User should click the login button
    Then User should verify the login success message

  Scenario: To verify Adactin search Hotel for booking
    Given User should be able to Login Search page
    When User should select location,hotels,room type,No of rooms, check-in date,Check-out date, adults room and children room
    And User should able to click the search button and reset button
    Then verify whether user should be able to see the list of hotels
