Feature: NoBroker
  Scenario: Open No Broker
    Given User is on NoBroker
    And User selects City and Locality
    And User selects Apratment Type and click on Search button
    And User selects a property
    Then User should see Description
