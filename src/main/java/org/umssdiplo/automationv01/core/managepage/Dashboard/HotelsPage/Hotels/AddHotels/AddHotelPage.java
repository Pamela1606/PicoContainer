package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.AddHotels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Hotels.HotelPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

import java.util.List;
import java.util.Map;

public class AddHotelPage extends BasePage {

    @FindBy(name = "hotelname")
    private WebElement nameHotel;

    @FindBy(css = "div#GENERAL iframe")
    private WebElement descripHotelFrame;

    @FindBy(css = "#s2id_searching")
    private WebElement locationSelect;

    @FindBy(css = "#select2-drop > div:nth-child(1) > input:nth-child(1)")
    private WebElement locationHotel;

    @FindBy(css = "button#add")
    private WebElement submitButton;


    public HotelPage getFillGeneralTabFormHotel(List<Map<String, String>> valuesHotels) {
        Map<String, String> dtForm = valuesHotels.get(0);
        CommonEvents.setInputField(nameHotel, dtForm.get("Hotel Name"));

        CommonEvents.forceWait(9000);
        CommonEvents.setIframeContent(descripHotelFrame, dtForm.get("Hotel Description"));

        selectLocationHotel(dtForm.get("Location"));
        CommonEvents.clickButton(submitButton);
        return new HotelPage();

    }

    private void selectLocationHotel(String locationHotelString) {
        CommonEvents.clickButton(locationSelect);
        CommonEvents.setInputField(locationHotel, locationHotelString);
        CommonEvents.forceWait(6000);
        CommonEvents.pressEnterKey(locationHotel);
    }
}
