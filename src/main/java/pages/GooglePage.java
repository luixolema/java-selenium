package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends Page {

    @FindBy(css = "#idToLookFor")
    private WebElement httpElement;

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(css = "#tsf")
    private WebElement searchButton;

    public GooglePage(WebDriver driver) {
        super(driver, null);
    }

    public void search(String query){
        this.searchBox.sendKeys(query);
        this.searchButton.submit();
    }

}
