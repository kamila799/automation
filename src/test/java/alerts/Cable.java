package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/sampleSiteForSelenium");
        driver.manage().window().maximize();

        WebElement buttonForAlert = driver.findElement(By.xpath("//div[@id='AlertBox']/button"));

        buttonForAlert.click();

        Alert alert = driver.switchTo().alert();

        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(1000);
        driver.findElement(By.id("male")).click();



        WebElement alertBtn2 = driver.findElement(By.xpath("//div[@id='ConfirmBox']/button"));
        alertBtn2.click();
        Alert alert2 = driver.switchTo().alert();

        Thread.sleep(1000);
        System.out.println(alert2.getText());
        alert2.dismiss();


        WebElement resultMessage = driver.findElement(By.id("demo"));
        String expectedMessage = "You pressed Cancel!";
        if (expectedMessage.equals(resultMessage.getText())){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }






    }
}
