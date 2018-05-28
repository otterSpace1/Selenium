import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {


    public static void GoTo() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\istefanie282\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();

        driver.navigate().to("http://127.0.0.1/wordpress/wp-login.php?");
    }

    public static LoginCommand LoginAs(String userName) {
        return new LoginCommand(userName);
    }
}
