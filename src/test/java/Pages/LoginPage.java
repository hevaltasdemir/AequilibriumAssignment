package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    /**
     * WebElements
     */

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id=\"login_button_container\"]")
    private WebElement errorMessage;

    @FindBy(css = "#login_button_container > div > form > div:nth-child(1) > svg > path")
    private WebElement deleteButtonUserName;

    @FindBy(css = "#login_button_container > div > form > div:nth-child(2) > svg > path")
    private WebElement deleteButtonPassword;


    /**
     * Methods
     */

    public void enterUsername (String userNameKeyWord){
        userName.sendKeys(userNameKeyWord);
    }

    public void enterPassword(String passwordKeyWord){
        password.sendKeys(passwordKeyWord);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void verifyErrorMessage(String expectedErrorMessage){
        String actualErrorMessage = errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    public void clickDeleteButtonUserName(){
        deleteButtonUserName.click();
    }

    public void clickDeleteButtonPassword(){
        deleteButtonPassword.click();
    }

    public void verifyUserNameDeleted(){
        String textInsideUserNameBox = userName.getAttribute("value");

        Assert.assertEquals("",textInsideUserNameBox);
    }

    public void verifyPasswordDeleted(){
        String textInsidePasswordBox = password.getAttribute("value");

        Assert.assertEquals("",textInsidePasswordBox);
    }
}
