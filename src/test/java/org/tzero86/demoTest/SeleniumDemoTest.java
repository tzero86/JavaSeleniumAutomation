package org.tzero86.demoTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.tzero86.BrowserGetter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class SeleniumDemoTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    public WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openComPageAndCheckTitle() {
        String expectedComTitle = "Example Domain";
        driver.get("http://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
    }

    @Test
    public void openOrgPageAndCheckTitle() {
        String expectedOrgTitle = "Example Domain";
        driver.get("http://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
    }

}
