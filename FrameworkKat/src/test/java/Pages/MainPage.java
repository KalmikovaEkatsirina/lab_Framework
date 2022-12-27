package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {
    String mainPage="https://www.pullandbear.com/by/%D0%B4%D0%BB%D1%8F-%D0%B6%D0%B5%D0%BD%D1%89%D0%B8%D0%BD-n6417";
    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div/ul/li[3]/a/p")
    WebElement clothes;
    @FindBy(xpath = "//*[@id=\"subitems-cont-1030207046\"]/li[6]/a/p")
    WebElement jackets;
    @FindBy(xpath = "/html/body/div[4]/div[3]/div/div/ul/li[3]/ul/li[8]/a/p/span")
    WebElement dresses;

    @FindBy(xpath = "/html/body/div[6]/div[4]/div/div/div/div[3]/div/div/div/div/div[1]/a/div/div/img")
    WebElement lastOpenedItem;

    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public MainPage openPage(){
        driver.get(mainPage);
        return this;
    }
    public MainPage openMenu(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(clothes)).click();
        log.info("clothes clicked");
        return this;
    }
    public AllItemsPage openJacketsPage(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(jackets)).click();
        log.info("jackets clicked");
        return new AllItemsPage(driver);
    }
    public AllItemsPage openDressesPage(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(dresses)).click();
        log.info("dresses clicked");
        return new AllItemsPage(driver);
    }
    public SingleItemPage openLastItem(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(lastOpenedItem)).click();
        log.info("lastOpenedItem clicked");
        return new SingleItemPage(driver);
    }
}
