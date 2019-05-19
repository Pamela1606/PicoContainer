package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SettingsPage extends BasePage {

    @FindBy( name = "target")
    private WebElement selectTarget;

    @FindBy(css=".btn-primary")
    private WebElement submitButton;

    public org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Settings.SettingsPage selectTarget(String target) {
        CommonEvents.waitWebElementIsVisible(selectTarget);
        CommonEvents.chooseDropDownByTextVisible(selectTarget, target);
        return this;
    }

    public org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Settings.SettingsPage clickOnSubmitButton() {
        CommonEvents.waitWebElementIsVisible(submitButton);
        CommonEvents.clickButton(submitButton);
        return this;
    }
}
