
public class PostPageCommand {

    private String title;
    private String body;

    public PostPageCommand WithTitle(String title) {
        return this;
    }

    public PostPageCommand WithBody(String body) {
        return this;
    }

    public void Publish() {
//        Driver.Instance.findElement()
    }
}
