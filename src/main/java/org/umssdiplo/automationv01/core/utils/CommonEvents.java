package org.umssdiplo.automationv01.core.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class CommonEvents {

  /**
   * This method set text content to web element.
   *
   * @param webElement Is web element.
   * @param content    Is the content that will be set to the web element.
   */
  public static void setInputField(WebElement webElement, String content) {
    ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
    webElement.clear();
    webElement.sendKeys(content);
  }

  /**
   * This method perform a click action in a web element.
   *
   * @param webElement Is the web element that will be pressed.
   */
  public static void clickButton(WebElement webElement) {
    ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
    webElement.click();
  }

  /**
   * This method perform a click in a non visible element in the UI.
   *
   * @param webElement the WebElement non visible in the UI.
   */
  public static void jsClickElement(WebElement webElement) {
    ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
            .executeScript("arguments[0].click();", webElement);
  }

  /**
   * This method verifies if a web element is visible.
   *
   * @param webElement is the web element.
   * @return true if web element is visible or false if it isn't visible.
   */
  public static boolean isVisible(WebElement webElement) {
    try {
      return webElement.isDisplayed();
    } catch (NoSuchElementException e) {
      System.out.println("Element do not exits.");
      return false;
    }
  }

  /**
   * This method verifies if a web element is visible.
   *
   * @param webElement is the web element.
   * @return true if web element is visible or false if it isn't visible.
   */
  public static boolean isPresent(WebElement webElement) {
    try {
      return webElement.isEnabled();
    } catch (NoSuchElementException e) {
      System.out.println("Element do not exits.");
      return false;
    }
  }

  /**
   * This method perform a search in a WebElement list based on a content string parameter.
   *
   * @param elements is the WebElements lists.
   * @param content  is the content parameter.
   * @return the WebElement search result.
   */
  public static WebElement findWebElement(List<WebElement> elements, String content) {
    return elements.stream()
            .filter(element -> content.equals(element.getText()))
            .findAny()
            .orElse(null);
  }

  /**
   * This method return the text content of a WebElement.
   *
   * @param webElement is the WebElement to extract the text.
   * @return the text content of the WebElement.
   */
  public static String getTextContent(WebElement webElement) {
    ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
    return webElement.getText();
  }

  /**
   * This method get title of current page.
   *
   * @return title of the current page.
   */
  public static String getPageTitle() {
    return ManageDriver.getInstance().getWebDriver().getTitle();
  }

  /**
   * This method press enter key to web element.
   *
   * @param webElement is the WebElement.
   */
  public static void pressEnterKey(WebElement webElement) {
    webElement.sendKeys(Keys.ENTER);
  }

  public static void chooseDropDownByTextVisible(WebElement webElement, String value) {
      ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
      Select selectField = new Select(webElement);
      selectField.selectByVisibleText(value);
  }

  public static void waitWebElementClickable(WebElement webElement) {
      ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(webElement));
  }

  public static void forceWait(int timeMilliSeconds) {
      try {
          //logger.info(FORCE_WAIT, timeMilliSeconds);
          Thread.sleep(timeMilliSeconds);
      } catch (InterruptedException e) {
          StringWriter errors = new StringWriter();
          e.printStackTrace(new PrintWriter(errors));
          //logger.debug(Event.class.getSimpleName().concat("-noUseThisWait [method]- Exception Error:").concat(errors.toString()));
      }
  }

  public static void waitWebElementIsVisible(WebElement webElement) {
      ManageDriver.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(webElement));
  }

  public static void setIframeContent(WebElement webElement, String content) {
      ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
              .executeScript("arguments[0].contentWindow.document.getElementsByTagName('p')[0].innerHTML='"+ content +"';", webElement);
  }

  public static void acceptDialog() {
      ManageDriver.getInstance().getWebDriver().switchTo().alert().accept();
  }

  public static void setInputTypeToText(WebElement webElement) {
      ((JavascriptExecutor) ManageDriver.getInstance().getWebDriver())
              .executeScript("arguments[0].type='text';", webElement);
  }

    public static void schichIframe(WebElement element){
        ManageDriver.getInstance().getWebDriver().switchTo().frame(element);
    }

    public static void defaultContent(){
        ManageDriver.getInstance().getWebDriver().switchTo().defaultContent();
    }

    public static void selectDropDown(WebElement selectField, By by) {
        clickButton(selectField);
        ManageDriver.getInstance().getWebDriver().findElement(by).click();
    }

}
