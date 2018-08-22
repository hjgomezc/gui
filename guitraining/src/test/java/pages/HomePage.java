package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public ArticlePage search(String query) {
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys(query);
        WebDriverWait wait = new WebDriverWait(driver, Long.parseLong("10"));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//*[@id='typeahead-suggestions']//a"), 1));
        List<WebElement> suggestions = driver.findElement(By.id("typeahead-suggestions")).findElements(By.tagName("a"));
        suggestions.get(0).click();
        return new ArticlePage(driver);
    }
}
