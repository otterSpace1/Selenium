import org.assertj.core.api.Assertions;
import org.junit.*;

public class PageTests extends WordpressTest {

    @Test
    public void userCanAddPost() {
        ListPostPage.GoTo(PostType.Page);
        ListPostPage.SelectPost("Sample Page");

        Assertions.assertThat(NewPostPage.IsInEditMode()).isTrue();
        Assertions.assertThat(NewPostPage.getTitle()).isEqualTo("Sample Page");
    }

}
