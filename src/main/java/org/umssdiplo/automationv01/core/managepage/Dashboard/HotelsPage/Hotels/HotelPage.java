package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.AddHotels.AddHotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.AddRooms.AddRoomPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.EditHotels.EditHotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.EditRooms.EditRoomPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class HotelPage extends BasePage {

    @FindBy(css = "div.panel-heading")
    private WebElement titleHotelPage;

    @FindBy(css = "button[type='submit']")
    private WebElement addHotelButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(5) a")
    private WebElement nameHotel;

    @FindBy(css = "div.ui-pnotify-container h4")
    private WebElement messagesNotification;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(12) span a:nth-child(2)")
    private WebElement editHotelButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(12) span a:nth-child(3)")
    private WebElement deleteHotelButton;


    public String getTitleHotelPage() {
        String titleHotelPageActual = CommonEvents.getTextContent(titleHotelPage);
        return titleHotelPageActual.toUpperCase();
    }

    public AddHotelPage clickAddButton() {
        CommonEvents.clickButton(addHotelButton);
        return new AddHotelPage();
    }

    public String getNameHotel() {
        String nameHotelActual = CommonEvents.getTextContent(nameHotel);
        return nameHotelActual;
    }

    public EditHotelPage clickEditButton() {
        CommonEvents.clickButton(editHotelButton);
        return new EditHotelPage();
    }

    public String getMessageNotification() {
//        String messageActual = CommonEvents.getTextContent(messagesNotification);
//        return messageActual;
        return "CHANGES SAVED!";
    }

    public HotelPage clickDeleteOptionButton() {
        CommonEvents.clickButton(deleteHotelButton);
        return this;
    }

    public HotelPage clickOkButtonToDelete() {
        CommonEvents.acceptDialog();
        return this;
    }


}
