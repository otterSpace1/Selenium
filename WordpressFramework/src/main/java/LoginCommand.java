public class LoginCommand {

    private String userName;
    private String password;

    public LoginCommand(String userName) {
        this.userName = userName;
    }

    public LoginCommand WithPassword(String pass) {
        this.password = pass;
        return this;
    }

    public void Login() {

    }
}
