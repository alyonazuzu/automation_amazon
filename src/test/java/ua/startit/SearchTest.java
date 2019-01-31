package ua.startit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class SearchTest extends BaseTest {



    @DataProvider(name = "search queries for amazon")
    public static Object[][] searchQueries() {
        return new Object[][] {
//              {"#search query", "#expected result"},
                {"kettle amazon basics", "Gienar Travel Foldable Electric Kettle Food"},
                {"red dead redemption 2", "PS4 - Red Dead Redemption 2 - Ultimate Edition"}
        };
    }


    @Test (dataProvider = "search queries for amazon", groups = {"p1", "smoke"})
    public  void testKettle(String searchQuery, String expectedResult){

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.search(searchQuery).clickNewFilter().clickFourStarsFilter()
                .getExpectedElement(expectedResult).isDisplayed(), "Expected element is displayed");
    }


}
