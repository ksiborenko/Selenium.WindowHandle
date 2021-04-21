import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {

    private WebDriver driver;
    private Action action;
    private WindowHandle windowHandle;
    private DragAndDrop dragAndDrop;
    private Links links;

    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        this.driver = new EdgeDriver();
        this.action = new Action(this.driver);
        this.windowHandle = new WindowHandle(this.driver);
        this.dragAndDrop = new DragAndDrop(this.driver);
        this.links = new Links(this.driver);
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

    @Test
    public void links() {
        this.links.test();
    }
}
