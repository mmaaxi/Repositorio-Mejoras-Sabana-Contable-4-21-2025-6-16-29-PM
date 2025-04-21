Feature: Validar generación correcta de 'Status Pago Código'

  Scenario: Verificación de la creación e integridad de 'Status Pago Código'
    Given El informe es exportado correctamente
    When Reviso la creación de la columna 'Status Pago Código'
    Then La columna se genera sin valores iniciales tal como se requiere

    When Verifico la integridad de la columna 'Status Pago Código'
    Then El campo está preparado para futuras modificaciones

    When Consulto la documentación y registros de diseño
    Then El comportamiento coincide con lo estipulado en el diseño