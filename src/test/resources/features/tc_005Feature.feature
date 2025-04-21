Feature: Validar actualización de fórmula 'Monto Acumulado Folio OPC 2121'

  @ValidacionFormula
  Scenario: Validar que la fórmula se exporta correctamente y es consistente
    Given el usuario ha exportado el informe
    When revisa la columna 'Monto Acumulado Folio OPC 2121'
    Then el campo aparece en el Excel

    When verifica que la fórmula incluye todos los montos relevantes correctamente
    Then los valores calculados son consistentes y correctos

    When compara con la documentación técnica
    Then la fórmula cumple con los requerimientos técnicos esperados