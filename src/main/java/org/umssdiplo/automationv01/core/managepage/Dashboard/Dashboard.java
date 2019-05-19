package org.umssdiplo.automationv01.core.managepage.Dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.BlogPages.BlogManager;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Cars.CarsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.CarsSettings.CarsSettingsPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.CarsPages.Extras.CarsExtrasPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.FlightsPages.FlightsManager;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Extras.ExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.HotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.RoomPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.ToursManagement;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Dashboard extends BasePage {
    @FindBy(xpath = "//li/a[contains(text(),'Blog')]")
    private WebElement blogMenu;

    @FindBy(css = "#social-sidebar-menu > li:nth-child(8) > a")
    private WebElement flightMenu;

    @FindBy(css = "a[href='#Cars']")
    private WebElement carsOption;

    @FindBy(xpath = "//ul[@id='Cars']//a[contains(text(),'Cars')]")
    private WebElement carsSuboption;

    @FindBy(xpath = "//ul[@id='Cars']//a[contains(text(),'Cars Settings')]")
    private WebElement carsSettingsSuboption;

    @FindBy(xpath = "//ul[@id='Cars']//a[contains(text(),'Extras')]")
    private WebElement carsExtrasSuboption;

    @FindBy(css = "#social-sidebar-menu > li:nth-child(7) > a")
    private WebElement hotelMenu;

    @FindBy(css = "#Hotels > li:nth-child(1) > a")
    private WebElement hotelSubMenu;

    @FindBy(css = "#Hotels > li:nth-child(2) > a")
    private WebElement roomSubMenu;

    @FindBy(css = "#Hotels > li:nth-child(3) > a")
    private WebElement extraSubMenu;

    @FindBy(css = "#social-sidebar-menu > li:nth-child(9) > a")
    private WebElement toursMenu;

    @FindBy(css = "#logout strong")
    private WebElement logoutButton;

    public Dashboard selectCarsOption() {
        CommonEvents.clickButton(carsOption);

        return this;
    }

    public CarsPage selectSuboptionCarsOfCarsOption() {
        CommonEvents.clickButton(carsSuboption);

        return new CarsPage();
    }

    public CarsSettingsPage selectSuboptionCarsSettingsOfCarsOption() {
        CommonEvents.clickButton(carsSettingsSuboption);

        return new CarsSettingsPage();
    }

    public CarsExtrasPage selectSuboptionExtrasOfCarsOption() {
        CommonEvents.clickButton(carsExtrasSuboption);

        return new CarsExtrasPage();
    }

    public BlogManager clickBlogMenu() {
        CommonEvents.waitWebElementClickable(blogMenu);
        CommonEvents.forceWait(5000);
        CommonEvents.clickButton(blogMenu);
        return new BlogManager();
    }

    public FlightsManager clickFlightMenu() {
        CommonEvents.waitWebElementClickable(flightMenu);
        CommonEvents.clickButton(flightMenu);
        return new FlightsManager();
    }

    public Dashboard clickOptionHotelLateralMenu() {
        CommonEvents.waitWebElementClickable(hotelMenu);
        CommonEvents.clickButton(hotelMenu);
        return this;
    }

    public HotelPage clickSubOptionHotelLateralMenu() {
        CommonEvents.waitWebElementClickable(hotelSubMenu);
        CommonEvents.clickButton(hotelSubMenu);
        return new HotelPage();
    }

    public RoomPage clickSubOptionRoomLateralMenu() {
        CommonEvents.waitWebElementClickable(roomSubMenu);
        CommonEvents.clickButton(roomSubMenu);
        return new RoomPage();
    }

    public ExtraPage clickSubOptionExtraLateralMenu() {
        CommonEvents.waitWebElementClickable(extraSubMenu);
        CommonEvents.clickButton(extraSubMenu);
        return new ExtraPage();
    }

    public ToursManagement clickToursMenu() {
        CommonEvents.waitWebElementClickable(toursMenu);
        CommonEvents.clickButton(toursMenu);
        return new ToursManagement();
    }

    public Login closeSesion() {
        CommonEvents.forceWait(6000);
        CommonEvents.waitWebElementClickable(logoutButton);
        CommonEvents.forceWait(6000);
        CommonEvents.clickButton(logoutButton);
        return new Login();
    }

}
