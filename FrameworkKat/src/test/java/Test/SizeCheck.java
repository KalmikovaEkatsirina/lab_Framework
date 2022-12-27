package Test;

import Model.Item;
import Pages.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SizeCheck extends CommonConditions{
    @Test
    //этот должен фейлиться на сайте не работает нихуя
    public void checkIfSettedSizeIsCorrect(){
        Item jacket= ItemCreator.CreateJacket();
        driver.manage().window().maximize();
        String jacketSize = new MainPage(driver)
                .openPage()
                .openMenu()
                .openJacketsPage()
                .openSizesSpinner()
                .allPageSetSize()
                .openSingleJacketPage()
                .getItemSize();

        Assert.assertEquals(jacketSize,"XL");
    }
}
