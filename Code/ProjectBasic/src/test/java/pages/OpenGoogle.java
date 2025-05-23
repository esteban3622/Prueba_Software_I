package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    
    // @Test
    // public void openGoogle() {
    //     driver.get("https://www.google.com");
    // }

    @Test
    public void openYoutube() {
        driver.get("https://www.youtube.com");
    }

    // @AfterMethod
    // public void tearDown() {
    //     if (driver != null) {
    //         driver.quit();
    //     }
    // }
}
