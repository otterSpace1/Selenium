import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewPostPageCommand {

    private String title;
    private String body;


    public NewPostPageCommand WithTitle(String title) {
        this.title = title;
        return this;
    }

    public NewPostPageCommand WithBody(String body) {
        this.body = body;
        return this;
    }

    public void Publish() {
        WebElement title = Driver.Instance.findElement(By.name("post_title"));
        title.sendKeys(this.title);

//        WebElement body = Driver.Instance.findElement(By.id("tinymce"));
//        body.sendKeys(this.body);
//
//        WebElement publishButton = Driver.Instance.findElement(By.id("publish"));
//        publishButton.click();

        Driver.Instance.switchTo().frame("content_ifr");
        Driver.Instance.switchTo().activeElement().sendKeys(this.body);
        Driver.Instance.switchTo().defaultContent();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Driver.Instance.findElement(By.id("publish")).click();
    }
}
