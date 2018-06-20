import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {


    public static WebDriver Instance;

    public static WebDriver getInstance() {
        return Instance;
    }

    public static void setInstance(WebDriver instance) {
        Instance = instance;
    }

    public static void initialize() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\istefanie282\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
        Instance = new FirefoxDriver();
        Instance.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public static void close() {
        Driver.Instance.close();
    }
}
