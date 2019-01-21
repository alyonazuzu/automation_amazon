import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUp {

    private static final String URL = "https://www.amazon.com";
    private static By navLinkLocator = By.id("nav-link-accountList");


    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println("user.dir equals:" + path);

        System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // 1. Open amazon page
        driver.get(URL);

        // 2. Hover the 'Hello, Sign in' value
        WebElement navLink = driver.findElement(navLinkLocator);
        Actions action = new Actions(driver);
        action.moveToElement(navLink).build().perform();

        // 3. Click the 'Sign in' value
        driver.findElement(By.linkText("Sign in")).click();
    }
}
