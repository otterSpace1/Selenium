import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListPostPage {

    public static void GoTo(PostType pageType) {

        switch (pageType) {
            case Page:
                Driver.Instance.findElement(By.id("menu-pages")).click();
                Driver.Instance.findElement(By.linkText("All Pages")).click();
                break;
        }
    }

    public static void SelectPost(String title) {
        WebElement postLink = Driver.Instance.findElement(By.linkText(title));
        postLink.click();
    }
}

