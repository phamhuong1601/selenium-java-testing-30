package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class Topic_02_Selenium_Locator {
    WebDriver driver;

    @BeforeClass
    public void initialBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
    }

@Test
public void TC_07_cssselector() throws InterruptedException
{
driver.findElement(By.cssSelector("input[id='Company']"));
Thread.sleep(3000);
}

@Test
public void TC_08_xpath() throws InterruptedException
    {
       driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
    }

 @Test
 public void TC09_Relative_Locator()
 {
 }
}