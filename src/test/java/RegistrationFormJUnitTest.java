import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationFormJUnitTest {
    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "1920x1080";
        //Configuration.browser = "firefox";
        Configuration.timeout = 6000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
    }


    @Test
    void RegistrationForm() {
        open("/automation-practice-form");
        $("#firstName").setValue("Din");
        $("#lastName").setValue("Dinov");
        $("#userEmail").setValue("DinDinov@gmail.com");
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue("8777987654");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1997");
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue("Physics").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-3']").click();
        // $("[for=uploadPicture]").click();










    }
}