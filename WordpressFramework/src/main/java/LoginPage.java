import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {


    public static void GoTo() {
        Driver.Instance.navigate().to("http://127.0.0.1/wordpress/wp-login.php?");
    }

    public static LoginCommand LoginAs(String userName) {
        return new LoginCommand(userName);
    }
}
