package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute.AddRoutePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.EditRoute.EditRoutePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class RoutesPage extends BasePage {

    @FindBy(css = ".add_button > .btn")
    private WebElement addRouteButton;

    @FindBy(css = ".xcrud-search-toggle")
    private WebElement buttonSearch;

    @FindBy(name = "phrase")
    private WebElement fieldToSearch;

    @FindBy(name = "column")
    private WebElement selectFieldToSearch;

    @FindBy(css = ".btn-primary")
    private WebElement buttonGO;

    @FindBy(xpath = "//table[1]/tbody[1]/tr/td[4]")
    private List<WebElement> listaTablaName;

    private WebElement elementToChose;

    public AddRoutePage clickAddButton() {
        CommonEvents.waitWebElementIsVisible(addRouteButton);
        CommonEvents.clickButton(addRouteButton);
        return new AddRoutePage();
    }

    public RoutesPage clickOnSearchButton() {
        CommonEvents.waitWebElementIsVisible(buttonSearch);
        CommonEvents.clickButton(buttonSearch);
        return this;
    }

    public RoutesPage fillElementeToSearch(String searchElement) {
        CommonEvents.waitWebElementIsVisible(fieldToSearch);
        CommonEvents.setInputField(fieldToSearch,searchElement);
        return this;
    }

    public RoutesPage selectByField(String fieldToSearch) {
        CommonEvents.waitWebElementIsVisible(selectFieldToSearch);
        CommonEvents.chooseDropDownByTextVisible(selectFieldToSearch,fieldToSearch);
        return this;
    }

    public RoutesPage clickOnGOButton() {
        CommonEvents.waitWebElementIsVisible(buttonGO);
        CommonEvents.clickButton(buttonGO);
        return this;
    }


    private void searchLastElementToSelectOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]//td[1]/input") );
    }

    private void searchLastElementToEditOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[13]/span/a[1]/i") );
    }

    private void searchLastElementToDeleteOnTable() {
        elementToChose = webDriver.findElement(By.xpath("//tbody//tr["+listaTablaName.size()+"]/td[13]/span/a[2]/i") );
    }


    public RoutesPage chooseLastElementToSelect() {
        CommonEvents.forceWait(4000);
        searchLastElementToSelectOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }

    public EditRoutePage clickIconElementToEdit() {
        CommonEvents.forceWait(4000);
        searchLastElementToEditOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return new EditRoutePage();
    }

    public RoutesPage clickIconElementToDelete() {
        CommonEvents.forceWait(4000);
        searchLastElementToDeleteOnTable();
        CommonEvents.waitWebElementIsVisible(elementToChose);
        CommonEvents.clickButton(elementToChose);
        return this;
    }

    public RoutesPage pressEnterKey() {
        CommonEvents.forceWait(4000);
        webDriver.switchTo().alert().accept();
        return this;
    }
}
