package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVisibleElement(By elementLocator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait
                .until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        return element;
    }


    public WebElement getCliсkableElement(By elementLocator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait
                .until(ExpectedConditions.elementToBeClickable(elementLocator));
        return element;
    }
}
