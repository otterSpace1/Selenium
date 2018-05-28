import org.junit.Assert;

public class LoginTest {

    @org.junit.Test
    public void adminUserCanLogIn(){
        LoginPage.GoTo();
        LoginPage.LoginAs("admin").WithPassword("pass").Login();

        Assert.assertTrue(DashBoardPage.IsAt);
    }

}
