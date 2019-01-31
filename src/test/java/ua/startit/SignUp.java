package ua.startit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class SignUp extends BaseTest{


    @Test (groups = {"p0", "smoke"})
    public void testSignUp(){

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickSingInButton().getSignInButton().isDisplayed(), "Expected element is displayed");

    }


}
