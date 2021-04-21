import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class Links {

    private WebDriver driver;

    public Links(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        int linkCount = this.driver.findElements(By.tagName("a")).size();
        assertEquals(27, linkCount);
        WebElement element = this.driver.findElement(By.xpath("//div[@id='gf-BIG']"));
        int footLinkCount = element.findElements(By.tagName("a")).size();
        assertEquals(20, footLinkCount);
    }
}
