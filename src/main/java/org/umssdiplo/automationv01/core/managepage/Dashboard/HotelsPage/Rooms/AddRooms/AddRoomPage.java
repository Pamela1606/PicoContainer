package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.AddRooms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.HotelPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.RoomPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class AddRoomPage extends BasePage {

    @FindBy(css = "#s2id_autogen1")
    private WebElement roomTypeSelect;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement roomType;

    @FindBy(css = "div#GENERAL iframe")
    private WebElement descripRoomFrame;

    @FindBy(name = "basicprice")
    private WebElement price;

    @FindBy(name = "quantity")
    private WebElement quantity;

    @FindBy(name = "minstay")
    private WebElement minimumStay;

    @FindBy(name = "adults")
    private WebElement adults;

    @FindBy(name = "children")
    private WebElement children;

    @FindBy(name = "extrabeds")
    private WebElement extraBeds;

    @FindBy(name = "bedcharges")
    private WebElement bedCharges;

    @FindBy(css = "button#add")
    private WebElement submitButton;

    public RoomPage getFillGeneralTabFormRoom(List<Map<String, String>> valuesRooms) {
        Map<String, String> dtFormRoom = valuesRooms.get(0);
        selectRoomType(dtFormRoom.get("Room Type"));

        CommonEvents.forceWait(10000);
        CommonEvents.setIframeContent(descripRoomFrame, dtFormRoom.get("Room Description"));

        CommonEvents.setInputField(price, dtFormRoom.get("Price"));
        CommonEvents.setInputField(quantity, dtFormRoom.get("Quantity"));
        CommonEvents.setInputField(minimumStay, dtFormRoom.get("Minimum Stay"));
        CommonEvents.setInputField(adults, dtFormRoom.get("Max Adults"));
        CommonEvents.setInputField(children, dtFormRoom.get("Max Children"));
        CommonEvents.setInputField(extraBeds, dtFormRoom.get("No of Extra Beds"));
        CommonEvents.setInputField(bedCharges, dtFormRoom.get("Extra Bed Charges"));

        CommonEvents.clickButton(submitButton);
        return new RoomPage();
    }

    private void selectRoomType(String roomTypeString) {
        CommonEvents.clickButton(roomTypeSelect);
        CommonEvents.setInputField(roomType, roomTypeString);
        CommonEvents.forceWait(6000);
        CommonEvents.pressEnterKey(roomType);
    }
}
