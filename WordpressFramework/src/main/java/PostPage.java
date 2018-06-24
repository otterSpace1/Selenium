import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PostPage {


    public static void GoTo() {
        WebElement postMenuButton = Driver.Instance.findElements(By.className("wp-menu-name")).get(1);
        postMenuButton.click();
    }

    public static PostPageCommand AddNewPost() {
        WebElement postButton = Driver.Instance.findElement(By.className("page-title-action"));
        postButton.click();

        WebElement addNewButton = Driver.Instance.findElement(By.linkText("Add New"));
        addNewButton.click();
        return new PostPageCommand();
    }
}
