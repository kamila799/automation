package iFrame;

import com.beust.ah.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Local {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///Users/admin/Desktop/CodeWise/HTML/iFrame.html");

        List<WebElement> texts = driver.findElements(By.xpath("//h1"));
        System.out.println(texts.size());
        WebElement secondFrame = driver.findElement(By.xpath("//iframe[2]"));
        driver.switchTo().frame(secondFrame);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce" + Keys.ENTER);

//        driver.switchTo().parentFrame();
//        WebElement thirdFrame = driver.findElement(By.xpath("//iframe[3]"));
//        driver.switchTo().frame(thirdFrame);
//        driver.findElement(By.xpath("//a[@class='dynamic-link']"));
        driver.switchTo().defaultContent();
        driver.switchTo().frame("test");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(1500);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(1500);
        alert.accept();

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,700).perform();
        Thread.sleep(3000);
        driver.switchTo().frame("courses-iframe");

//        // Identify the element to hover over
//        WebElement elementToHover = driver.findElement(By.xpath("//a[@href='/practice']"));
//
//        // Create an instance of Actions class
//        Actions actions = new Actions(driver);
//
//        // Perform the hover action
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/practice']"))).perform();
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/home']"))).perform();






    }
}
