import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProfilePage {


    public static boolean IsAt() {
        WebElement h1 = Driver.Instance.findElement(By.tagName("h1"));
        if (h1.getText().equals("Profile")) {
            return true;
        }
        return false;
    }
}
