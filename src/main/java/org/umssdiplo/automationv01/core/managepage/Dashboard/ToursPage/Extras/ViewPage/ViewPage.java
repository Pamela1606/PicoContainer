package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ViewPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ExtrasPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ViewPage extends BasePage {

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--")
    private WebElement fieldName;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-")
    private WebElement selectStatus;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--")
    private WebElement fieldPrice;

    @FindBy(css = ".btn-warning")
    private WebElement returnButton;

    public String getFieldName() {
        CommonEvents.waitWebElementIsVisible(fieldName);
        return CommonEvents.getTextContent(fieldName);
    }

    public String getSelectStatus() {
        CommonEvents.waitWebElementIsVisible(selectStatus);
        return CommonEvents.getTextContent(selectStatus);
    }

    public String getFieldPrice() {
        CommonEvents.waitWebElementIsVisible(fieldPrice);
        return CommonEvents.getTextContent(fieldPrice);
    }

    public ExtrasPage clickButtonReturn() {
        CommonEvents.waitWebElementIsVisible(returnButton);
        CommonEvents.clickButton(returnButton);
        return new ExtrasPage();
    }

}
