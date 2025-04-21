Feature: Verificar columna 'Estado Código' y su posición

  Scenario: Verificar posición de la columna 'Estado Código' en el archivo Excel exportado
    Given El usuario ha exportado el informe y abierto el archivo Excel generado
    When El usuario confirma que la columna 'Estado Código' aparezca junto a la columna 'i'
    Then La columna 'Estado Código' se muestra correctamente en la posición indicada
    And El usuario compara con el documento de requerimientos para validar conformidad
    Then El orden de columnas coincide con el especificado