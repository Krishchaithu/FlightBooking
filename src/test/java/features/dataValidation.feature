Feature: test Blaze Flight bookings site

  Scenario: To verify data updated in reserve page and purchase page
    Given Travel world home page
    And  select departure city as "Boston"
    And select destination city as "London"
    And click on find flight button
    Then verify page heading "Flights from Boston to London:"
    Then Verify depaart heading contains "Boston" and Arrive heading contains "London"
    Then verify first row airline is "Virgin America"
    Then verify first row price is "$472.56"
    And select first button choose this flight
    Then verify page heading is "Your flight from TLV to SFO has been reserved."
    And Verify Airline is  "Virgin America"
    And Verify price is "$472.56"