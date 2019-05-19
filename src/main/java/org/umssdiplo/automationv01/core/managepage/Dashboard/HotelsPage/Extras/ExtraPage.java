package org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Extras;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Extras.AddExtras.AddExtraPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.AddRooms.AddRoomPage;
import org.umssdiplo.automationv01.core.managepage.Dashboard.HotelsPage.Rooms.EditRooms.EditRoomPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ExtraPage extends BasePage {

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(4)")
    private WebElement nameExtra;

    @FindBy(css = "tbody > tr:nth-child(1) > td:nth-child(6)")
    private WebElement priceExtra;

    @FindBy(xpath = "//a[contains(text(),' Add')]")
    private WebElement addExtraButton;

    public AddExtraPage clickAddButtonExtra() {
        CommonEvents.clickButton(addExtraButton);
        return new AddExtraPage();
    }

    public String getNameExtra() {
        CommonEvents.forceWait(4000);
        String nameExtraActual = CommonEvents.getTextContent(nameExtra);
        return nameExtraActual;
    }

    public String getPriceExtra() {
        String priceExtraActual = CommonEvents.getTextContent(priceExtra);
        return priceExtraActual;
    }
}
