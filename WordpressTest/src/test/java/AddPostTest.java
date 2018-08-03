import org.junit.Assert;
import org.junit.Test;

public class AddPostTest extends WordpressTest {

    @Test
    public void userCanAddPost() {
        NewPostPage.GoTo();
        NewPostPage.AddNewPost().WithTitle("title").WithBody("body").Publish();

        NewPostPage.GoToNewPost();

        Assert.assertEquals("title", PostPage.Title());
    }

}
