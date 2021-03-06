import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    private WebDriver driver;
    private Action action;
    private WindowHandle windowHandle;
    private DragAndDrop dragAndDrop;

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        this.driver = new EdgeDriver();
        this.action = new Action(this.driver);
        this.windowHandle = new WindowHandle(this.driver);
        this.dragAndDrop = new DragAndDrop(this.driver);
    }

    @Test
    public void action() {
        this.action.test();
    }

    @Test
    public void windowHandle() {
        this.windowHandle.test();
        this.windowHandle.hero();
    }

    @Test
    public void dragAndDrop() {
        this.dragAndDrop.test();
    }

    @After
    public void end() {
        this.driver.quit();
    }
}
