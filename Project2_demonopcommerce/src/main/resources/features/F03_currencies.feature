@smoke
Feature | Check products currency after selecting Euro

  Scenario: guest user could register with valid data successfully
    When user select "Euro" currency from the home page
    Then Euro Symbol "€" is shown on the 4 products displayed in Home page