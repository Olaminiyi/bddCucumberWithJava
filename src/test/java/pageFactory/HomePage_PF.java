package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage_PF {

    @FindBy(className = "title")
    WebElement pageTitle;
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public HomePage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void checkPageTitleIsDisplay(){
        wait.until(ExpectedConditions.visibilityOf(pageTitle));
        pageTitle.getText();
        assert pageTitle.getText().equalsIgnoreCase("Products");
    }
}
