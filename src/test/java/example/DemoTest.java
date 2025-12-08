package example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testGoogleTitle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        String title = driver.getTitle();

        driver.quit();

        Assert.assertTrue(title.contains("Google"), "Title does not contain Google!");
    }
}
