package steps;

import pages.tc_008Page;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("^El informe es exportado correctamente$")
    public void elInformeEsExportadoCorrectamente() {
        page.exportReport();
    }

    @When("^Reviso la creación de la columna 'Status Pago Código'$")
    public void revisoLaCreacionDeLaColumna() {
        page.checkColumnCreation();
    }

    @Then("^La columna se genera sin valores iniciales tal como se requiere$")
    public void laColumnaSeGeneraSinValoresIniciales() {
        Assert.assertTrue(page.isColumnGeneratedCorrectly());
    }

    @When("^Verifico la integridad de la columna 'Status Pago Código'$")
    public void verificoLaIntegridadDeLaColumna() {
        page.verifyColumnIntegrity();
    }

    @Then("^El campo está preparado para futuras modificaciones$")
    public void elCampoEstaPreparadoParaFuturasModificaciones() {
        Assert.assertTrue(page.isFieldReadyForModifications());
    }

    @When("^Consulto la documentación y registros de diseño$")
    public void consultoLaDocumentacionYRegistrosDeDiseno() {
        page.checkDocumentationAndDesignRecords();
    }

    @Then("^El comportamiento coincide con lo estipulado en el diseño$")
    public void elComportamientoCoincideConLoEstipuladoEnElDiseno() {
        Assert.assertTrue(page.isBehaviorAsDesigned());
    }
}