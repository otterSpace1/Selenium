import org.openqa.selenium.firefox.FirefoxDriver;

public class WordpressAutomation {

    public void Go () {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\istefanie282\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.navigate().to("http://www.google.com");
    }
}
