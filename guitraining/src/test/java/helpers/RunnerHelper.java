package helpers;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerHelper {
    protected WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://www.wikipedia.org");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
