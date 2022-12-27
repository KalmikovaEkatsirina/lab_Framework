package Test;

import Model.Item;
import Pages.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedDressTest extends CommonConditions{
    @Test
    public void checkIfAddedToWishList(){
        driver.manage().window().maximize();
        Item dress= ItemCreator.createDress();
        String redDressTestResult=new MainPage(driver)
                .openPage()
                .openMenu()
                .openDressesPage()
                .acceptLocation()
                .openFilters()
                .rejectNews()
                .chooseSize()
                .setRedDressColor()
                .openDressPage()
                .getItemName();
        System.out.println(
                dress.itemName
        );
        System.out.println(
                redDressTestResult
        );
        Assert.assertEquals(redDressTestResult,dress.itemName);
    }
}