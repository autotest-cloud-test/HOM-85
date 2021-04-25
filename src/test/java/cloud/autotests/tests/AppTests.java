package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Searching Autotests")
    void generatedTest() {
        step("Open https://google.com", () -> {
            // todo
        });

        step("Type 'autotests cloud' to search input", () -> {
            // todo
        });

        step("Verify, search results have text 'cloud'", () -> {
            // todo
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...' and the page has 'title' tag")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://google.com'", () ->
            open("https://google.com"));

        step("Page title should have text 'Bevor Sie zur Google Suche weitergehen'", () -> {
            String expectedTitle = "Bevor Sie zur Google Suche weitergehen";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...'")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://google.com'", () ->
            open("https://google.com"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}