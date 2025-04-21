Feature: Verificar renombramiento de columna 'Status de Pago'

  Scenario: Validación del renombramiento de columna en informe exportado
    Given el usuario ha exportado el informe
    When se localiza la columna 'Descripción Status Pago'
    Then se espera que la columna esté correctamente renombrada

    When se verifica la ausencia de duplicaciones o errores de nomenclatura
    Then se espera que el renombramiento sea uniforme en todo el documento

    When se revisa el documento de requerimientos
    Then se espera que la nomenclatura coincida y sea validada