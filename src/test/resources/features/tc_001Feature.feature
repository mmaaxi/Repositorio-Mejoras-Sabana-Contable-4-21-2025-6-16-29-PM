Feature: Export Report with New Column Order

  Scenario: Validate exportation of report with new column order
    Given the user is in the BaNCS system
    When the user navigates to the report generation module
    Then the user should see the export option
    When the user selects the option to export the 'Claim Accounting Report'
    Then the system should start the export process correctly
    And the exported Excel should contain columns in the new specified order