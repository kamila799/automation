package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Box {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();
        WebElement buttonForAlert = driver.findElement(By.id("dblClkBtn"));

        Actions actions = new Actions(driver);
        actions.doubleClick(buttonForAlert).perform();
        String expectedAlert = "Welcome to Art of Testing!";

        Alert alert = driver.switchTo().alert();
        if (expectedAlert.equals(alert.getText())){
            System.out.println("Test Passed!");
        }else {
            System.out.println("Test Failed!");
        }



    }
}
