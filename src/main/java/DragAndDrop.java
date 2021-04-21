import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class DragAndDrop {

    private WebDriver driver;

    public DragAndDrop(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("https://jqueryui.com/droppable/");
        WebElement frame = this.driver.findElement(By.cssSelector(".demo-frame"));
        this.driver.switchTo().frame(frame);
        WebElement drag = this.driver.findElement(By.cssSelector("div[id='draggable']"));
        WebElement drop = this.driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action = new Actions(this.driver);
        action.
                moveToElement(drag).
                clickAndHold().
                moveToElement(drop).
                release().
                perform();
        String color = this.driver.findElement(By.xpath("//div[@id='droppable']")).getCssValue("background-color");
        assertEquals("rgba(255, 250, 144, 1)", color);
    }
}
