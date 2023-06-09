package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadBtn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadBtn = driver.findElement(By.id("file-upload"));
        Thread.sleep(1000);
        uploadBtn.sendKeys("/Users/admin/Desktop/CodeWise/Java Rules/exceptions.png");

        Thread.sleep(1000);
        driver.findElement(By.id("file-submit")).click();


    }
}
