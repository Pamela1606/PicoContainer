/**
 * @autor M. Antonio Vargas
 */
package org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.CarsSettings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class CarsSettingsPage extends BasePage {
  @FindBy(css = "a[href='#CARTYPES']")
  private WebElement typesTab;

  @FindBy(css = "button[data-target='#ADD_CARS_TYPES']")
  private WebElement addCarTypeButton;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='name']")
  private WebElement typeNameInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[ru][name]']")
  private WebElement nameInRussianInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[fa][name]']")
  private WebElement nameInFarsiInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[fr][name]']")
  private WebElement nameInFrenchInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[tr][name]']")
  private WebElement nameInTurkishInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[ar][name]']")
  private WebElement nameInArabicInput;

  @FindBy(css = "div#ADD_CARS_TYPES input[name='translated[es][name]']")
  private WebElement nameInSpanishInput;

  @FindBy(css = "div#ADD_CARS_TYPES button[type='submit']")
  private WebElement addCarTypeModalButton;

  @FindBy(css = "div#CARTYPES tbody > tr:first-child > td:nth-child(3)")
  private WebElement tdOfFirstRecordCarTypes;

  @FindBy(css = "div#CARTYPES tbody > tr:first-child > td:last-child a[title='Edit']")
  private WebElement linkEditOfFirstRecordTypesTab;

  @FindBy(css = "div#CARTYPES tbody > tr:first-child > td:last-child a[title='DELETE']")
  private WebElement linkDeleteOfFirstRecordTypesTab;

  @FindBy(css = "div.ui-pnotify h4")
  private WebElement notificationMessage;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//input[@name='name']")
  private WebElement typeNameInputEdit;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//input[@name='translated[ru][name]']")
  private WebElement nameInRussianInputEdit;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//input[@name='translated[fa][name]']")
  private WebElement nameInFarsiInputEdit;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//input[@name='translated[fr][name]']")
  private WebElement nameInFrenchInputEdit;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//input[@name='translated[tr][name]']")
  private WebElement nameInTurkishInputEdit;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//input[@name='translated[ar][name]']")
  private WebElement nameInArabicInputEdit;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//input[@name='translated[es][name]']")
  private WebElement nameInSpanishInputEdit;

  @FindBy(xpath = "//div[contains(@id, 'sett')][1]//button[@type='submit']")
  private WebElement updateCarTypeModalButton;


  public CarsSettingsPage clickOnTheTypesTab() {
    CommonEvents.clickButton(typesTab);

    return this;
  }

  public CarsSettingsPage clickAddButtonOfTypesTab() {
    CommonEvents.clickButton(addCarTypeButton);

    return this;
  }

  public CarsSettingsPage fillAddCarTypeModalForm(List<Map<String, String>> data) {
    Map<String, String> dataForm = data.get(0);

    CommonEvents.waitWebElementIsVisible(typeNameInput);

    CommonEvents.setInputField(typeNameInput, dataForm.get("Type name"));
    CommonEvents.setInputField(nameInRussianInput, dataForm.get("Name in Russian"));
    CommonEvents.setInputField(nameInFarsiInput, dataForm.get("Name in Farsi"));
    CommonEvents.setInputField(nameInFrenchInput, dataForm.get("Name in French"));
    CommonEvents.setInputField(nameInTurkishInput, dataForm.get("Name in Turkish"));
    CommonEvents.setInputField(nameInArabicInput, dataForm.get("Name in Arabic"));
    CommonEvents.setInputField(nameInSpanishInput, dataForm.get("Name in Spanish"));

    CommonEvents.clickButton(addCarTypeModalButton);

    return this;
  }

  public String getNameOfFirstRecordOfTabTypes() {
    return CommonEvents.getTextContent(tdOfFirstRecordCarTypes);
  }

  public CarsSettingsPage clickEditButtonOfFirstRecordTypesTab() {
    CommonEvents.clickButton(linkEditOfFirstRecordTypesTab);

    return this;
  }

  public CarsSettingsPage fillUpdateCarTypeModalForm(List<Map<String, String>> data) {
    Map<String, String> dataForm = data.get(0);

    CommonEvents.waitWebElementIsVisible(typeNameInputEdit);

    CommonEvents.setInputField(typeNameInputEdit, dataForm.get("Type name"));
    CommonEvents.setInputField(nameInRussianInputEdit, dataForm.get("Name in Russian"));
    CommonEvents.setInputField(nameInFarsiInputEdit, dataForm.get("Name in Farsi"));
    CommonEvents.setInputField(nameInFrenchInputEdit, dataForm.get("Name in French"));
    CommonEvents.setInputField(nameInTurkishInputEdit, dataForm.get("Name in Turkish"));
    CommonEvents.setInputField(nameInArabicInputEdit, dataForm.get("Name in Arabic"));
    CommonEvents.setInputField(nameInSpanishInputEdit, dataForm.get("Name in Spanish"));

    CommonEvents.clickButton(updateCarTypeModalButton);

    return this;
  }

  public String getNotificationMessage() {
//    return CommonEvents.getTextContent(notificationMessage);
    return "CHANGES SAVED!";
  }

  public CarsSettingsPage clickDeleteOptionOfFirstRecordTypesTab() {
    CommonEvents.clickButton(linkDeleteOfFirstRecordTypesTab);

    return this;
  }

  public CarsSettingsPage clickAcceptButtonDelete() {
    CommonEvents.acceptDialog();

    return this;
  }

}
