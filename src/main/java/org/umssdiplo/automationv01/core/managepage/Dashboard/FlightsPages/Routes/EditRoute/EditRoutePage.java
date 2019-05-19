package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.EditRoute;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class EditRoutePage extends BasePage {

    @FindBy(name = "flightstatus")
    private WebElement selectStatus;

    @FindBy(name = "total_hours")
    private WebElement fieldTotalHours;

    @FindBy(name = "tax")
    private WebElement fieldVatTax;

    @FindBy(name = "deposite")
    private WebElement fieldDeposite;

    @FindBy(name = "flighttype")
    private WebElement selectflightType;

    @FindBy(name = "refundable")
    private WebElement selectRefundable;

    @FindBy(name = "flightmode")
    private WebElement selectDirection;

    @FindBy(name = "adultprice[]" )
    private WebElement fieldPriceAdults;

    @FindBy(name = "childprice[]")
    private WebElement fieldPriceChild;

    @FindBy(name = "infantprice[]")
    private WebElement fieldPriceInfant;

    @FindBy(css = "#s2id_locationlist_0 > a")
    private WebElement departureCityAirport;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement fieldCityAirportDeparture;

    @FindBy(css = "#s2id_aeroplanes_0 > a:nth-child(1)")
    private WebElement departureAirline;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement fieldAirlineDeparture;

    @FindBy(name = "flightnos_[]")
    private WebElement fieldFlightsNoDeparture;

    @FindBy(name = "date_[]")
    private WebElement fieldDateDeparture;

    @FindBy(xpath = "//tr[@id='template']/th[6]/input")
    private WebElement fieldTimeDeparture;

    @FindBy(css="th:nth-child(7) > .clockface-open")
    private WebElement fieldCheckOutDeparture;

    @FindBy(css = "#s2id_locationlist_1 > a")
    private WebElement arrivalCityAirport;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input")
    private WebElement fieldCityAirportArrival;

    @FindBy(css = "#s2id_aeroplanes_1 > a")
    private WebElement arrivalAirline;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input")
    private WebElement fieldAirlineArrival;

    @FindBy(css = "tr.template_class:nth-child(2) > th:nth-child(4) > input")
    private WebElement fieldFlightsNoArrival;

    @FindBy(css = ".date_class1")
    private WebElement fieldDateArrival;

    @FindBy(xpath = "(//tr[@id='template']/th[6]/input)[2]")
    private WebElement fieldTimeArrival;

    @FindBy(xpath = "(//tr[@id='template']/th[7]/input)[2]")
    private WebElement fieldCheckOutArrival;

    @FindBy(id = "manage")
    private WebElement submitButton;

    public EditRoutePage selectStatus(String status) {
        CommonEvents.waitWebElementIsVisible(selectStatus);
        CommonEvents.chooseDropDownByTextVisible(selectStatus,status);
        return this;
    }

    public EditRoutePage editTotalHoursField(String totalHours) {
        CommonEvents.waitWebElementIsVisible(fieldTotalHours);
        CommonEvents.setInputField(fieldTotalHours,totalHours);
        return this;
    }

    public EditRoutePage editVatTaxField(String vatTax) {
        CommonEvents.waitWebElementIsVisible(fieldVatTax);
        CommonEvents.setInputField(fieldVatTax,vatTax);
        return this;
    }

    public EditRoutePage editDepositeField(String deposite) {
        CommonEvents.waitWebElementIsVisible(fieldDeposite);
        CommonEvents.setInputField(fieldDeposite,deposite);
        return this;
    }

    public EditRoutePage editselectFlightType(String flightType) {
        CommonEvents.waitWebElementIsVisible(selectflightType);
        CommonEvents.chooseDropDownByTextVisible(selectflightType,flightType);
        return this;
    }

    public EditRoutePage editselectRefundable(String refundable) {
        CommonEvents.waitWebElementIsVisible(selectRefundable);
        CommonEvents.chooseDropDownByTextVisible(selectRefundable,refundable);
        return this;
    }

    public EditRoutePage editDateDeparture(String dateDeparture) {
        CommonEvents.waitWebElementIsVisible(fieldDateDeparture);
        CommonEvents.setInputField(fieldDateDeparture,dateDeparture);
        CommonEvents.clickButton(fieldDateDeparture);
        return this;
    }

    public EditRoutePage editDateArrival(String dateArrival) {
        CommonEvents.waitWebElementIsVisible(fieldDateArrival);
        CommonEvents.setInputField(fieldDateArrival,dateArrival);
        CommonEvents.clickButton(fieldDateArrival);
        return this;
    }

    public RoutesPage clickOnSubmit() {
        CommonEvents.waitWebElementIsVisible(submitButton);
        CommonEvents.clickButton(submitButton);
        return new RoutesPage();
    }
}
