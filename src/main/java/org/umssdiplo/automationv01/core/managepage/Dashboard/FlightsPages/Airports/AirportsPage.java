package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AddAirport.AddAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.EditAirport.EditAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.InspectAirport.InspectAirportPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class AirportsPage extends BasePage {

    @FindBy(css = ".btn-success:nth-child(2)")
    private WebElement addButton;

    @FindBy(css = ".xcrud-search-toggle")
    private WebElement searchButton;

    @FindBy(name = "phrase")
    private WebElement fieldElementToSearch;

    @FindBy(name = "column")
    private WebElement selectField;

    @FindBy(css = ".btn-primary")
    private WebElement goButton;

    @FindBy(xpath = "//table[1]/tbody[1]/tr/td[4]")
    private List<WebElement> listaTablaName;

    private WebElement elementToChose;

    public AddAirportPage clickOnAddButton() {
        CommonEvents.clickButton(addButton);
        return new AddAirportPage();
    }

    public AirportsPage clickOnSearchButton() {
        CommonEvents.clickButton(searchButton);
        return this;
    }

    public AirportsPage fillElementToSearch(String element) {
        CommonEvents.setInputField(fieldElementToSearch,element);
        return this;
    }

    public AirportsPage selectByField(String field) {
        CommonEvents.chooseDropDownByTextVisible(selectField,field);
        return this;
    }

    public AirportsPage clickOnGOButton() {
        CommonEvents.clickButton(goButton);
        return this;
    }


    private void searchLastElementToSelectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]//td[1]/input") );
    }


    private void searchLastElementToInspectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[13]/span/a[1]/i") );
    }

    private void searchLastElementToEditOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[13]/span/a[2]/i") );
    }

    private void searchLastElementToDeleteOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[13]/span/a[3]/i") );
    }

    public AirportsPage chooseLastElementToSelect() {
        CommonEvents.forceWait(4000);
        searchLastElementToSelectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }


    public InspectAirportPage clickIconElementToInspect() {
        CommonEvents.forceWait(2000);
        searchLastElementToInspectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new InspectAirportPage();
    }

    public EditAirportPage clickIconElementToEdit() {
        CommonEvents.forceWait(2000);
        searchLastElementToEditOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new EditAirportPage();
    }

    public AirportsPage clickIconElementToDelete() {
        CommonEvents.forceWait(2000);
        searchLastElementToDeleteOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }

    public AirportsPage pressEnterKey() {
        CommonEvents.forceWait(3000);
        webDriver.switchTo().alert().accept();
        return this;
    }
}
