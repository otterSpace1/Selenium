import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddPostTest {

    @Before
    public void initDriver() {
        Driver.initialize();
    }

    @Test
    public void userCanAddPost() {
        LoginPage.GoTo();
        LoginPage.LoginAs("admin").WithPassword("pass").Login();

        NewPostPage.GoTo();
        NewPostPage.AddNewPost().WithTitle("title").WithBody("body").Publish();

        NewPostPage.GoToNewPost();

        Assert.assertEquals(PostPage.Title(), "title");
    }

//    @After
//    public void cleanUp() {
//        Driver.close();
//    }

}
