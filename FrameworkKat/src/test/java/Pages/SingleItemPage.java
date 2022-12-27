package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingleItemPage extends AbstractPage {
    @FindBy(xpath = "/html/body/div[7]/div/div[1]/div/div/div[3]/add-to-wishlist-button")
    WebElement wishlistButton;
    @FindBy(xpath = "/html/body/div[4]/div[5]/logo-element")
    WebElement mainPageLogo;
    @FindBy(xpath = "/html/body/div[7]/div/div[1]/div/div/div[1]/h1")
    WebElement jacketName;
    @FindBy(xpath = "/html/body/div[7]/div/div[1]/div/div/div[2]/div[1]/p")
    WebElement jacketSize;

    @Override
    protected AbstractPage openPage() {
        return this;
    }

    public SingleItemPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public SingleItemPage addToWishlist(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(wishlistButton)).click();
        return this;
    }
    public MainPage openMainPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(mainPageLogo)).click();
        log.info("mainPageLogo clicked");
        return new MainPage(driver);
    }
    public String getResult(){
        log.info("result returned");
        return wishlistButton.getAttribute("is-active");
    }
    public String getItemName(){
        log.info("jacketName returned");
        return jacketName.getText();
    }
    public String getItemSize(){
        log.info("jacketSize returned");
        return jacketSize.getText().substring(28,28+jacketSize.getText().length()-28);
    }
}
