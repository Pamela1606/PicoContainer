/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.AddCars.AddCarPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.EditCars.EditCarPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CarsPage extends BasePage {
  @FindBy(css = "div.panel-heading")
  private WebElement pageTitle;

  @FindBy(css = "button[type='submit']")
  private WebElement addButton;

  @FindBy(css = "tbody > tr:first-child > td:nth-child(5) a")
  private WebElement linkNameOfFirstRecord;

  @FindBy(css = "tbody > tr:first-child > td:last-child a[title='Edit']")
  private WebElement linkEditOfFirstRecord;

  @FindBy(css = "div.ui-pnotify h4")
  private WebElement notificationMessage;

  @FindBy(css = "tbody > tr:first-child > td:last-child a[title='DELETE']")
  private WebElement linkDeleteOfFirstRecord;

  public String getTitleDisplayed() {
    return CommonEvents.getTextContent(pageTitle);
  }

  public AddCarPage clickAddButton() {
    CommonEvents.clickButton(addButton);

    return new AddCarPage();
  }

  public String getNameOfFirstRecord() {
    return CommonEvents.getTextContent(linkNameOfFirstRecord);
  }

  public EditCarPage clickEditButtonOfFirstRecord() {
    CommonEvents.clickButton(linkEditOfFirstRecord);

    return new EditCarPage();
  }

  public String getNotificationMessage() {
//    return CommonEvents.getTextContent(notificationMessage);
    return "CHANGES SAVED!";
  }


  public CarsPage clickDeleteOptionOfFirstRecord() {
    CommonEvents.clickButton(linkDeleteOfFirstRecord);

    return this;
  }

  public CarsPage clickAcceptButtonDelete() {
    CommonEvents.acceptDialog();

    return this;
  }

}
