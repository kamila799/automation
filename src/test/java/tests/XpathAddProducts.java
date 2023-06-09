package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAddProducts {
        public static void main(String[] args) {
            String usernameData = "problem_user";
            String passwordData = "secret_sauce";

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
            WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
            WebElement loginBtn =  driver.findElement(By.xpath("//*[@name='login-button']"));

            username.sendKeys(usernameData);
            password.sendKeys(passwordData);
            loginBtn.click();

            List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[.='Add to cart']"));
            for (WebElement button:addToCartButtons) {
                button.click();
            }
            WebElement cartNumber = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
            String itemQuantity = cartNumber.getText();

            int quantityInt = Integer.parseInt(itemQuantity);

            System.out.println(quantityInt);
            System.out.println(addToCartButtons.size());

            if (quantityInt == addToCartButtons.size()){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
//
//            driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
//            driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light']")).click();
//            driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
//            driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
//            driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']")).click();
//            driver.findElement(By.xpath("//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
//            driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();








        }
    }

