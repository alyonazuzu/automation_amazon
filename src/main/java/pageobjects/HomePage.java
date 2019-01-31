package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By inputFieldLocator = By.id("twotabsearchtextbox");
    private By navLinkLocator = By.id("nav-link-accountList");
    private By signInButton = By.linkText("Sign in");




    public SearchResultsPage search(String searchQuery) {
        WebElement inputField = driver.findElement(inputFieldLocator);
        inputField.sendKeys(searchQuery);
        inputField.submit();
        return new SearchResultsPage(driver);
    }



    public LoginPage clickSingInButton() {
        WebElement navLink = driver.findElement(navLinkLocator);
        Actions action = new Actions(driver);
        action.moveToElement(navLink).build().perform();
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }
}
