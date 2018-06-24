import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginCommand {

    private String userName;
    private String pass;


    public LoginCommand(String userName) {
        this.userName = userName;
    }

    public LoginCommand WithPassword(String pass) {
        this.pass = pass;
        return this;
    }

    public void Login() {
        WebElement loginInput = Driver.Instance.findElement(By.id("user_login"));
        loginInput.click();
        loginInput.sendKeys(userName);

        WebElement passInput = Driver.Instance.findElement(By.id("user_pass"));
        passInput.clear();
        passInput.sendKeys(pass);

        WebElement loginButton = Driver.Instance.findElement(By.id("wp-submit"));
        loginButton.click();
    }
}
