Feature: Validate the appearance and formula of 'Monto acumulado Folio Reserva 5401'

  Scenario: Validate the cumulative amount formula and appearance
    Given I perform the export of the report from the system
    When I open the Excel file and locate the column 'Monto acumulado Folio Reserva 5401'
    Then the column should be present in the file
    And the applied formula should be correct as per the requirements