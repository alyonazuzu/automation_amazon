package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

    private By signInButtonLocator = By.id("signInSubmit");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignInButton() {
        return getVisibleElement(signInButtonLocator);
    }
}
