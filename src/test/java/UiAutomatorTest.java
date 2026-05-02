import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

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
        uiObjects.buttonChange.isDisplayed();
        uiObjects.buttonChange.click();
        uiObjects.textToBeChanged.isDisplayed();
        String text = uiObjects.textToBeChanged.getText();
        Assertions.assertEquals("Hello UiAutomator!", text);
    }

    @Test
    public void testOpenNewActivity() {
        String inputText = "Hello Appium";
        uiObjects.userInput.isDisplayed();
        uiObjects.userInput.sendKeys(inputText);
        uiObjects.buttonActivity.isDisplayed();
        uiObjects.buttonActivity.click();
        WebElement textElement = uiObjects.getText();
        textElement.isDisplayed();
        String result = textElement.getText();
        Assertions.assertEquals(inputText, result);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}