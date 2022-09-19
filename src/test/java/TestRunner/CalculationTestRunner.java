package TestRunner;

import Base.Setup;
import Screens.CalculationScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTestRunner extends Setup {
    @Test
    public void doSum() throws InterruptedException {
        CalculationScreen calculationScreen = new CalculationScreen(driver);
        String res = calculationScreen.doSum();
        Assert.assertEquals(res,"15");
    }
}
