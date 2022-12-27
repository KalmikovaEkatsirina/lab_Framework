package Test;

import Model.Item;
import Pages.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LastOpenedItemsTest extends CommonConditions{
    @Test
    public void checkLastItemTest(){
        Item jacket= ItemCreator.CreateJacket();
        driver.manage().window().maximize();
        String lastopeneditemname=new MainPage(driver)
                .openPage()
                .openMenu()
                .openJacketsPage()
                .openSingleJacketPage()
                .openMainPage()
                .openLastItem()
                .getItemName();
        Assert.assertEquals(lastopeneditemname,jacket.itemName);
    }
}
