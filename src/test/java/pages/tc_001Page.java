package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    By reportModuleLink = By.id("reportModuleLink");
    By exportOption = By.id("exportOption");
    By claimAccountingReport = By.id("claimAccountingReport");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToReportModule() {
        driver.findElement(reportModuleLink).click();
    }

    public void verifyExportOptionVisible() {
        WebElement exportButton = driver.findElement(exportOption);
        if (!exportButton.isDisplayed()) {
            throw new AssertionError("Export option is not visible");
        }
    }

    public void selectExportOption() {
        driver.findElement(claimAccountingReport).click();
    }

    public void verifyExportProcessStarted() {
        // Implementation to verify if export process has initiated
    }

    public void verifyExcelColumnOrder() {
        // Implementation to verify the column order in the exported Excel
    }
}