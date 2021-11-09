package StepDefinitions;

import Pages.LoginPage;
import Pages.ProductsPage;
import Utils.DriverUtil;
import Utils.PropertiesReading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

public class StepDefinitions {

    //Objects
    private static final Logger logger = Logger.getLogger(StepDefinitions.class);
    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("Launch a web browser to go to Swaglabs login page")
    public void launch_a_web_browser_to_go_to_swaglabs_login_page() {
        logger.info("Launch a web browser to go to Swaglabs login page");
        DriverUtil.getDriver().get(PropertiesReading.getProperties("swagLabsURL"));
    }
    @Then("Enter a valid username as a {string} and password as a {string}")
    public void enter_a_valid_username_as_a_and_password_as_a(String validUserName, String validPassword) {
        logger.info("Enter a valid username as a {string} and password as a {string}");
        loginPage.enterUsername(validUserName);
        loginPage.enterPassword(validPassword);
    }
    @Then("Click on login button")
    public void click_on_login_button() {
        logger.info("Click on login button");
        loginPage.clickLoginButton();
    }
    @Then("Verify the products page to make sure success login")
    public void verify_the_products_page_to_make_sure_success_login() {
        logger.info("Verify the products page to make sure success login");
        productsPage.verifyProductsPage();
    }
    @Then("Enter a invalid username as a {string} and valid password as a {string}")
    public void enter_a_invalid_username_as_a_and_valid_password_as_a(String invalidUserName, String validPassword) {
        logger.info("Enter a invalid username as a {string} and valid password as a {string}");
        loginPage.enterUsername(invalidUserName);
        loginPage.enterPassword(validPassword);
    }
    @Then("Verify the error message {string}")
    public void verify_the_error_message(String errorMessage) {
        logger.info("Verify the error message {string}");
        loginPage.verifyErrorMessage(errorMessage);
    }
    @Then("Enter a valid username as a {string} and invalid password as a {string}")
    public void enter_a_valid_username_as_a_and_invalid_password_as_a(String validUserName, String invalidPassword) {
        logger.info("Enter a valid username as a {string} and invalid password as a {string}");
        loginPage.enterUsername(validUserName);
        loginPage.enterPassword(invalidPassword);
    }
    @Then("Do not enter username")
    public void do_not_enter_username() {
        logger.info("Do not enter username");
        // You don't need to enter anything on this step.
    }
    @Then("Enter a valid password as a {string}")
    public void enter_a_valid_password_as_a(String validPassword) {
        logger.info("Enter a valid password as a {string}");
        loginPage.enterPassword(validPassword);
    }
    @Then("Enter a valid username as a {string}")
    public void enter_a_valid_username_as_a(String validUserName) {
        logger.info("Enter a valid username as a {string}");
        loginPage.enterUsername(validUserName);
    }
    @Then("Do not enter password")
    public void do_not_enter_password() {
        logger.info("Do not enter password");
        // You don't need to enter anything on this step.
    }
    @Then("Enter a locked account's username as a {string} and password as a {string}")
    public void enter_a_locked_account_s_username_as_a_and_password_as_a(String lockedUsername, String validPassword) {
        logger.info("Enter a locked account's username as a {string} and password as a {string}");
        loginPage.enterUsername(lockedUsername);
        loginPage.enterPassword(validPassword);
    }
    @Then("Click on x button beside the username")
    public void click_on_x_button_beside_the_username() {
        logger.info("Click on x button beside the username");
        loginPage.clickDeleteButtonUserName();
    }
    @Then("Verify username has been deleted")
    public void verify_username_has_been_deleted() {
        logger.info("Verify username has been deleted");
        loginPage.verifyUserNameDeleted();
    }
    @Then("Click on x button beside the password")
    public void click_on_x_button_beside_the_password() {
        logger.info("Click on x button beside the password");
        loginPage.clickDeleteButtonPassword();
    }
    @Then("Verify password has been deleted")
    public void verify_password_has_been_deleted() {
        logger.info("Verify password has been deleted");
        loginPage.verifyPasswordDeleted();
    }
}
