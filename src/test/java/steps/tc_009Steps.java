package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;
import org.junit.Assert;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el usuario ha exportado el informe")
    public void elUsuarioHaExportadoElInforme() {
        page.exportarInforme();
    }

    @When("se localiza la columna 'Descripción Status Pago'")
    public void seLocalizaLaColumna() {
        Assert.assertTrue(page.columnRenamedCorrectly());
    }

    @Then("se espera que la columna esté correctamente renombrada")
    public void seEsperaQueLaColumnaEStéCorrectamenteRenombrada() {
        // Validation is already done in the previous step
    }

    @When("se verifica la ausencia de duplicaciones o errores de nomenclatura")
    public void seVerificaLaAusenciaDeDuplicaciones() {
        Assert.assertTrue(page.noDuplicationsOrErrors());
    }

    @Then("se espera que el renombramiento sea uniforme en todo el documento")
    public void seEsperaQueElRenombramientoSeaUniformeEnTodoElDocumento() {
        // Validation is already done in the previous step
    }

    @When("se revisa el documento de requerimientos")
    public void seRevisaElDocumentoDeRequerimientos() {
        Assert.assertTrue(page.matchesRequirementsDocument());
    }

    @Then("se espera que la nomenclatura coincida y sea validada")
    public void seEsperaQueLaNomenclaturaCoincidaYSeaValidada() {
        // Validation is already done in the previous step
    }
}