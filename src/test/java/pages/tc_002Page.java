package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// importa utilidades relevantes para abrir y leer archivos Excel
import java.io.File;
// Importaciones necesarias para manejar Excel
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class tc_002Page {
    WebDriver driver;

    // Constructor
    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarInforme() {
        // lógica para exportar el informe
    }

    public void abrirArchivoExcel() {
        // lógica para abrir el archivo Excel
        // ejemplo: lanzar la aplicación que abre el Excel o cargar el archivo con POI
    }

    public void verificarColumnaEstadoCodigo() {
        // Lógica para ubicar la columna 'Estado Código' usando Apache POI o similar
        try {
            File file = new File("ruta/del/archivo.xlsx");
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            Row firstRow = sheet.getRow(0);
            boolean found = false;
            for (Cell cell : firstRow) {
                if (cell.getStringCellValue().equals("Estado Código")) {
                    found = true;
                    break;
                }
            }
            // assert para verificar que la columna fue encontrada en la posición esperada
            assert found : "La columna 'Estado Código' no está en la posición indicada";
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verificarPosicionColumnaEstadoCodigo() {
        // lógica similar para comprobar la posición exacta respecto a columna 'i'
    }

    public void compararConDocumentoRequerimientos() {
        // lógica para cargar el documento de requerimientos y comparar el orden de las columnas
    }

    public void validarOrdenColumnas() {
        // lógica adicional para validar que las columnas estén en conformidad con lo esperado
    }
}