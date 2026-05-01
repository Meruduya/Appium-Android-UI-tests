import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UiAutomatorTest {

    private AppiumDriver driver;
    private UiAutomatorObjects uiObjects;

    @BeforeEach
    public void setUp() {
        driver = Config.getDriver();
        uiObjects = new UiAutomatorObjects(driver);
    }

    @Test
    public void testEmptyInput() {
        uiObjects.buttonChange.click();
        String text = uiObjects.textToBeChanged.getText();
        Assertions.assertEquals("Hello UiAutomator!", text);
    }

    @Test
    public void testOpenNewActivity() {
        String inputText = "Hello Appium";
        uiObjects.userInput.sendKeys(inputText);
        uiObjects.buttonActivity.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ru.netology.testing.uiautomator:id/text"))).getText();
        Assertions.assertEquals(inputText, result);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}