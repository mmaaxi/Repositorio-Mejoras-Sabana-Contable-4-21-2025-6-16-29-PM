package steps;

import static org.junit.Assert.assertTrue;
import pages.tc_005Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_005Steps {

    tc_005Page page = new tc_005Page();

    @Given("^el usuario ha exportado el informe$")
    public void el_usuario_ha_exportado_el_informe() {
        page.exportarInforme();
    }

    @When("^revisa la columna 'Monto Acumulado Folio OPC 2121'$")
    public void revisa_la_columna_monto_acumulado_folio_opc_2121() {
        page.revisarColumna();
    }

    @Then("^el campo aparece en el Excel$")
    public void el_campo_aparece_en_el_excel() {
        assertTrue(page.verificarCampoEnExcel());
    }

    @When("^verifica que la fórmula incluye todos los montos relevantes correctamente$")
    public void verifica_formula_correctamente() {
        page.verificarFormulaMontos();
    }

    @Then("^los valores calculados son consistentes y correctos$")
    public void los_valores_calculados_son_consistentes_correctos() {
        assertTrue(page.validarValoresCalculados());
    }

    @When("^compara con la documentación técnica$")
    public void compara_con_documentacion_tecnica() {
        page.compararConDocumentacion();
    }

    @Then("^la fórmula cumple con los requerimientos técnicos esperados$")
    public void la_formula_cumple_con_requerimientos_tecnicos() {
        assertTrue(page.validarRequerimientosTecnicos());
    }
}