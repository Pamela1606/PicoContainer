/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.EditCars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.CarsPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class EditCarPage extends BasePage {
  @FindBy(css = "a[href='#META_INFO']")
  private WebElement metaInfoTab;

  @FindBy(css = "input[name='carmetatitle']")
  private WebElement metaTitleInput;

  @FindBy(css = "input[name='carkeywords']")
  private WebElement metaKeywordsInput;

  @FindBy(css = "textarea[name='carmetadesc']")
  private WebElement metaDescriptionTextarea;

  @FindBy(css = "button#update")
  private WebElement submitButton;

  public EditCarPage clickOnTheMetaInfoTab() {
    CommonEvents.clickButton(metaInfoTab);

    return this;
  }

  public CarsPage fillMetaInfoForm(List<Map<String, String>> data) {
    Map<String, String> dataForm = data.get(0);

    CommonEvents.setInputField(metaTitleInput, dataForm.get("Meta Title"));

    CommonEvents.setInputField(metaKeywordsInput, dataForm.get("Meta Keywords"));

    CommonEvents.setInputField(metaDescriptionTextarea, dataForm.get("Meta Description"));

    CommonEvents.clickButton(submitButton);

    return new CarsPage();
  }

}
