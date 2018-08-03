import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewPostPage {

    public static String getTitle() {
        WebElement title = Driver.Instance.findElement(By.id("title"));
        if (title != null) {
            return title.getAttribute("value");
        }
        return "";
    }

    public static void GoTo() {
        LeftNavigation.Posts.AddNew.Select();
        WebElement postMenuButton = Driver.Instance.findElement(By.id("menu-posts"));
        postMenuButton.click();
    }

    public static NewPostPageCommand AddNewPost() {
        WebElement postButton = Driver.Instance.findElement(By.className("page-title-action"));
        postButton.click();

        WebElement addNewButton = Driver.Instance.findElement(By.linkText("Add New"));
        addNewButton.click();
        return new NewPostPageCommand();
    }

    public static void GoToNewPost() {
        Driver.Instance.findElement(By.linkText("View post")).click();
    }

    public static boolean IsInEditMode() {
        return Driver.Instance.findElement(By.className("wp-heading-inline")) != null;
    }
}
