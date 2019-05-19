package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.AddExtraPage.AddExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.EditExtraPage.EditExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ViewPage.ViewPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class ExtrasPage extends BasePage {

    @FindBy(css = ".btn-success:nth-child(2)")
    private WebElement addButton;

    @FindBy(css = ".xcrud-search-toggle")
    private WebElement searchButton;

    @FindBy(name = "phrase")
    private WebElement fieldSearch;

    @FindBy(name = "column")
    private WebElement selectField;

    @FindBy(css = ".btn-primary")
    private WebElement goButton;

    @FindBy(xpath = "//table[1]/tbody[1]/tr/td[3]")
    private List<WebElement> listaTablaName;

    private WebElement elementToChose;

    public AddExtraPage clickAddButton(){
        CommonEvents.waitWebElementIsVisible(addButton);
        CommonEvents.clickButton(addButton);
        return new AddExtraPage();
    }

    public ExtrasPage clickOnSearchButton() {
        CommonEvents.waitWebElementIsVisible(searchButton);
        CommonEvents.clickButton(searchButton);
        return this;
    }

    public ExtrasPage fillSearchField(String search){
        CommonEvents.waitWebElementIsVisible(fieldSearch);
        CommonEvents.setInputField(fieldSearch,search);
        return this;
    }

    public ExtrasPage selectField(String fieldToSearch){
        CommonEvents.waitWebElementIsVisible(selectField);
        CommonEvents.chooseDropDownByTextVisible(selectField,fieldToSearch);
        return this;
    }

    public ExtrasPage clickOnGoButton(){
        CommonEvents.waitWebElementIsVisible(goButton);
        CommonEvents.clickButton(goButton);
        return this;
    }


    private void searchLastElementToSelectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]//td[1]/input") );
    }


    private void searchLastElementToInspectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[9]/span/a[1]/i") );
    }

    private void searchLastElementToEditOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[9]/span/a[2]/i") );
    }

    private void searchLastElementToDeleteOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[9]/span/a[3]/i") );
    }

    public ExtrasPage chooseLastElementToSelect() {
        CommonEvents.forceWait(4000);
        searchLastElementToSelectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }


    public ViewPage clickIconElementToInspect() {
        CommonEvents.forceWait(4000);
        searchLastElementToInspectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new ViewPage();
    }

    public EditExtraPage clickIconElementToEdit() {
        CommonEvents.forceWait(4000);
        searchLastElementToEditOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new EditExtraPage();
    }

    public ExtrasPage clickIconElementToDelete() {
        CommonEvents.forceWait(4000);
        searchLastElementToDeleteOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }

    public ExtrasPage pressEnterKey() {
        CommonEvents.forceWait(3000);
        webDriver.switchTo().alert().accept();
        return this;
    }
}
