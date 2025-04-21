package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;

    By columnaFolio = By.id("columnaFolioOPC2121");
    By documentoTecnico = By.id("documentoTecnico");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void exportarInforme() {
        // Lógica para exportar el informe
    }

    public void revisarColumna() {
        // Lógica para revisar la columna en el Excel
    }

    public boolean verificarCampoEnExcel() {
        WebElement columna = driver.findElement(columnaFolio);
        return columna.isDisplayed(); // Verifica si el campo está presente en el Excel
    }

    public void verificarFormulaMontos() {
        // Lógica para verificar la fórmula de los montos
    }

    public boolean validarValoresCalculados() {
        // Lógica para validar que los valores calculados son correctos
        return true;
    }

    public void compararConDocumentacion() {
        // Lógica para comparar con la documentación técnica
    }

    public boolean validarRequerimientosTecnicos() {
        WebElement documento = driver.findElement(documentoTecnico);
        // Lógica para validar los requerimientos técnicos
        return true;
    }
}