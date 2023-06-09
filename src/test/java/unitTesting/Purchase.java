package unitTesting;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class Purchase {

    @Test
    public void itemPurchase(){
        String cc = "4496051312226596";
        String cvv = "547";
        String expiration = "2027";
        String month = "11";
        Driver.getDriver().get(Config.getValue("paymentGateURL"));
        Driver.getDriver().findElement(By.xpath("//ul[@class='actions']//input")).click();
        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(cc);
        Select selectMonth = new Select(Driver.getDriver().findElement(By.id("month")));
        Select selectYear = new Select(Driver.getDriver().findElement(By.id("year")));
        selectMonth.selectByVisibleText(month);
        selectYear.selectByVisibleText(expiration);
        Driver.getDriver().findElement(By.id("cvv_code")).sendKeys(cvv);
        Driver.getDriver().findElement(By.name("submit")).click();
        String url = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(url.contains("genearte_orderid"));
        Driver.quit();
    }

    @Test
    public void creditCardLimit(){
            String cc = "4496051312226596";
            String cvv = "547";
            String expiration = "2027";
            String month = "11";
            Driver.getDriver().get(Config.getValue("paymentGateURL"));
//            Driver.getDriver().findElement(By.xpath("//ul[@class='actions']//input")).click();
//            Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(cc);
//            Select selectMonth = new Select(Driver.getDriver().findElement(By.id("month")));
//            Select selectYear = new Select(Driver.getDriver().findElement(By.id("year")));
//            selectMonth.selectByVisibleText(month);
//            selectYear.selectByVisibleText(expiration);
//            Driver.getDriver().findElement(By.id("cvv_code")).sendKeys(cvv);
//            Driver.getDriver().findElement(By.name("submit")).click();
//            String url = Driver.getDriver().getCurrentUrl();
            Driver.getDriver().findElement(By.xpath("//*[@id=\"nav\"]/a[3]")).click();
            Driver.getDriver().findElement(By.xpath("//*[@id='card_nmuber']")).sendKeys(cc);
            Driver.getDriver().findElement(By.name("submit")).click();
            String balance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText().trim();
            System.out.println(balance);
            int balanceInt = Integer.parseInt(balance);
            Driver.getDriver();

//            Driver.quit();
        /*
        @Before
    public void testSetup(){
        Driver.getDriver().get(Config.getValue("paymentGateURL"));
    }

    @Test
    public void itemPurchase(){
        String cc = "3798234798232434";
        String cvv = "342";
        String expiration = "2019";
        String month = "02";
        Driver.getDriver().findElement(By.xpath("//ul[@class='actions']//input")).click();
        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(cc);
        Select selectMonth = new Select(Driver.getDriver().findElement(By.id("month")));
        Select selectYear = new Select(Driver.getDriver().findElement(By.id("year")));
        selectMonth.selectByVisibleText(month);
        selectYear.selectByVisibleText(expiration);
        Driver.getDriver().findElement(By.id("cvv_code")).sendKeys(cvv);
        Driver.getDriver().findElement(By.name("submit")).click();
        String url = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(url.contains("genearte_orderid"));
    }

    @Test
    public void creditLimitTest(){
        String cc = "3798234798232444";
        String cvv = "342";
        String expiration = "2019";
        String month = "02";
        Driver.getDriver().get(Config.getValue("paymentGateURL"));

        Driver.getDriver().findElement(By.linkText("Check Credit Card Limit")).click();
        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(cc + Keys.ENTER);
        String balance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText().trim();
        int balanceInt = Integer.parseInt(balance);
        ApplicationFlow.pause(2000);
        Driver.getDriver().findElement(By.linkText("Cart")).click();

        Driver.getDriver().findElement(By.xpath("//ul[@class='actions']//input")).click();
        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(cc);
        Select selectMonth = new Select(Driver.getDriver().findElement(By.id("month")));
        Select selectYear = new Select(Driver.getDriver().findElement(By.id("year")));
        selectMonth.selectByVisibleText(month);
        selectYear.selectByVisibleText(expiration);
        Driver.getDriver().findElement(By.id("cvv_code")).sendKeys(cvv);
        Driver.getDriver().findElement(By.name("submit")).click();

        Assert.assertTrue(url.contains("genearte_orderid"));

        Driver.getDriver().findElement(By.linkText("Check Credit Card Limit")).click();
        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(cc + Keys.ENTER);
        String afterBalance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText().trim();
        int afterBalanceInt = Integer.parseInt(afterBalance);
        ApplicationFlow.pause(2000);

        Assert.assertEquals(afterBalanceInt, (balanceInt-20));
    }

    @After
    public void cleanUp(){
        Driver.quit();
    }
}

         */
        }
    }


