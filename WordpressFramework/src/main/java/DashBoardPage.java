import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashBoardPage {


    public static boolean IsAt() {
        WebElement h1 = Driver.Instance.findElement(By.tagName("h1"));
        if (h1.getText().equals("Dashboard")) {
            return true;
        }
        return false;
    }
}
