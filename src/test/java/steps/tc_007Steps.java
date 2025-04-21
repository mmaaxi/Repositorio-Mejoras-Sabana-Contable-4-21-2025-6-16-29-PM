package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page page = new tc_007Page();

    @Given("^El usuario ha generado el Excel exportado$")
    public void generateExcel() {
        page.generateExcel();
    }

    @When("^Localiza las columnas 'Folio Pre solicitud' y 'Folio de Pago'$")
    public void locateColumns() {
        page.locateColumns();
    }

    @Then("^Ambas columnas se muestran aunque sin datos iniciales$")
    public void verifyColumnsDisplayed() {
        page.verifyColumnsDisplayed();
    }

    @When("^Verifica que los campos permiten la incorporación futura de datos$")
    public void checkFieldsEditable() {
        page.checkFieldsEditable();
    }

    @Then("^La estructura facilita la entrada posterior de valores$")
    public void verifyStructureFacilitatesDataEntry() {
        page.verifyStructureFacilitatesDataEntry();
    }

    @When("^Valida conformidad con el diseño planteado en el requerimiento$")
    public void validateDesignCompliance() {
        page.validateDesignCompliance();
    }

    @Then("^La estructura y comportamiento son correctos$")
    public void verifyDesignCorrectness() {
        page.verifyDesignCorrectness();
    }
}