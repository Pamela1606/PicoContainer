package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AddAirport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AirportsPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class AddAirportPage extends BasePage {

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb2Rl")
    private WebElement fieldCode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5uYW1l")
    private WebElement fieldName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5Q29kZQ--")
    private WebElement fieldCitycode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5TmFtZQ--")
    private WebElement fieldCityName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5TmFtZQ--")
    private WebElement fieldCountryName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5Q29kZQ--")
    private WebElement fieldCountryCode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy50aW1lem9uZQ--")
    private WebElement fieldTimeZone;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5sYXQ-")
    private WebElement fieldLatitud;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5sb24-")
    private WebElement fieldLongitud;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5")
    private WebElement fieldCity;

    @FindBy(css = ".btn-primary")
    private WebElement saveReturnButton;

    public AddAirportPage fillCode(String code) {
        CommonEvents.waitWebElementIsVisible(fieldCode);
        CommonEvents.setInputField(fieldCode,code);
        return this;
    }

    public AddAirportPage fillName(String name) {
        CommonEvents.waitWebElementIsVisible(fieldName);
        CommonEvents.setInputField(fieldName,name);
        return this;
    }

    public AddAirportPage fillCitycode(String cityCode) {
        CommonEvents.waitWebElementIsVisible(fieldCitycode);
        CommonEvents.setInputField(fieldCitycode,cityCode);
        return this;
    }

    public AddAirportPage fillCityname(String cityName) {
        CommonEvents.waitWebElementIsVisible(fieldCityName);
        CommonEvents.setInputField(fieldCityName,cityName);
        return this;
    }

    public AddAirportPage fillCountryname(String countryName) {
        CommonEvents.waitWebElementIsVisible(fieldCountryName);
        CommonEvents.setInputField(fieldCountryName,countryName);
        return this;
    }

    public AddAirportPage fillCountrycode(String countryCode) {
        CommonEvents.waitWebElementIsVisible(fieldCountryCode);
        CommonEvents.setInputField(fieldCountryCode,countryCode);
        return this;
    }

    public AddAirportPage fillTimezone(String timeZone) {
        CommonEvents.waitWebElementIsVisible(fieldTimeZone);
        CommonEvents.setInputField(fieldTimeZone,timeZone);
        return this;
    }

    public AddAirportPage fillLatitud(String latitud) {
        CommonEvents.waitWebElementIsVisible(fieldLatitud);
        CommonEvents.setInputField(fieldLatitud,latitud);
        return this;
    }

    public AddAirportPage fillLongitud(String longitud) {
        CommonEvents.waitWebElementIsVisible(fieldLongitud);
        CommonEvents.setInputField(fieldLongitud,longitud);
        return this;
    }

    public AddAirportPage fillCity(String city) {
        CommonEvents.waitWebElementIsVisible(fieldCity);
        CommonEvents.setInputField(fieldCity,city);
        return this;
    }

    public AirportsPage clickOnSaveReturn() {
        CommonEvents.waitWebElementIsVisible(saveReturnButton);
        CommonEvents.clickButton(saveReturnButton);
        return new AirportsPage();
    }

}
