import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class UiAutomatorObjects {

    public WebElement userInput;
    public WebElement buttonChange;
    public WebElement buttonActivity;
    public WebElement textToBeChanged;

    private AppiumDriver driver;

    UiAutomatorObjects(AppiumDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        userInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ru.netology.testing.uiautomator:id/userInput")));
        buttonChange = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ru.netology.testing.uiautomator:id/buttonChange")));
        buttonActivity = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ru.netology.testing.uiautomator:id/buttonActivity")));
        textToBeChanged = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("ru.netology.testing.uiautomator:id/textToBeChanged")));
    }
}
