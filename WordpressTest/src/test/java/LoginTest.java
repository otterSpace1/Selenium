import org.junit.*;

public class LoginTest {

    @Before
    public void initDriver() {
        Driver.initialize();
    }

    @Test
    public void adminUserCanLogIn(){
        LoginPage.GoTo();
        LoginPage.LoginAs("admin").WithPassword("pass").Login();

        Assert.assertTrue(DashBoardPage.IsAt());
    }

    @After
    public void cleanUp() {
        Driver.close();
    }

}
