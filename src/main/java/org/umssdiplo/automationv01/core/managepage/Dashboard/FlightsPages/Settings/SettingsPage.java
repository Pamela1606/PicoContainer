package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SettingsPage extends BasePage {

    @FindBy( name = "mode")
    private WebElement selectTestingMode;

    @FindBy(css=".btn-primary")
    private WebElement submitButton;

    public SettingsPage selectTestMode(String testingMode) {
        CommonEvents.waitWebElementIsVisible(selectTestingMode);
        CommonEvents.chooseDropDownByTextVisible(selectTestingMode,testingMode);
        return this;
    }

    public SettingsPage clickOnSubmitButton() {
        CommonEvents.waitWebElementIsVisible(submitButton);
        CommonEvents.clickButton(submitButton);
        return this;
    }
}
