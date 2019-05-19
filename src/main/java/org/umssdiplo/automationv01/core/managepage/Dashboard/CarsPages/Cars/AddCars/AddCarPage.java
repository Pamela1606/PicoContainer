/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.AddCars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.CarsPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class AddCarPage extends BasePage {
  @FindBy(css = "input[name='carname']")
  private WebElement carNameInput;

  @FindBy(css = "div#GENERAL iframe")
  private WebElement carDescriptionIframe;

  @FindBy(css = "div#s2id_autogen21")
  private WebElement carTypeDropdown;

  @FindBy(css = "select[name='cartype']")
  private WebElement selectCarType;

  @FindBy(css = "button#add")
  private WebElement submitButton;


  public CarsPage fillGeneralTabForm(List<Map<String, String>> data) {
    Map<String, String> dataForm = data.get(0);

    CommonEvents.setInputField(carNameInput, dataForm.get("Car name"));

    CommonEvents.forceWait(8000);
    CommonEvents.setIframeContent(carDescriptionIframe, dataForm.get("Car Description"));

    CommonEvents.clickButton(carTypeDropdown);
    CommonEvents.chooseDropDownByTextVisible(selectCarType, dataForm.get("Car Type"));

    CommonEvents.clickButton(submitButton);

    return new CarsPage();
  }

}
