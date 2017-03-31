package ua.com.vershyna.core;

import ua.com.vershyna.util.PropertiesCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.lang.invoke.MethodHandles;
import java.net.URL;

public abstract class WebDriverTestBase {
    private final Logger LOG = LogManager.getLogger(MethodHandles.lookup().lookupClass());
    protected WebDriver driver;
    private DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    private final String WEBDRIVER_GECKO = "webdriver.gecko.driver";
    private final String WEBDRIVER_CHROME = "webdriver.chrome.driver";
    private final String BROWSER_PATH = "src//test//resources//browser_drivers//chromedriver.exe";
    private final String GECKODRIVER_PATH_WIN = "geckodriver//geckodriver.exe";
    private final String GECKODRIVER_PATH_UNIX = "geckodriver//geckodriverUnix";
    private final String BROWSER = System.getProperty("selenium.browser");
    private final String OS = System.getProperty("os.name").toLowerCase();

    public String getProperty(String s){
        return PropertiesCache.getInstance().getProperty(s);
    }

    public String getPath(String s) {
        String path = null;
        URL url = WebDriverTestBase.class.getClassLoader().getResource(s);
        if (url != null) {
            path = url.getPath();
        } else {
            LOG.error("Not found resource");
        }
        return path;
    }


    @BeforeSuite
    public void setUp() {
        if (isBrowserForSetUp(BrowserName.CHROME.name(), BROWSER)) {
            System.setProperty(WEBDRIVER_CHROME, BROWSER_PATH);
        } else if (isBrowserForSetUp(BrowserName.FIREFOX.name(), BROWSER)) {
            if (isWindows()) {
                System.setProperty(getProperty(WEBDRIVER_GECKO), getPath(getProperty(GECKODRIVER_PATH_WIN)));
            } else if (isUnix()) {
                System.setProperty(getProperty(WEBDRIVER_GECKO), getPath(getProperty(GECKODRIVER_PATH_UNIX)));
            }
        }
    }

    @BeforeClass
    public void initializeWebDriver() {
        if (isBrowserForSetUp(BrowserName.CHROME.name(), BROWSER)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver();
            desiredCapabilities.setBrowserName(BrowserName.CHROME.name());
        } else if (isBrowserForSetUp(BrowserName.FIREFOX.name(), BROWSER)) {
            driver = new FirefoxDriver();
            desiredCapabilities.setBrowserName(BrowserName.FIREFOX.name());
        }
        driver.manage().window().maximize();
    }

    public boolean isBrowserForSetUp(String browserName, String browserSystemVeriable) {
        return BROWSER == null || browserName.equalsIgnoreCase(browserSystemVeriable) || BROWSER.equalsIgnoreCase("");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    private boolean isWindows() {
        return OS.contains("win");
    }

    private boolean isUnix() {
        return OS.contains("nix") || OS.contains("nux") || OS.contains("aix");
    }
}
