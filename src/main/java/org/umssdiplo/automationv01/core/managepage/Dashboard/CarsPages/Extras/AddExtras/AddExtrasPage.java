/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.AddExtras;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.CarsExtrasPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class AddExtrasPage extends BasePage {
  @FindBy(css = "input[type='file']")
  private WebElement thumbInput;

  @FindBy(css = "input[name='cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--']")
  private WebElement nameInput;

  @FindBy(css = "input[name='cHRfZXh0cmFzLmV4dHJhc19iYXNpY19wcmljZQ--']")
  private WebElement priceInput;

  @FindBy(xpath = "//a[contains(text(),'Save & Return')]")
  private WebElement saveAndReturnButton;

  public CarsExtrasPage fillFormWithSaveAndReturnButton(List<Map<String, String>> data) {
    Map<String, String> dataForm = data.get(0);
    String imagePath = System.getProperty("user.dir") + "\\src\\test\\resources\\inputData\\Images\\" + dataForm.get("Thumb");

    ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
            .executeScript("arguments[0].style.opacity='1';", thumbInput);
    CommonEvents.setInputField(thumbInput, imagePath);

    CommonEvents.setInputField(nameInput, dataForm.get("Name"));
    CommonEvents.setInputField(priceInput, dataForm.get("Price"));

    CommonEvents.clickButton(saveAndReturnButton);

    return new CarsExtrasPage();
  }

}
