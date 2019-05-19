package org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Posts;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class PostPage extends BasePage {

    ModelPost modelPost = new ModelPost("");

    @FindBy(xpath = "//div/a[contains(text(),'Search')]")
    private WebElement buttonSearch;

    @FindBy(name = "phrase")
    private WebElement elementSearch;

    @FindBy(xpath = "//div/span/span/a[contains(text(), 'Go')]")
    private WebElement buttonGo;

    @FindBy(xpath = "//form/button[contains(text(), 'Add')]")
    private WebElement buttonNew;

    @FindBy(xpath = "//span[@class='btn-group']/a[@class='btn btn-default btn-xcrud btn-danger']/i[@class='fa fa-times']")
    private WebElement delete;

    @FindBy(xpath = "//div/div[contains(text(), 'Blog Management')]")
    private WebElement blog_management;

    @FindBy(name = "category")
    private WebElement selectCategoryType;

    @FindBy(xpath = "//div[@class='col-md-4']/div[@class='form-group ']/input[@class='form-control posttitle']")
    private WebElement inputTitle;

    @FindBy(xpath = "//div[@id='cke_1_contents']/iframe[@class='cke_wysiwyg_frame cke_reset']")
    private WebElement descriptionIframe;

    @FindBy(xpath = "//div[@class='panel-footer']/button[@class='btn btn-primary']")
    private WebElement newitem;

    @FindBy(xpath = "//i[@class='fa fa-edit']")
    private WebElement editItembox;

    @FindBy(xpath = "//table[1]/tbody[1]/tr/td[4]")
    private List<WebElement> listaTablaName;

    @FindBy(xpath = "//tbody/tr[@class='xcrud-row xcrud-row-0'][1]/td[4]")
    private WebElement firstElement;

    @FindBy(xpath = "//ul[@class='nav nav-tabs nav-justified']/li[2]/a")
    private WebElement textTranlate;

    public PostPage clickSearch() {
        CommonEvents.waitWebElementIsVisible(buttonSearch);
        CommonEvents.clickButton(buttonSearch);
        return this;
    }

    public PostPage searchElement(String name) {
        CommonEvents.waitWebElementIsVisible(elementSearch);
        CommonEvents.setInputField(elementSearch, name);
        return this;
    }

    public PostPage clickButton() {
        CommonEvents.waitWebElementIsVisible(buttonGo);
        CommonEvents.clickButton(buttonGo);
        return this;
    }

    public PostPage clickDeletePostPage() {
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(delete);
        CommonEvents.clickButton(delete);
        return this;
    }

    public PostPage pressEnterDelete() {
        CommonEvents.forceWait(4000);
        webDriver.switchTo().alert().accept();
        return this;
    }

    public PostPage clickNew() {
        CommonEvents.waitWebElementIsVisible(buttonNew);
        CommonEvents.clickButton(buttonNew);
        return this;
    }

    public PostPage checkBlogmanagerTitle(String arg0) {
        System.out.println(arg0);
        System.out.println(blog_management.getText());
        CommonEvents.waitWebElementIsVisible(blog_management);
        CommonEvents.forceWait(5000);
        //assert blog_management.equals(blog_management.getText());
        return this;
    }

    public PostPage setfillDatainPost(DataTable datos) {
        List<Map<String,String>> elements = datos.asMaps(String.class, String.class);
        CommonEvents.waitWebElementIsVisible(inputTitle);
        CommonEvents.setInputField(inputTitle, elements.get(0).get("title"));
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(descriptionIframe);
        descriptionIframe.sendKeys(elements.get(0).get("description"));
        CommonEvents.waitWebElementIsVisible(selectCategoryType);
        CommonEvents.chooseDropDownByTextVisible(selectCategoryType, elements.get(0).get("category"));
        return this;
    }

    public PostPage pressEnterNew() {
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(newitem);
        CommonEvents.clickButton(newitem);
        return this;
    }

    public PostPage editElement() {
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(editItembox);
        CommonEvents.clickButton(editItembox);
        return this;
    }

    public PostPage setElementIntoPost(String arg0) {
        CommonEvents.waitWebElementIsVisible(selectCategoryType);
        System.out.println(arg0);
        CommonEvents.chooseDropDownByTextVisible(selectCategoryType, arg0);
        return this;
    }

    public PostPage clickUpdatePost() {
        CommonEvents.forceWait(5000);
        CommonEvents.waitWebElementIsVisible(newitem);
        CommonEvents.clickButton(newitem);
        return this;
    }

    public PostPage selectFirtelement() {
        System.out.println(CommonEvents.getTextContent(firstElement));
        modelPost.setName(CommonEvents.getTextContent(firstElement));
        return this;
    }

    public PostPage searchSalveElement() {
        CommonEvents.waitWebElementIsVisible(elementSearch);
        System.out.println(modelPost.getName());
        CommonEvents.forceWait(5000);
        CommonEvents.setInputField(elementSearch, modelPost.getName());
        return this;
    }

    public PostPage assertFirtElement() {
        System.out.println(modelPost.getName());
        System.out.println(CommonEvents.getTextContent(firstElement));
        //assertNotEquals(modelPost.getName(), CommonEvents.getTextContent(firstElement));
        return this;
    }

    public PostPage checkTranlate(String text) {
        CommonEvents.waitWebElementIsVisible(textTranlate);
        System.out.println(CommonEvents.getTextContent(textTranlate));
        assert text.equals(CommonEvents.getTextContent(textTranlate));
        return this;
    }
}
