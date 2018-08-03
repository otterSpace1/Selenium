import org.junit.After;
import org.junit.Before;

public class WordpressTest {

    @Before
    public void initDriver() {
        Driver.initialize();
        LoginPage.GoTo();
        LoginPage.LoginAs("admin").WithPassword("pass").Login();

    }

    @After
    public void cleanUp() {
        Driver.close();
    }

}
