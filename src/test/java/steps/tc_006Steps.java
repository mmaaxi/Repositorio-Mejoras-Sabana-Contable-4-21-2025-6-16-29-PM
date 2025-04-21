package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {
    tc_006Page page = new tc_006Page();

    @Given("el usuario ha exportado los datos")
    public void exportaDatos() {
        page.exportarDatos();
    }

    @When("el usuario accede a la columna 'IVA Acumulado'")
    public void accedeColumnaIva() {
        page.accederColumnaIvaAcumulado();
    }

    @Then("el archivo muestra la columna correctamente")
    public void archivoMuestraColumna() {
        Assert.assertTrue(page.verificarColumnaCorrectamente());
    }

    @When("el usuario confirma que la modificación excluya el IVA retenido")
    public void confirmarExclusionIvaRetenido() {
        page.confirmarExclusionIvaRetenido();
    }

    @Then("el cálculo refleja la exclusión de IVA retenido de forma precisa")
    public void calculoReflejaExclusionIva() {
        Assert.assertTrue(page.verificarCalculoExclusiónIvaPreciso());
    }

    @When("el usuario revisa resultados contra datos esperados aprobados")
    public void revisarResultados() {
        page.revisarResultadosContraDatosEsperados();
    }

    @Then("los resultados son consistentes y validados")
    public void resultadosSonConsistentes() {
        Assert.assertTrue(page.resultadosConsistentesYValidados());
    }
}