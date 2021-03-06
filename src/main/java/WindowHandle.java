import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {

    private WebDriver driver;

    public WindowHandle(WebDriver driver) {
        this.driver = driver;
    }

    public void test() {
        this.driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        this.driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = this.driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parent = iterator.next();
        String child = iterator.next();
        this.driver.switchTo().window(child);
        String url = this.driver.findElement(By.xpath("//a[@href='mailto:mentor@rahulshettyacademy.com']")).getText();
        this.driver.close();
        this.driver.switchTo().window(parent);
        this.driver.findElement(By.cssSelector("input[name='username']")).sendKeys(url);
    }

    public void hero() {
        this.driver.get("https://the-internet.herokuapp.com/windows");
        this.driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set<String> windows = this.driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parent = iterator.next();
        String child = iterator.next();
        this.driver.switchTo().window(child);
        System.out.println(this.driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
        this.driver.close();
        this.driver.switchTo().window(parent);
        System.out.println(this.driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
    }
}
