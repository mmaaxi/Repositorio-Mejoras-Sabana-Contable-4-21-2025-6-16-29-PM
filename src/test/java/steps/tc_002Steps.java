package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("El usuario ha exportado el informe y abierto el archivo Excel generado")
    public void abrirArchivoExcel() {
        page.exportarInforme();
        page.abrirArchivoExcel();
    }

    @When("El usuario confirma que la columna 'Estado Código' aparezca junto a la columna 'i'")
    public void confirmarColumnaEstadoCodigo() {
        page.verificarColumnaEstadoCodigo();
    }

    @Then("La columna 'Estado Código' se muestra correctamente en la posición indicada")
    public void verificarPosicionColumna() {
        page.verificarPosicionColumnaEstadoCodigo();
    }

    @When("El usuario compara con el documento de requerimientos para validar conformidad")
    public void compararConRequerimientos() {
        page.compararConDocumentoRequerimientos();
    }

    @Then("El orden de columnas coincide con el especificado")
    public void verificarOrdenColumnas() {
        page.validarOrdenColumnas();
    }
}