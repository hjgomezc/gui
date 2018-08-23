package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage {
    @FindBy(id = "firstHeading")
    private WebElement title;

    private WebDriver driver;

    public ArticlePage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
    }

    public String getTitle(){
       // WebElement title = driver.findElement(By.id("firstHeading"));
        return title.getText();
    }
}
