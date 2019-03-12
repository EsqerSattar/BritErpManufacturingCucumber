package com.britErp.step_definitions;

import com.britErp.pages.LoginPage;
import com.britErp.pages.ManufacturingOrdersPage;
import com.britErp.utilities.BrowserUtils;
import com.britErp.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BRIT_3995StepDefinitions {


    @Then("the {string} should clickable")
    public void the_should_clickable(String pageElements) {
        ManufacturingOrdersPage manufacturingOrdersPage = new ManufacturingOrdersPage();

        switch (pageElements) {
            case "createButton":
               manufacturingOrdersPage.createButton.click();
                break;
            case "importButton":
                 manufacturingOrdersPage.importButton.click();
                break;
            case "mainSearchBox":
                manufacturingOrdersPage.mainSearchBox.click();
                break;
            case "listButton":
                 manufacturingOrdersPage.listButton.click();
                break;
            case "kanbanButton":
                manufacturingOrdersPage.kanbanButton.click();
                break;
            case "calendarButton":
                 manufacturingOrdersPage.calendarButton.click();
                break;
            case "pivotButton":
                manufacturingOrdersPage.pivotButton.click();
                break;
            case "graphButton":
                manufacturingOrdersPage.graphButton.click();
                break;
            default:
                throw new RuntimeException("No such button to click on the Create page");
        }

    }

    @When("user clicks on Create button")
    public void user_clicks_on_Create_button() {
        new ManufacturingOrdersPage().createButton.click();

    }

    @Then("the page title should be “New-Odoo”")
    public void the_page_title_should_be_New_Odoo() {
        BrowserUtils.pageTitleContains("New - Odoo",10);
    }

    @Then("the {string} should displayed")
    public void the_should_displayed(String pageElement) {
        ManufacturingOrdersPage manufacturingOrdersPage = new ManufacturingOrdersPage();

        switch (pageElement) {
            case "saveButton":
                manufacturingOrdersPage.saveButton.isDisplayed();
                break;
            case "discardButton":
                manufacturingOrdersPage.discardButton.isDisplayed();
                break;
            case "productDropDown":
                manufacturingOrdersPage.productDropDown.isDisplayed();
                break;
            case "quantityToProductBox":
                manufacturingOrdersPage.quantityToProductBox.isDisplayed();
                break;
            case "billOfMaterialBox":
                manufacturingOrdersPage.billOfMaterialBox.isDisplayed();
                break;
            case "deadlineStartBox":
                manufacturingOrdersPage.deadlineStartBox.isDisplayed();
                break;
            case "responsibleBox":
                manufacturingOrdersPage.responsibleBox.isDisplayed();
                break;
            case "sourceBox":
                manufacturingOrdersPage.sourceBox.click();
                break;
            default:
                throw new RuntimeException("No such element on the Create page");
        }
    }

}

