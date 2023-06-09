package actions;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practiceActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.click();
        searchInput.sendKeys("Muhammed Ali");
        searchInput.sendKeys(Keys.ENTER);

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").sendKeys("c").keyUp(Keys.COMMAND).perform();

       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://wordcounter.net");

       WebElement wind = driver.findElement(By.id("box"));
       actions.keyDown(wind, Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();

       WebElement counter = driver.findElement(By.xpath("//h1/span"));
       String expectedResult = "25,089 words 157,228 characters";
       if (counter.getText().equals(expectedResult)){
           System.out.println("Finally Passed");
       }else {
           System.out.println("Failed");
       }







    }
}
