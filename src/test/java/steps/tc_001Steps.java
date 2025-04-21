package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page reportPage = new tc_001Page();

    @Given("the user is in the BaNCS system")
    public void userInBaNCSSystem() {
        // Implementation to verify user is logged into BaNCS system
    }

    @When("the user navigates to the report generation module")
    public void navigateToReportModule() {
        reportPage.navigateToReportModule();
    }

    @Then("the user should see the export option")
    public void verifyExportOptionVisible() {
        reportPage.verifyExportOptionVisible();
    }

    @When("the user selects the option to export the 'Claim Accounting Report'")
    public void selectExportOption() {
        reportPage.selectExportOption();
    }

    @Then("the system should start the export process correctly")
    public void verifyExportProcessStarted() {
        reportPage.verifyExportProcessStarted();
    }

    @Then("the exported Excel should contain columns in the new specified order")
    public void verifyExcelColumnOrder() {
        reportPage.verifyExcelColumnOrder();
    }
}