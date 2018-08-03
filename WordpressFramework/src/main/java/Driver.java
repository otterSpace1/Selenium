import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {


    public static String BaseAdress = "http://127.0.0.1:8888/wordpress/";
    public static WebDriver Instance;

    public static WebDriver getInstance() {
        return Instance;
    }

    public static void setInstance(WebDriver instance) {
        Instance = instance;
    }

    public static void initialize() {
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\istefanie282\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","/Users/emil/Downloads/chromedriver2");
        Instance = new ChromeDriver();
        Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public static void close() {
        Driver.Instance.close();
    }

    public static void Wait(int timeInSeconds) {
        try {
            Thread.sleep(timeInSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
