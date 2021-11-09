package Pages;

import Utils.DriverUtil;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }
}