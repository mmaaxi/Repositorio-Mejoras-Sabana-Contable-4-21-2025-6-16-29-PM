Feature: Confirmar generación de columnas para futuros valores

  Scenario: Verificar la generación de columnas y estructura para futuros valores
    Given El usuario ha generado el Excel exportado
    When Localiza las columnas 'Folio Pre solicitud' y 'Folio de Pago'
    Then Ambas columnas se muestran aunque sin datos iniciales

    When Verifica que los campos permiten la incorporación futura de datos
    Then La estructura facilita la entrada posterior de valores

    When Valida conformidad con el diseño planteado en el requerimiento
    Then La estructura y comportamiento son correctos