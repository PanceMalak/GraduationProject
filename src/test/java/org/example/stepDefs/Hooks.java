package org.example.stepDefs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks {
        WebDriver driver;
        String URL = "https://demo.nopcommerce.com/";

        @BeforeTest
        public void OpenBrowser() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URL);


        }

        @AfterTest
    public void quitBrowser() throws InterruptedException {
            Thread.sleep(4000);
            driver.quit();
        }
    }


