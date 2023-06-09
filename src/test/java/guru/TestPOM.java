package guru;

import org.junit.Test;
import pagesPOM.GuruHomePage;
import utilities.Config;
import utilities.Driver;

public class TestPOM {

    @Test
    public void menuTest(){
        Driver.getDriver().get(Config.getValue("guruURL"));
        GuruHomePage guruHomePage = new GuruHomePage();
        guruHomePage.submitBtn.click();
        guruHomePage.agileProjectLink.click();
        guruHomePage.bankProjectLink.click();
        guruHomePage.paymentGatewayProjectLink.click();
    }
}
