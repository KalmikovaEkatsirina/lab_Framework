package Test;

import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToWishListTest extends CommonConditions{
    @Test
    public void checkIfAddedToWishList(){
        driver.manage().window().maximize();
        String wishlistTestResult=new MainPage(driver)
                .openPage()
                .openMenu()
                .openJacketsPage()
                .acceptLocation()
                .openFilters()
                .rejectNews()
                .chooseSize()
                .openSingleJacketPage()
                .addToWishlist()
                .getResult();
        Assert.assertEquals(wishlistTestResult,"");
    }
}
