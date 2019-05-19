package org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Category.CategoryPostPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.Posts.PostPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class BlogManager extends BasePage {

    private final ModelBlog expected = new ModelBlog("", "", "");

    @FindBy(css = "#Blog > li:nth-child(1) > a")
    private WebElement postsMenu;

    // Elements in Blog secction.

    @FindBy(css = "#Blog > li:nth-child(1) > a")
    private WebElement _post;

    @FindBy(css = "#Blog > li:nth-child(2) > a")
    private WebElement _category;

    @FindBy(css = "#Blog > li:nth-child(3) > a")
    private WebElement _setting;


    public PostPage clickPostMenu() {
        CommonEvents.waitWebElementClickable(postsMenu);
        CommonEvents.clickButton(postsMenu);
        return new PostPage();
    }

    public void setValuesModelexpexted () {
        String post = CommonEvents.getTextContent(_post);
        String category = CommonEvents.getTextContent(_category);
        String setting = CommonEvents.getTextContent(_setting);
        expected.setPost(post);
        expected.setCategory(category);
        expected.setSettings(setting);
    }

    public void checkAssert(DataTable datos) throws Throwable {
        List<Map<String,String>> elements = datos.asMaps(String.class, String.class);
        System.out.println(elements.get(0).get("one"));
        System.out.println(elements.get(0).get("two"));
        System.out.println(elements.get(0).get("three"));
        System.out.println(" + + + + + + + + + + + + + +");
        System.out.println(expected.getPost().toUpperCase());
        System.out.println(expected.getCategory());
        System.out.println(expected.getSettings());
        assert expected.getPost().equals(elements.get(0).get("one"));
        assert expected.getCategory().equals(elements.get(0).get("two"));
        assert expected.getSettings().equals(elements.get(0).get("three"));
    }

    public CategoryPostPage clickCategoryMenu() {
        CommonEvents.waitWebElementClickable(_category);
        CommonEvents.clickButton(_category);
        return new CategoryPostPage();
    }
}
