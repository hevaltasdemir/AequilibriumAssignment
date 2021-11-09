package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverUtil {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            String browser = PropertiesReading.getProperties("browser");
            String userDir = System.getProperty("user.dir");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    System.setProperty("webdriver.chrome.driver", userDir+"/src/test/resources/Drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    System.setProperty("webdriver.gecko.driver", userDir+"/src/test/resources/Drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;
            }
        }

        return driver;

    }

    public static void closeDrive() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
