package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page tc004Page = PageFactory.initElements(driver, tc_004Page.class);

    @Given("La exportación se ha ejecutado correctamente")
    public void laExportacionSeHaEjecutadoCorrectamente() {
        // Código para ejecutar la exportación del archivo Excel
    }

    @When("Se abre el archivo Excel generado")
    public void seAbreElArchivoExcelGenerado() {
        tc004Page.abrirExcel();
    }

    @Then("El Excel se abre y muestra todas las columnas")
    public void elExcelSeAbreYMuestraTodasLasColumnas() {
        assert(tc004Page.seVisualizanTodasLasColumnas());
    }

    @When("Se localizan las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido'")
    public void seLocalizanLasColumnasIVA() {
        assert(tc004Page.columnasIVAPresentes());
    }

    @Then("Las tres columnas se encuentran presentes en el documento")
    public void lasTresColumnasSeEncuentranPresentesEnElDocumento() {
        // Validación realizada en el paso previo
    }

    @When("Se revisan los datos y montos en cada columna de IVA")
    public void seRevisanLosDatosYMontosEnCadaColumnaDeIVA() {
        tc004Page.revisarDatosColumnasIVA();
    }

    @Then("Los montos y fórmulas en las columnas son precisos")
    public void losMontosYFormulasEnLasColumnasSonPrecisos() {
        assert(tc004Page.montosYFormulasCorrectos());
    }
}