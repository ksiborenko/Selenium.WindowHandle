import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {

    private WebDriver driver;

    public Action(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("http://amazon.com");
        Actions action = new Actions(this.driver);
        WebElement element = this.driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']"));
        action.moveToElement(element).perform();
        action.moveToElement(this.driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).
                click().
                keyDown(Keys.SHIFT).
                sendKeys("hello").
                doubleClick().
                perform();
    }
}
