/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.AddExtras.AddExtrasPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CarsExtrasPage extends BasePage {
  @FindBy(xpath = "//a[contains(text(),' Add')]")
  private WebElement addBotton;

  @FindBy(css = "tbody > tr:first-child > td:nth-child(4)")
  private WebElement tdNameOfFirstRecord;

  @FindBy(css = "tbody > tr:first-child > td:nth-child(6)")
  private WebElement tdPriceOfFirstRecord;

  public AddExtrasPage clickAddButton() {
    CommonEvents.clickButton(addBotton);

    return new AddExtrasPage();
  }

  public String getNameOfFirstRecord() {
    CommonEvents.forceWait(4000);

    return CommonEvents.getTextContent(tdNameOfFirstRecord);
  }

  public String getPriceOfFirstRecord() {
    return CommonEvents.getTextContent(tdPriceOfFirstRecord);
  }

}
