import helpers.RunnerHelper;
import org.junit.Test;
import pages.ArticlePage;
import pages.HomePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Wiki extends RunnerHelper {
    @Test
    public void Test() {
        String query = "Enda Varley";
        HomePage home = new HomePage(driver);
        ArticlePage ap = home.search(query);

        assertThat("Title should match the expected",
                ap.getTitle(),
                equalTo(query));
    }
}
