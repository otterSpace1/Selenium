import org.junit.After;
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

        PostPage.GoTo();
        PostPage.AddNewPost().WithTitle("title").WithBody("body").Publish();
    }

//    @After
//    public void cleanUp() {
//        Driver.close();
//    }

}
