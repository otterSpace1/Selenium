import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LeftNavigation {
    public static class Posts {
        public static class AddNew {
            public static void Select() {
                WebElement postMenuButton = Driver.Instance.findElement(By.id("menu-posts"));
                postMenuButton.click();
            }
        }
    }
}
