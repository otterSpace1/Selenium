import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PostPage {


    public static String Title() {

        String title = Driver.Instance.findElement(By.className("entry-title")).getText();
        if (title != null)
            return title;
        return "";

    }
}
