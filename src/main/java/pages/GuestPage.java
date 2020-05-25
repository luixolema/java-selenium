package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuestPage extends Page{

    @FindBy(css = "#core-navigation-drawer > div.v-navigation-drawer__content > div.v-list.v-sheet.v-sheet--tile.theme--dark.v-list--dense.v-list--nav > div > div.v-list-item__content > div > div")
    private WebElement diveCenterName;

    @FindBy(css = "#app > div > main > div > div > div > div.flex-grow-1.py-0.px-2.col-sm-12.col-md-4.col-12 > div > div > div:nth-child(3) > div > div > table")
    private WebElement guestTable;

    @FindBy(css = "#input-75")
    private WebElement allFilter;

    @FindBy(css = "##input-77")
    private WebElement checkInFilter;

    @FindBy(css = "#input-79")
    private WebElement noCheckInFilter;

    public GuestPage(WebDriver driver) {
        super(driver, "/pages/guests");
    }

    public WebElement getDiveCenterName() {
        return diveCenterName;
    }
}
