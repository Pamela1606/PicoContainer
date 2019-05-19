package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AddAirlines.AddAirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.EditAirlines.EditAirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.InspectAirlines.InspectAirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AirportsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.EditAirport.EditAirportPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.InspectAirport.InspectAirportPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;


public class AirlinesPage extends BasePage {

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

    public AddAirlinesPage clickAddButton(){
        CommonEvents.waitWebElementIsVisible(addButton);
        CommonEvents.clickButton(addButton);
        return new AddAirlinesPage();
    }

    public AirlinesPage clickOnSearchButton() {
        CommonEvents.waitWebElementIsVisible(searchButton);
        CommonEvents.clickButton(searchButton);
        return this;
    }

    public AirlinesPage fillSearchField(String search){
        CommonEvents.waitWebElementIsVisible(fieldSearch);
        CommonEvents.setInputField(fieldSearch,search);
        return this;
    }

    public AirlinesPage selectField(String fieldToSearch){
        CommonEvents.waitWebElementIsVisible(selectField);
        CommonEvents.chooseDropDownByTextVisible(selectField,fieldToSearch);
        return this;
    }

    public AirlinesPage clickOnGoButton(){
        CommonEvents.waitWebElementIsVisible(goButton);
        CommonEvents.clickButton(goButton);
        return this;
    }


    private void searchLastElementToSelectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]//td[1]/input") );
    }


    private void searchLastElementToInspectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[8]/span/a[1]/i") );
    }

    private void searchLastElementToEditOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[8]/span/a[2]/i") );
    }

    private void searchLastElementToDeleteOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[8]/span/a[3]/i") );
    }

    public AirlinesPage chooseLastElementToSelect() {
        CommonEvents.forceWait(4000);
        searchLastElementToSelectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }


    public InspectAirlinesPage clickIconElementToInspect() {
        CommonEvents.forceWait(4000);
        searchLastElementToInspectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new InspectAirlinesPage();
    }

    public EditAirlinesPage clickIconElementToEdit() {
        CommonEvents.forceWait(4000);
        searchLastElementToEditOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new EditAirlinesPage();
    }

    public AirlinesPage clickIconElementToDelete() {
        CommonEvents.forceWait(4000);
        searchLastElementToDeleteOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }

    public AirlinesPage pressEnterKey() {
        CommonEvents.forceWait(3000);
        webDriver.switchTo().alert().accept();
        return this;
    }
}
