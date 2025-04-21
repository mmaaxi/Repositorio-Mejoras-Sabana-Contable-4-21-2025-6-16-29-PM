package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_003Page;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page page;

    @Given("I perform the export of the report from the system")
    public void export_report() {
        page = new tc_003Page(driver);
        page.exportReport();
    }

    @When("I open the Excel file and locate the column 'Monto acumulado Folio Reserva 5401'")
    public void open_excel_and_locate_column() {
        page.openExcelAndLocateColumn("Monto acumulado Folio Reserva 5401");
    }

    @Then("the column should be present in the file")
    public void validate_column_presence() {
        page.validateColumnPresence("Monto acumulado Folio Reserva 5401");
    }

    @Then("the applied formula should be correct as per the requirements")
    public void validate_formula() {
        page.validateFormula();
    }
}