package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.EditTours;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.ToursPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class EditToursPage extends BasePage {

    @FindBy(css = "a[href='#GENERAL'")
    private WebElement generalTab;

    @FindBy(name = "tourstatus")
    private WebElement selectStatus;

    @FindBy(name = "tourname")
    private WebElement fieldName;

    @FindBy(name = "maxadult" )
    private WebElement fieldQuantityAdults;

    @FindBy(css = "button#update")
    private WebElement submitButton;

    public EditToursPage clickEditGeneral() {
        CommonEvents.clickButton(generalTab);
        return this;
    }

    public ToursPage updateDataFormOfGeneralTab(List<Map<String, String>> editDataHotels) {
        Map<String, String> dtForm = editDataHotels.get(0);
        CommonEvents.waitWebElementIsVisible(selectStatus);
        CommonEvents.chooseDropDownByTextVisible(selectStatus, dtForm.get("Status"));
        CommonEvents.setInputField(fieldName, dtForm.get("Tour Name"));
        CommonEvents.setInputField(fieldQuantityAdults, dtForm.get("Quantity"));

        CommonEvents.clickButton(submitButton);
        return new ToursPage();
    }

}
