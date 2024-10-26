import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.applicationcache.model.ApplicationCacheStatusUpdated;

public class selenium {

    public static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
        openBrowser("https://the-internet.herokuapp.com/login");
        manageWindow();
        enterText("tomsmith", "SuperSecretPassword!");
       // cleartext();
        Clicking();
        GettextfromField();
        
       // getWindowId();
        // Thread.sleep(2000);
       // CloseBrowser();
       // quitBrowser();

       /* openBrowser("https://www.google.co.uk/");
        Back(); // the internet
        forward(); // google
        refreshPage();*/

    }

    public static void openBrowser(String url)
    {
        driver.get(url);

    }
    public static void refreshPage()
    {
        driver.navigate().refresh();
    }

    public static void forward()
    {
        driver.navigate().forward();
    }
    public static void Back()
    {
        driver.navigate().back();
    }

    public static void manageWindow()
    {
        driver.manage().window().setSize(new Dimension(430, 932));
        driver.manage().window().maximize();
    }

    public static void getWindowId() //handle
    {
        String handle1 = driver.getWindowHandle();
        System.out.println(handle1);

        driver.switchTo().newWindow(WindowType.TAB);
        String handle2 = driver.getWindowHandle();
        System.out.println(handle2);
    }

    public static void CloseBrowser()
    {
        driver.close();
    }

    public static void quitBrowser()
    {
        driver.quit();
    }
    public static void enterText(String username , String password)
    {
        By usernameLocator = By.id("username");
        By passwordLocator = By.id("password");
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
    }
    public static void Clicking()
        {
            By LoginButton = By.className("radius");
            driver.findElement(LoginButton).click();
        }
    public static void GettextfromField()
    {
        By flashMsg = By.cssSelector("div#flash");
        String msg = driver.findElement(flashMsg).getText();
        System.out.println(msg);
    }

    public static void cleartext()
    {
        By usernameLocator = By.id("username");
        driver.findElement(usernameLocator).clear();
    }
}
