Feature: test Blaze Flight bookings site

  Scenario: Find flights for from and to destination and purchase with all valid data
    Given Travel world home page
    Then Verify page title is "BlazeDemo"
    Then page heading is "Welcome to the Simple Travel Agency!"
    Then verify destination of the week! The Beach! link is available
    And  select departure city as "Paris"
    And select destination city as "Rome"
    And click on find flight button
    Then verify page heading "Flights from Paris to Rome:"
    Then verify table with headings
    And select first button choose this flight
    Then verify page heading is "Your flight from TLV to SFO has been reserved."
    Then Verify Airline flightnummber price arbitary fee  and total cost
    Then veirfy heading "Please submit the form below to purchase the flight."
    And enter first name "Auto test"
    And  enter address "this is for testing address"
    And enter city "cityName"
    And enter state "this is state"
    And enter zip code "510043"
    And enter card number "2345123412567009"
    And entr month "09"
    And enter year "2021"
    And enter name on card "Test User"
    And check rememberme
    And submit purchase flight
    Then Verify heading is "Thank you for your purchase today!"
    Then verify table contains Id status amount cardNumber Expiration auth code and date
    Then Verify table values are not empty






