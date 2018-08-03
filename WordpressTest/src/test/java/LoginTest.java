import org.junit.*;

public class LoginTest extends WordpressTest {

    @Test
    public void adminUserCanLogIn() {
        Assert.assertTrue(DashBoardPage.IsAt());
    }

}
