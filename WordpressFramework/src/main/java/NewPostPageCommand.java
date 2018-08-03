import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

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

        Driver.Instance.switchTo().frame("content_ifr");
        Driver.Instance.switchTo().activeElement().sendKeys(this.body);
        Driver.Instance.switchTo().defaultContent();

        Driver.Wait(1);

        Driver.Instance.findElement(By.id("publish")).click();
    }
}
