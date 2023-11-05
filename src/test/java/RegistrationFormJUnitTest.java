import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationFormJUnitTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 6000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
    }


    @Test
    void registrationForm() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Din");
        $("#lastName").setValue("Dinov");
        $("#userEmail").setValue("DinDinov@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8777987654");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1997");
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue("Physics").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("CssNEO.jpg");
        $("#currentAddress").setValue("Challenger Ionia");
        $("#state").click();
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#city").click();
        $("#react-select-4-input").setValue("Noida").pressEnter();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Din Dinov"));
        $(".table-responsive").shouldHave(text("DinDinov@gmail.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("8777987654"));
        $(".table-responsive").shouldHave(text("04 July,1997"));
        $(".table-responsive").shouldHave(text("Physics, Maths"));
        $(".table-responsive").shouldHave(text("Sports, Music"));
        $(".table-responsive").shouldHave(text("CssNEO.jpg"));
        $(".table-responsive").shouldHave(text("Challenger Ionia"));
        $(".table-responsive").shouldHave(text("NCR Noida"));
















    }
}