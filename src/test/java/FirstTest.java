import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    private static final String URL = "https://www.amazon.com";
    private static final String SEARCH_QUERY = "kettle amazon basics";
    public static By inputFieldLocator = By.id("twotabsearchtextbox");
    public static By filterNew = By.xpath("//span[@class='a-list-item']//*[contains(text(),'New')]");
    public static By fourStarsFilter = By.xpath("//i[contains(@class,'a-star-medium-4')]");
    public static By gienarKettle = By.xpath("//div[@class='sg-col-inner']//*[contains(text(), 'Gienar Travel Foldable Electric Kettle Food Grade Silicone Collapsible Kettle with Boil Dry Protection 600ML (100-120V & 220-240V, White)')]");

    public static void main(String[] args) throws InterruptedException {

        String path = System.getProperty("user.dir");
        System.out.println("user.dir equals:" + path);

        System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        // 1. Open amazon page
        driver.get(URL);

        // 2. Search for 'kettle amazon basics' value
        WebElement inputField = driver.findElement(inputFieldLocator);
        inputField.sendKeys(SEARCH_QUERY);
        inputField.submit();

        // 3. Click New filter
        driver.findElement(filterNew).click();

        // waiting
        Thread.sleep(5000);

        // 4. Click 4-stars
        driver.findElement(fourStarsFilter).click();

        /* 5. Check that "Gienar Travel Foldable Electric Kettle Food Grade Silicone
           Collapsible Kettle with Boil Dry Protection 600ML (100-120V & 220-240V, White)" is displayed */
        driver.findElement(gienarKettle).isDisplayed();

        driver.close();
    }
}
