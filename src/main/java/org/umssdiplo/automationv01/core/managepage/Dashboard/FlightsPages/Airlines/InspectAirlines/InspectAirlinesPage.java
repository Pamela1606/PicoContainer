package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.InspectAirlines;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AirlinesPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class InspectAirlinesPage extends BasePage {

    @FindBy(css = ".form-group:nth-child(1) > .col-sm-9")
    private WebElement fieldName;

    @FindBy(css = ".form-group:nth-child(3) > .col-sm-9")
    private WebElement fieldIataDesi;

    @FindBy(css = ".form-group:nth-child(4) > .col-sm-9")
    private WebElement field3DigitCode;

    @FindBy(css = ".form-group:nth-child(5) > .col-sm-9")
    private WebElement selectCountry;

    @FindBy(css = ".btn-warning")
    private WebElement returnButton;

    public String getFieldName() {
        CommonEvents.waitWebElementIsVisible(fieldName);
        return CommonEvents.getTextContent(fieldName);
    }

    public String getFieldIataDesi() {
        CommonEvents.waitWebElementIsVisible(fieldIataDesi);
        return CommonEvents.getTextContent(fieldIataDesi);
    }

    public String getField3DigitCode() {
        CommonEvents.waitWebElementIsVisible(field3DigitCode);
        return CommonEvents.getTextContent(field3DigitCode);
    }

    public String getSelectCountry() {
        CommonEvents.waitWebElementIsVisible(selectCountry);
        return CommonEvents.getTextContent(selectCountry);
    }

    public AirlinesPage clickButtonReturn() {
        CommonEvents.waitWebElementIsVisible(returnButton);
        CommonEvents.clickButton(returnButton);
        return new AirlinesPage();
    }
}
