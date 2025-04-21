Feature: Validate Global Integrity and Data Consistency of Exported Information

  Scenario: Export report in different usage scenarios
    Given the user is authenticated and navigated to the report page
    When the report is exported in multiple formats
    Then the system should allow multiple exports without errors

  Scenario: Cross-validate data between system and Excel
    Given the report is exported successfully
    When the data is validated between the system and exported Excel file
    Then the data should show high consistency

  Scenario: Document and validate discrepancies against defined use cases
    Given discrepancies are identified during validation
    When the discrepancies are documented and compared to defined use cases
    Then the global integrity should conform to expectations