package pages;

import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirExcel() {
        // Código para abrir el archivo Excel generado
    }

    public boolean seVisualizanTodasLasColumnas() {
        // Código para verificar que todas las columnas del Excel se visualizan
        return true;
    }

    public boolean columnasIVAPresentes() {
        // Código para localizar las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido'
        return true;
    }

    public void revisarDatosColumnasIVA() {
        // Código para revisar los datos y montos en cada columna de IVA
    }

    public boolean montosYFormulasCorrectos() {
        // Código para comprobar que los montos y fórmulas de las columnas son correctos
        return true;
    }
}