Feature: Verificar correcta asignación de columnas de IVA

  Scenario: Validar columnas de IVA en exportación de Excel
    Given La exportación se ha ejecutado correctamente
    When Se abre el archivo Excel generado
    Then El Excel se abre y muestra todas las columnas

    When Se localizan las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido'
    Then Las tres columnas se encuentran presentes en el documento

    When Se revisan los datos y montos en cada columna de IVA
    Then Los montos y fórmulas en las columnas son precisos