import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    private WebDriver driver;
    private Action action;
    private WindowHandle windowHandle;

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        this.driver = new EdgeDriver();
        this.action = new Action(this.driver);
        this.windowHandle = new WindowHandle(this.driver);
    }

    @Test
    public void action() {
        this.action.test();
    }

    @Test
    public void windowHandle() {
        this.windowHandle.test();
    }
}
