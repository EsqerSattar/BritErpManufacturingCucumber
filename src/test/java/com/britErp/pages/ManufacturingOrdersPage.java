package com.britErp.pages;

import com.britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManufacturingOrdersPage {
    public ManufacturingOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy( xpath = "(//li[@class='active'])[3]")
    public WebElement Header;

    @FindBy(xpath ="//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@type='button'][2]")
    public WebElement importButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement mainSearchButton;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@aria-label='calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "//button[@aria-label='pivot']")
    public WebElement pivotButton;

    @FindBy(xpath = "//button[@aria-label='graph']")
    public WebElement graphButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement cancelNewButton;

    @FindBy(xpath = "//div[@class='o_input_dropdown']/input")
    public WebElement productDropDown;

    @FindBy(xpath = "//li[@tabindex='-1'][2]")
    public WebElement createAndEditButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement productHeader;

    @FindBy(xpath = "//input[@name='date_planned_start']")
    public WebElement deadlineStartBox;

    @FindBy(xpath = "(//input[@autocomplete='off'])[4]")
    public WebElement responsibleBox;

    @FindBy(xpath = "(//button[@draggable='false'])[3]")
    public WebElement arrowButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement openPageHeader;

    @FindBy(xpath ="//*[.='ManufacturingManager'][1]")
    public WebElement userTitle;

    @FindBy(xpath = "//span[@name='login']")
    public WebElement loginUserName;

    @FindBy(xpath = "//*[@id=\"modal_303\"]/div/div/div[3]/button")
    public WebElement closeButton;

    @FindBy(xpath = "//li[@tabindex='-1'][8]")
    public WebElement searchMoreButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement searchPageHeader;

    @FindBy(xpath = "//div[@class='o_searchview']")
    public WebElement searchBoxInResponsiblePage;

    @FindBy(xpath = "//*[@id=\"modal_361\"]/div/div/div[3]/button/span")
    public WebElement cancel2;

    @FindBy(xpath = "//li[@tabindex='-1'][1]")
    public WebElement selectAny;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement errorPageHeader;

}
