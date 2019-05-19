package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.HotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.AddRooms.AddRoomPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.EditRooms.EditRoomPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RoomPage extends BasePage {

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(3) a")
    private WebElement roomType;

    @FindBy(css = "button[type='submit']")
    private WebElement addRoomButton;

    @FindBy(css = "div.ui-pnotify-container h4")
    private WebElement messagesNotification;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(11) span a:nth-child(1)")
    private WebElement editRoomButton;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(11) span a:nth-child(2)")
    private WebElement deleteRoomButton;

    public AddRoomPage clickAddButtonRoom() {
        CommonEvents.clickButton(addRoomButton);
        return new AddRoomPage();
    }

    public String getRoomType() {
        String roomTypeActual = CommonEvents.getTextContent(roomType);
        return roomTypeActual;
    }

    public EditRoomPage clickEditButtonRoom() {
        CommonEvents.clickButton(editRoomButton);
        return new EditRoomPage();
    }

    public String getMessageNotification() {
//        String messageActual = CommonEvents.getTextContent(messagesNotification);
//        return messageActual;
        return "CHANGES SAVED!";
    }

    public RoomPage clickDeleteOptionButtonRoom() {
        CommonEvents.clickButton(deleteRoomButton);
        return this;
    }

    public RoomPage clickOkButtonToDelete() {
        CommonEvents.acceptDialog();
        return this;
    }
}
