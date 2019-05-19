package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AirlinesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AirportsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Countries.CountriesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Routes.RoutesPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Settings.SettingsPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FlightsManager extends BasePage {

    @FindBy(css = "#Flights > li:nth-child(1) > a")
    private WebElement flightMenuRoutes;

    @FindBy(css = "#Flights > li:nth-child(2) > a")
    private WebElement flightMenuAirports;

    @FindBy(css = "#Flights > li:nth-child(3) > a")
    private WebElement flightMenuSettings;

    @FindBy(css = "#Flights > li:nth-child(4) > a")
    private WebElement flightMenuAirlines;

    @FindBy(css = "#Flights > li:nth-child(5) > a")
    private WebElement flightMenuCountries;

    @FindBy(css = "#Flights > li:nth-child(6) > a")
    private WebElement flightMenuFlightsSlider;

    public RoutesPage clickFlightMenuRoutes() {
        CommonEvents.waitWebElementClickable(flightMenuRoutes);
        CommonEvents.clickButton(flightMenuRoutes);
        return new RoutesPage();
    }

    public AirportsPage clickFlightMenuAirports() {
        CommonEvents.waitWebElementClickable(flightMenuAirports);
        CommonEvents.clickButton(flightMenuAirports);
        return new AirportsPage();
    }

    public SettingsPage clickFlightMenuSettings() {
        CommonEvents.waitWebElementClickable(flightMenuSettings);
        CommonEvents.clickButton(flightMenuSettings);
        return new SettingsPage();
    }

    public AirlinesPage clickFlightMenuAirlines() {
        CommonEvents.waitWebElementClickable(flightMenuAirlines);
        CommonEvents.clickButton(flightMenuAirlines);
        return new AirlinesPage();
    }

    public CountriesPage clickFlightMenuCountries() {
        CommonEvents.waitWebElementClickable(flightMenuCountries);
        CommonEvents.clickButton(flightMenuCountries);
        return new CountriesPage();
    }

    public CountriesPage clickFlightMenuFlightsSlider() {
        CommonEvents.waitWebElementClickable(flightMenuFlightsSlider);
        CommonEvents.clickButton(flightMenuFlightsSlider);
        return new CountriesPage();
    }

}
