package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.AddExtraPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Extras.ExtrasPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;


public class AddExtraPage extends BasePage {

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--")
    private WebElement fieldName;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-")
    private WebElement selectStatus;

    @FindBy(name = "cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--")
    private WebElement fieldPrice;

    @FindBy(css = ".btn-primary")
    private WebElement saveReturnButton;

    public AddExtraPage fillFieldName(String name){
        CommonEvents.waitWebElementIsVisible(fieldName);
        CommonEvents.setInputField(fieldName,name);
        return this;
    }

    public AddExtraPage selectStatus(String status){
        CommonEvents.waitWebElementIsVisible(selectStatus);
        CommonEvents.chooseDropDownByTextVisible(selectStatus, status);
        return this;
    }

    public AddExtraPage fillFieldPrice(String price){
        CommonEvents.waitWebElementIsVisible(fieldPrice);
        CommonEvents.setInputField(fieldPrice, price);
        return this;
    }

    public ExtrasPage saveReturnButton(){
        CommonEvents.waitWebElementIsVisible(saveReturnButton);
        CommonEvents.clickButton(saveReturnButton);
        return new ExtrasPage();
    }


}
