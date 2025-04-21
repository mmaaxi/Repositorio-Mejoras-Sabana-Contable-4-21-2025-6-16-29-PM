package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_010Page;
import static org.junit.Assert.*;

public class tc_010Steps {

    tc_010Page reportPage = new tc_010Page();

    @Given("the user is authenticated and navigated to the report page")
    public void navigateToReportPage() {
        reportPage.loginAndNavigateToReport();
    }

    @When("the report is exported in multiple formats")
    public void exportReportMultipleFormats() {
        reportPage.exportReport();
    }

    @Then("the system should allow multiple exports without errors")
    public void verifyMultipleExports() {
        assertTrue(reportPage.areMultipleExportsSuccessful());
    }

    @Given("the report is exported successfully")
    public void reportExportedSuccessfully() {
        assertTrue(reportPage.isReportExported());
    }

    @When("the data is validated between the system and exported Excel file")
    public void validateDataConsistency() {
        reportPage.validateDataConsistency();
    }

    @Then("the data should show high consistency")
    public void verifyDataConsistency() {
        assertTrue(reportPage.isDataConsistent());
    }

    @Given("discrepancies are identified during validation")
    public void identifyDiscrepancies() {
        reportPage.findDiscrepancies();
    }

    @When("the discrepancies are documented and compared to defined use cases")
    public void documentDiscrepancies() {
        reportPage.documentDiscrepancies();
    }

    @Then("the global integrity should conform to expectations")
    public void verifyGlobalIntegrity() {
        assertTrue(reportPage.isGlobalIntegrityMaintained());
    }
}