package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchResultsPage extends BasePage{


    private By filterNew = By.xpath("//span[@class='a-list-item']//*[contains(text(),'New')]");
    private By fourStarsFilter = By.xpath("//i[contains(@class,'a-star-medium-4')]");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }


    public SearchResultsPage clickNewFilter(){
        driver.findElement(filterNew).click();
        return this;
    }

    public SearchResultsPage clickFourStarsFilter() {
        getCliсkableElement(fourStarsFilter).click();
        return this;
    }

    public WebElement getExpectedElement(String expectedResult) {
        By expectedElementLocator = By.xpath(String.format("//*[contains(text(), '%s')]", expectedResult));
        return getVisibleElement(expectedElementLocator);
    }
}
