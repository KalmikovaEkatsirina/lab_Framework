package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AllItemsPage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"saveStore\"]")
    WebElement location;
    @FindBy(xpath = "/html/body/div[8]/div[3]/section/div[2]/div/button[1]/span[2]")
    WebElement filter;
    @FindBy(xpath = "/html/body/div[9]/div/div[2]/div[3]/div[2]/div/button[2]")
    WebElement size;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[1]/a/div/div/figure/img")
    WebElement chooseJacket;
    @FindBy(xpath = "/html/body/div[18]/div[1]")
    WebElement newsReject;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/div/div[7]/div/label/div")
    WebElement allPageSize;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div[2]/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div")
    WebElement openSpinner;
    @FindBy(xpath = "/html/body/div[9]/div/div[2]/div[2]/div[2]/div/button[2]")
    WebElement redDressColor;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/a/div[1]/div/figure/img")
    WebElement redDressImage;


    @Override
    protected AbstractPage openPage() {
        return this;
    }

    public AllItemsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public AllItemsPage acceptLocation(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(location)).click();
        log.info("location clicked");
        return this;
    }
    public AllItemsPage openFilters(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(filter)).click();
        log.info("filter clicked");
        return this;
    }
    public AllItemsPage rejectNews(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(newsReject)).click();
        log.info("newsReject clicked");
        return this;
    }
    public AllItemsPage chooseSize(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(size)).click();
        log.info("size clicked");
        return this;
    }
    public SingleItemPage openSingleJacketPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(chooseJacket)).click();
        log.info("chooseJacket clicked");
        return new SingleItemPage(driver);
    }
    public AllItemsPage openSizesSpinner(){
        openSpinner.click();
        log.info("openSpinner clicked");
        return this;
    }
    public AllItemsPage allPageSetSize(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(allPageSize)).click();
        log.info("allPageSize clicked");
        return this;
    }
    public AllItemsPage setRedDressColor(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(redDressColor)).click();
        log.info("redDressColor clicked");
        return this;
    }
    public SingleItemPage openDressPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(redDressImage)).click();
        log.info("redDressImage clicked");
        return new SingleItemPage(driver);
    }
}
