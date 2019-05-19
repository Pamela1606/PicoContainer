package org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AddAirlines;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.Airlines.AirlinesPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class AddAirlinesPage extends BasePage {

    @FindBy(name = "cHRfZmxpZ2h0c19haXJsaW5lcy5uYW1l")
    private WebElement fieldName;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJsaW5lcy5pYXRhX2Rlc2k-")
    private WebElement fieldIataDesi;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJsaW5lcy4zLWRpZ2l0LWNvZGU-")
    private WebElement field3DigitCode;

    @FindBy(name = "cHRfZmxpZ2h0c19haXJsaW5lcy5jb3VudHJ5")
    private WebElement selectCountry;

    @FindBy(css=".img-thumbnail")
    private WebElement uploadImage;

    @FindBy(css = ".btn-primary")
    private WebElement saveReturnButton;

    public AddAirlinesPage fillFieldName(String name){
        CommonEvents.waitWebElementIsVisible(fieldName);
        CommonEvents.setInputField(fieldName,name);
        return this;
    }
    public AddAirlinesPage fillFieldIataDesi(String lataDesi){
        CommonEvents.waitWebElementIsVisible(fieldIataDesi);
        CommonEvents.setInputField(fieldIataDesi,lataDesi);
        return this;
    }
    public AddAirlinesPage fillField3DigitCode(String _3digitCode){
        CommonEvents.waitWebElementIsVisible(field3DigitCode);
        CommonEvents.setInputField(field3DigitCode,_3digitCode);
        return this;
    }
    public AddAirlinesPage selectCountry(String country){
        CommonEvents.waitWebElementIsVisible(selectCountry);
        CommonEvents.chooseDropDownByTextVisible(selectCountry,country);
        return this;
    }

    public AirlinesPage saveReturnButton(){
        CommonEvents.waitWebElementIsVisible(saveReturnButton);
        CommonEvents.clickButton(saveReturnButton);
        return new AirlinesPage();
    }

    public AddAirlinesPage waitToUploadImage() {
        CommonEvents.forceWait(10000);//Tiempo de espera hasta cargar una imagen
        CommonEvents.waitWebElementIsVisible(uploadImage);//Cando se sube una imagen se vuelve visible este elemento
        CommonEvents.forceWait(4000);
        return this;
    }
}

