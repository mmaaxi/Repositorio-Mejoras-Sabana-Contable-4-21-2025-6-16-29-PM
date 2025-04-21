Feature: Verificar modificación de fórmula 'IVA Acumulado'

  Scenario: Validación de modificación de fórmula 'IVA Acumulado'
    Given el usuario ha exportado los datos
    When el usuario accede a la columna 'IVA Acumulado'
    Then el archivo muestra la columna correctamente
    When el usuario confirma que la modificación excluya el IVA retenido
    Then el cálculo refleja la exclusión de IVA retenido de forma precisa
    When el usuario revisa resultados contra datos esperados aprobados
    Then los resultados son consistentes y validados