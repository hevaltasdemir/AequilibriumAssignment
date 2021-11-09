package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    /**
     * WebElements
     */

    @FindBy (xpath = "//span[.='Products']")
    private WebElement titleProductsPage;


    /**
     * Methods
     */

    public void verifyProductsPage(){
        String expectedTitle = "PRODUCTS";
        String actualTitle = titleProductsPage.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
