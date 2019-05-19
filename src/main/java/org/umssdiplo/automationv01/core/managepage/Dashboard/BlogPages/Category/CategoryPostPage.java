package org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Category;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CategoryPostPage extends BasePage {

    ModelCategory modelCategory = new ModelCategory("");

    @FindBy(xpath = "//div/div[contains(text(),'Blog Categories')]")
    private WebElement titleElement;

    @FindBy(xpath = "//button[contains(text(), 'Add')]")
    private WebElement buttonNew;

    @FindBy(name = "name")
    private WebElement inputname;

    @FindBy(xpath = "//div[@class=\"modal-footer\"]/button[contains(text(), 'Add')]")
    private WebElement saveButton;

    @FindBy(name = "phrase")
    private WebElement elementSearch;

    @FindBy(xpath = "//div/span/span/a[contains(text(), 'Go')]")
    private WebElement buttonGo;

    @FindBy(xpath = "//div/a[contains(text(),'Search')]")
    private WebElement buttonSearch;

    @FindBy(xpath = "//tbody/tr[@class='xcrud-row xcrud-row-0'][1]/td[3]")
    private WebElement elementCheck;

    @FindBy(xpath = "//i[@class='fa fa-edit']")
    private WebElement editItembox;

    @FindBy(xpath = "//i[@class='fa fa-times']")
    private WebElement deleteItembox;

    @FindBy(xpath = "//div[@id='content']/div[@id='cat27']/div[@class='modal-dialog']" +
            "/div[@class='modal-content']/form/div[@class='modal-body form-horizontal']" +
            "/div[@class='row form-group'][1]/div[@class='col-md-8']/input[@class='form-control']")
    private WebElement updatenameInput;

    @FindBy(xpath = "//div/button[contains(text(),'Update')]")
    private WebElement updateClickButton;

    public CategoryPostPage checkTitleExiste(String arg0) {
        System.out.println(CommonEvents.getTextContent(titleElement));
        CommonEvents.waitWebElementIsVisible(titleElement);
        modelCategory.setName(arg0);
        return this;
    }

    public void assertTitle() {
        assert modelCategory.getName().equals(CommonEvents.getTextContent(titleElement));
    }

    public CategoryPostPage clickNew() {
        CommonEvents.waitWebElementIsVisible(buttonNew);
        CommonEvents.clickButton(buttonNew);
        return this;
    }

    public CategoryPostPage fillNewCategory(String arg0) {
        System.out.println(arg0);
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(inputname);
        CommonEvents.setInputField(inputname, arg0);
        return this;
    }

    public CategoryPostPage savenewCategory() {
        CommonEvents.waitWebElementIsVisible(saveButton);
        CommonEvents.clickButton(saveButton);
        return this;
    }

    public CategoryPostPage clickSearchCategory() {
        CommonEvents.waitWebElementIsVisible(buttonSearch);
        CommonEvents.clickButton(buttonSearch);
        CommonEvents.waitWebElementIsVisible(elementSearch);
        CommonEvents.setInputField(elementSearch, "The Creative");
        return this;
    }

    public CategoryPostPage goPageSearch() {
        CommonEvents.waitWebElementIsVisible(buttonGo);
        CommonEvents.clickButton(buttonGo);
        return this;
    }

    public CategoryPostPage assertExistNewelement() {
        CommonEvents.waitWebElementIsVisible(elementCheck);
        assert CommonEvents.getTextContent(elementCheck).equals("The Creative");
        return this;
    }

    public CategoryPostPage clickEdit() {
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(editItembox);
        CommonEvents.clickButton(editItembox);
        return this;
    }

    public CategoryPostPage changeNameCategory(String arg0) {
        System.out.println(arg0);
        //div[@class='row form-group'][1]/div[@class='col-md-8']/input[@class='form-control']
        CommonEvents.waitWebElementIsVisible(updatenameInput);
        CommonEvents.setInputField(updatenameInput, arg0);
        return this;
    }

    public CategoryPostPage salveEdit() {
        CommonEvents.waitWebElementIsVisible(updateClickButton);
        CommonEvents.clickButton(updateClickButton);
        return this;
    }

    public CategoryPostPage assertName(String name) {
        CommonEvents.waitWebElementIsVisible(buttonSearch);
        CommonEvents.clickButton(buttonSearch);
        CommonEvents.waitWebElementIsVisible(elementSearch);
        CommonEvents.setInputField(elementSearch, name);
        CommonEvents.waitWebElementIsVisible(buttonGo);
        CommonEvents.clickButton(buttonGo);
        CommonEvents.waitWebElementIsVisible(elementCheck);
        assert CommonEvents.getTextContent(elementCheck).equals(name);
        return this;
    }

    public CategoryPostPage deleteElement() {
        CommonEvents.forceWait(4000);
        CommonEvents.waitWebElementIsVisible(deleteItembox);
        CommonEvents.clickButton(deleteItembox);
        CommonEvents.forceWait(4000);
        webDriver.switchTo().alert().accept();
        return this;
    }

    public CategoryPostPage assertNotExist(String arg0) {
        System.out.println(arg0);
        return this;
    }
}
