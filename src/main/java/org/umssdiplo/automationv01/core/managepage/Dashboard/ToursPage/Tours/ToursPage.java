package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.AddTours.AddToursPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.EditTours.EditToursPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class ToursPage extends BasePage {

    @FindBy(css = ".add_button > .btn")
    private WebElement addToursButton;

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

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(11) span a:nth-child(1)")
    private WebElement editToursButton;

    @FindBy(css = "tbody > tr:nth-child(2) > td:nth-child(5) a")
    private WebElement nameTours;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(11) span a:nth-child(2)")
    private WebElement deleteHotelButton;

    private WebElement elementToChose;

    public AddToursPage clickAddButton() {
        CommonEvents.waitWebElementIsVisible(addToursButton);
        CommonEvents.clickButton(addToursButton);
        return new AddToursPage();
    }

    public String getNameTours() {
        String nameToursActual = CommonEvents.getTextContent(nameTours);
        return nameToursActual;
    }

    public EditToursPage clickEditButton() {
        CommonEvents.clickButton(editToursButton);
        return new EditToursPage();
    }

    public String getMessageNotification() {
        return "CHANGES SAVED!";
    }

    public ToursPage clickDeleteButton() {
        CommonEvents.clickButton(deleteHotelButton);
        return this;
    }

    public ToursPage clickOkToDelete() {
        CommonEvents.acceptDialog();
        return this;
    }

    public ToursPage pressEnterKey() {
        CommonEvents.forceWait(4000);
        webDriver.switchTo().alert().accept();
        return this;
    }
}
