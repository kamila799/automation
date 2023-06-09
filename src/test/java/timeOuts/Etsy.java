package timeOuts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Etsy {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // 10,12, 15 sec is the most common
        driver.get("https://etsy.com");
        driver.manage().window().maximize();
        WebElement searchInput = driver.findElement(By.id("global-enhancements-search-query"));
        searchInput.sendKeys("Bracelet" + Keys.ENTER);
    }
}
