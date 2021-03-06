package org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.AddNew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.ToursPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class AddNewPage extends BasePage {

    @FindBy(name = "tourstatus")
    private WebElement selectStatus;

    @FindBy(name = "tourname")
    private WebElement fieldName;

    @FindBy(name = "maxadult" )
    private WebElement fieldQuantityAdults;

    @FindBy(name = "adultprice" )
    private WebElement fieldPriceAdults;

    @FindBy(name = "tourstars")
    private WebElement selectStars;

    @FindBy(name = "tourdays")
    private WebElement fieldTotalDays;

    @FindBy(name = "tournights")
    private WebElement fieldTotalNights;

    @FindBy(className = "select2-chosen")
    private WebElement tourType;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement fieldTourType;

    @FindBy(name = "isfeatured")
    private WebElement selectFeatured;

    @FindBy(id = "s2id_locationlist1")
    private WebElement location;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement fieldLocation;

    @FindBy(id = "\"select2-drop\"]/ul/li[2]/div/span")
    private WebElement fieldSelected;

    @FindBy (id = "mapaddress")
    private WebElement fieldAddress;

    @FindBy(id = "add")
    private WebElement submitButton;


    public AddNewPage selectStatus(String status) {
        CommonEvents.waitWebElementIsVisible(selectStatus);
        CommonEvents.chooseDropDownByTextVisible(selectStatus, status);
        return this;
    }

    public AddNewPage fillName(String name) {
        CommonEvents.waitWebElementIsVisible(fieldName);
        CommonEvents.setInputField(fieldName, name);
        return this;
    }

    public AddNewPage fillQuantityAdults(String quantityAdults) {
        CommonEvents.waitWebElementIsVisible(fieldQuantityAdults);
        CommonEvents.setInputField(fieldQuantityAdults, quantityAdults);
        return this;
    }

    public AddNewPage fillPriceAdults(String priceAdults) {
        CommonEvents.waitWebElementIsVisible(fieldPriceAdults);
        CommonEvents.setInputField(fieldPriceAdults,priceAdults);
        return this;
    }

    public AddNewPage selectStars(String stars) {
        CommonEvents.waitWebElementIsVisible(selectStars);
        CommonEvents.chooseDropDownByTextVisible(selectStars, stars);
        return this;
    }

    public AddNewPage fillTotalDays(String totalDays) {
        CommonEvents.waitWebElementIsVisible(fieldTotalDays);
        CommonEvents.setInputField(fieldTotalDays, totalDays);
        return this;
    }

    public AddNewPage fillTotalNights(String totalNights) {
        CommonEvents.waitWebElementIsVisible(fieldTotalNights);
        CommonEvents.setInputField(fieldTotalNights, totalNights);
        return this;
    }

    public AddNewPage selectTourType(String toursType) {
        CommonEvents.clickButton(tourType);
        CommonEvents.waitWebElementIsVisible(fieldTourType);
        CommonEvents.setInputField(fieldTourType, toursType);
        CommonEvents.forceWait(4000);
        CommonEvents.pressEnterKey(fieldTourType);
        return this;
    }

    public AddNewPage selectFeature(String feature) {
        CommonEvents.waitWebElementIsVisible(selectFeatured);
        CommonEvents.chooseDropDownByTextVisible(selectFeatured, feature);
        return this;
    }

    public AddNewPage selectLocation1(String locations) {
        CommonEvents.clickButton(location);
        CommonEvents.waitWebElementIsVisible(fieldLocation);
        CommonEvents.setInputField(fieldLocation, locations);
        CommonEvents.forceWait(10000);
        CommonEvents.pressEnterKey(fieldLocation);
        return this;
    }

    // se  agregado un wait
    public ToursPage clickOnSubmit() {
        CommonEvents.forceWait(4000);
        CommonEvents.waitWebElementIsVisible(submitButton);
        CommonEvents.clickButton(submitButton);
        //CommonEvents.forceWait(4000);
        return new ToursPage();
    }

}
