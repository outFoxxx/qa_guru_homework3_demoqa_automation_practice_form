import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HW3AutomationPracticeFormTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("[class=practice-form-wrapper]").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue("Ilya");
        $("#lastName").setValue("Fin");
        $("#userEmail").setValue("ilya@example.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("1112223344");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1992");
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__day--001").click();
        $("#subjectsInput").setValue("Computer Science").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("37701039.png");
        $("#currentAddress").setValue("Koroleva str, 19-92");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(
                text("Ilya Fin"),
                text("ilya@example.com"),
                text("1112223344"),
                text("1 April,1992"),
                text("Computer Science"),
                text("Music"),
                text("37701039.png"),
                text("Koroleva str, 19-92"),
                text("NCR Delhi")
        );
    }

}