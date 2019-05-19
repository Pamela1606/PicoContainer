package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.AddRoute;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class AddRoutePage extends BasePage {

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

    @FindBy(id = "add")
    private WebElement submitButton;


    public AddRoutePage selectStatus(String status) {
        CommonEvents.waitWebElementIsVisible(selectStatus);
        CommonEvents.chooseDropDownByTextVisible(selectStatus,status);
        return this;
    }

    public AddRoutePage fillTotalHours(String totalHours) {
        CommonEvents.waitWebElementIsVisible(fieldTotalHours);
        CommonEvents.setInputField(fieldTotalHours,totalHours);
        return this;
    }

    public AddRoutePage fillVatTax(String vatTax) {
        CommonEvents.waitWebElementIsVisible(fieldVatTax);
        CommonEvents.setInputField(fieldVatTax,vatTax);
        return this;
    }

    public AddRoutePage fillDeposite(String deposite) {
        CommonEvents.waitWebElementIsVisible(fieldVatTax);
        CommonEvents.setInputField(fieldDeposite,deposite);
        return this;
    }

    public AddRoutePage selectFlightsType(String flightType) {
        CommonEvents.waitWebElementIsVisible(selectflightType);
        CommonEvents.chooseDropDownByTextVisible(selectflightType,flightType);
        return this;
    }

    public AddRoutePage selectRefundable(String refundable) {
        CommonEvents.waitWebElementIsVisible(selectRefundable);
        CommonEvents.chooseDropDownByTextVisible(selectRefundable,refundable);
        return this;
    }

    public AddRoutePage selectDirection(String direction) {
        CommonEvents.waitWebElementIsVisible(selectDirection);
        CommonEvents.chooseDropDownByTextVisible(selectDirection,direction);
        return this;
    }

    public AddRoutePage fillPriceAdults(String priceAdults) {
        CommonEvents.waitWebElementIsVisible(fieldPriceAdults);
        CommonEvents.setInputField(fieldPriceAdults,priceAdults);
        return this;
    }

    public AddRoutePage fillPriceChild(String priceChild) {
        CommonEvents.waitWebElementIsVisible(fieldPriceChild);
        CommonEvents.setInputField(fieldPriceChild,priceChild);
        return this;
    }

    public AddRoutePage fillPriceInfant(String priceInfant) {
        CommonEvents.waitWebElementIsVisible(fieldPriceInfant);
        CommonEvents.setInputField(fieldPriceInfant,priceInfant);
        return this;
    }

    public AddRoutePage selectCityAirportDeparture(String cityAirportDeparture) {
        CommonEvents.waitWebElementIsVisible(departureCityAirport);
        CommonEvents.clickButton(departureCityAirport);
        CommonEvents.waitWebElementIsVisible(fieldCityAirportDeparture);
        CommonEvents.setInputField(fieldCityAirportDeparture,cityAirportDeparture);
        CommonEvents.forceWait(4000);
        CommonEvents.pressEnterKey(fieldCityAirportDeparture);
        return this;
    }

    public AddRoutePage selectAirlineDeparture(String airlineDeparture) {
        CommonEvents.waitWebElementIsVisible(departureAirline);
        CommonEvents.clickButton(departureAirline);
        CommonEvents.waitWebElementIsVisible(fieldAirlineDeparture);
        CommonEvents.setInputField(fieldAirlineDeparture,airlineDeparture);
        CommonEvents.forceWait(4003);
        CommonEvents.pressEnterKey(fieldAirlineDeparture);
        return this;
    }

    public AddRoutePage fillFlightsNoDeparture(String flightsNo) {
        CommonEvents.waitWebElementIsVisible(fieldFlightsNoDeparture);
        CommonEvents.setInputField(fieldFlightsNoDeparture,flightsNo);
        return this;
    }

    public AddRoutePage fillDateDeparture(String dateDeparture) {
        CommonEvents.waitWebElementIsVisible(fieldDateDeparture);
        CommonEvents.setInputField(fieldDateDeparture,dateDeparture);
        CommonEvents.clickButton(fieldDateDeparture);
        return this;
    }

    public AddRoutePage fillTimeDeparture(String time) {
        CommonEvents.waitWebElementIsVisible(fieldTimeDeparture);
        CommonEvents.setInputField(fieldTimeDeparture,time);
        CommonEvents.pressEnterKey(fieldTimeDeparture);
        return this;
    }

    public AddRoutePage fillCheckOutDeparture(String checkout) {
        CommonEvents.waitWebElementIsVisible(fieldCheckOutDeparture);
        CommonEvents.setInputField(fieldCheckOutDeparture,checkout);
        CommonEvents.pressEnterKey(fieldCheckOutDeparture);
        return this;
    }

    public AddRoutePage selectCityAirportArrival(String cityAirportArrival) {
        CommonEvents.waitWebElementIsVisible(arrivalCityAirport);
        CommonEvents.clickButton(arrivalCityAirport);
        CommonEvents.waitWebElementIsVisible(fieldCityAirportArrival);
        CommonEvents.setInputField(fieldCityAirportArrival,cityAirportArrival);
        CommonEvents.forceWait(4001);
        CommonEvents.pressEnterKey(fieldCityAirportArrival);
        return this;
    }

    public AddRoutePage selectAirlineArrival(String airlineArrival) {
        CommonEvents.waitWebElementIsVisible(arrivalAirline);
        CommonEvents.clickButton(arrivalAirline);
        CommonEvents.waitWebElementIsVisible(fieldAirlineArrival);
        CommonEvents.setInputField(fieldAirlineArrival,airlineArrival);
        CommonEvents.forceWait(4002);
        CommonEvents.pressEnterKey(fieldAirlineArrival);
        return this;
    }

    public AddRoutePage fillFlightsNoArrival(String flightsArrival) {
        CommonEvents.waitWebElementIsVisible(fieldFlightsNoArrival);
        CommonEvents.setInputField(fieldFlightsNoArrival,flightsArrival);
        return this;
    }

    public AddRoutePage fillDateArrival(String dateArrival) {
        CommonEvents.waitWebElementIsVisible(fieldDateArrival);
        CommonEvents.setInputField(fieldDateArrival,dateArrival);
        CommonEvents.clickButton(fieldDateArrival);
        return this;
    }

    public AddRoutePage fillTimeArrival(String timeArrival) {
        CommonEvents.waitWebElementIsVisible(fieldTimeArrival);
        CommonEvents.setInputField(fieldTimeArrival,timeArrival);
        CommonEvents.pressEnterKey(fieldTimeArrival);
        return this;
    }

    public AddRoutePage fillCheckOutArrival(String checkOutArrival) {
        CommonEvents.waitWebElementIsVisible(fieldCheckOutArrival);
        CommonEvents.setInputField(fieldCheckOutArrival,checkOutArrival);
        return this;
    }

    public RoutesPage clickOnSubmit() {
        CommonEvents.waitWebElementIsVisible(submitButton);
        CommonEvents.clickButton(submitButton);
        return new RoutesPage();
    }
}
