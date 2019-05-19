package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.InspectAirport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airports.AirportsPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;

public class InspectAirportPage extends BasePage {


    @FindBy(xpath = "//table[1]/tbody[1]/tr/td[2]")
    private List<WebElement> listaTablaName;

    @FindBy(css=".btn-warning")
    private WebElement returnButton;

    public String getCodeToCompare() {
        CommonEvents.forceWait(4000);
        return listaTablaName.get(0).getText();
    }

    public String getNameToCompare() {
        return listaTablaName.get(1).getText();
    }

    public String getCitycodeToCompare() {
        return listaTablaName.get(2).getText();
    }

    public String getCitynameToCompare() {
        return listaTablaName.get(3).getText();
    }

    public String getCountrynameToCompare() {
        return listaTablaName.get(4).getText();
    }

    public String getCountrycodeToCompare() {
        return listaTablaName.get(5).getText();
    }

    public String getTimezoneToCompare() {
        return listaTablaName.get(6).getText();
    }

    public String getLatitudToCompare() {
        return listaTablaName.get(7).getText();
    }

    public String getLongitudToCompare() {
        return listaTablaName.get(8).getText();
    }

    public String getCityToCompare() {
        return listaTablaName.get(9).getText();
    }

    public AirportsPage clickOnReturnButton() {
        CommonEvents.waitWebElementIsVisible(returnButton);
        CommonEvents.clickButton(returnButton);
        return new AirportsPage();
    }
}
