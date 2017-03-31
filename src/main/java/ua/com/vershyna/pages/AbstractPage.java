package ua.com.vershyna.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;
import ua.com.vershyna.util.PropertiesCache;

import java.io.File;
import java.util.List;

public abstract class AbstractPage {
    protected WebDriver driver;
    private String value;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open page by URL")
    public void openPage(String url) {
        driver.get(url);
    }

    @Step("Get the absolute path to the file")
    public String getPath(String s) {
        File file = new File(s);
        value = file.getAbsolutePath();
        return value;
    }

    public String getValue(String s) {
        return PropertiesCache.getInstance().getProperty(s);
    }

    public void clickEnter(By locator) {
        WebElement element = searchElementByLocator(locator);
        element.sendKeys(Keys.ENTER);
    }

    @Step("Find the field and full it")
    public void searchAndFillingField(By locator, String text) {
        WebElement textBox = driver.findElement(locator);
        textBox.clear();
        textBox.sendKeys(text);
    }

    @Step("Find the element by locator and return it.")
    public WebElement searchElementByLocator(By locator) {
        return driver.findElement(locator);
    }

    public void click(By byLocator) {
        driver.findElement(byLocator).click();
    }

    public String getCurrentUrl() {
        value = driver.getCurrentUrl();
        return value;
    }

    @Step("Convert every element in the list to lowercase.")
    public List<String> elementsToLowercase(List<String> elementsString) {
        elementsString.replaceAll(String::toLowerCase);
        return elementsString;
    }

}
