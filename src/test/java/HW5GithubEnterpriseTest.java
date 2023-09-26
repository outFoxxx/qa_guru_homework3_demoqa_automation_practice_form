import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class HW5GithubEnterpriseTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void checkEnterprisePage() {
        open("/");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $("div.header-menu-wrapper").$(byTagAndText("a", "Enterprise")).click();
        $(byTagAndText("h1", "Build like the best")).shouldBe(visible);
    }
}
