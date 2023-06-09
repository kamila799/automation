package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAddedItem {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String usernameData = "standard_user";
        String passwordData = "secret_sauce";

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement loginBtn =  driver.findElement(By.xpath("//*[@name='login-button']"));

        userName.sendKeys(usernameData);
        password.sendKeys(passwordData);
        loginBtn.click();

        WebElement addToCartBtn = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartBtn.click();
        Thread.sleep(1000);

        WebElement button = driver.findElement(By.xpath("(//div[@class='pricebar'])[1]/button"));
        String text = button.getText();

        if (text.equals("Remove")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }



    }
}
