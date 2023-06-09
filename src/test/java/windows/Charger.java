package windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Charger {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/");
        driver.findElement(By.linkText("PRACTICE")).click();

        String firstWindowID = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String id : handles) {
            if (!id.equals(firstWindowID)) {
                driver.switchTo().window(id);
                break;
            }
        }

        driver.findElement(By.id("opentab")).click();
        String secondWindowID = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String id : windowHandles) {
            if (!id.equals(firstWindowID) && !id.equals(secondWindowID)) {
                driver.switchTo().window(id);
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();




    }
}












