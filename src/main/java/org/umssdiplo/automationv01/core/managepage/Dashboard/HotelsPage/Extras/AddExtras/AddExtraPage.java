package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Extras.AddExtras;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Extras.ExtraPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class AddExtraPage extends BasePage {

    @FindBy(css = "input[type='file']")
    private WebElement thumbExtra;

    @FindBy(css = "input[name='cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--']")
    private WebElement nameExtra;

    @FindBy(css = "input[name='cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--']")
    private WebElement priceExtra;

    @FindBy(xpath = "//a[contains(text(),'Save & Return')]")
    private WebElement saveAndReturnButtonExtra;

    public ExtraPage getFillFormExtra(List<Map<String, String>> valuesExtras) {
        Map<String, String> dtFormExtra = valuesExtras.get(0);
        String imagePathExtra = System.getProperty("user.dir") + "\\src\\test\\resources\\inputData\\Images\\" + dtFormExtra.get("Thumb");

        ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
                .executeScript("arguments[0].style.opacity='1';", thumbExtra);
        CommonEvents.setInputField(thumbExtra, imagePathExtra);

        CommonEvents.setInputField(nameExtra, dtFormExtra.get("Name"));
        CommonEvents.setInputField(priceExtra, dtFormExtra.get("Price"));

        CommonEvents.clickButton(saveAndReturnButtonExtra);

        return new ExtraPage();
    }
}
