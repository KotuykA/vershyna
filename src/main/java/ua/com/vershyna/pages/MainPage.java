package ua.com.vershyna.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;
import ua.com.vershyna.util.PageUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kotuyk A
 */

public class MainPage extends AbstractPage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By TECHByXpath = By.xpath(".//*[@id='slideshow0']/div[1]/div/div[4]");

    private By headerTopByXpath = By.xpath(".//*[@id='header']/div/div[@class='header-top']");
    private By logoByXpath = By.xpath(".//*[@id='logo']/a");
    private By searchFieldByID = By.id("filter_keyword");
    private By searchButtonByXpath = By.xpath(".//*[@id='search']/div[@class='button-search']");
    private By phoneFieldByXpath = By.xpath(".//*[@id='header']/div/div[@class='header-middle']/div[@class='header-part']/div/span");
    private By phoneIconClassicByXpath = By.xpath(".//*[@id='header']/div/div[@class='header-middle']/div[@class='header-part']/div/span/i");
    private By phoneIconViberByXpath = By.xpath(".//*[@id='header']/div/div[@class='header-middle']/div[@class='header-part']/div/span/span");
    private By basketByXpath = By.xpath(".//*[@id='header']/div/div[@class='header-middle']/div[@class='header-part header-part-cart']/div/a");
    private By basketResultTotalPriceByID = By.id("cart-total");
    private By basketResultProductQuantityByID = By.id("cart-quantity");
    private By headMenuByXpath = By.xpath(".//*[@id='menu']/div/div/div/ul");
    private By slideshowPicturesByXpath = By.xpath(".//*[@id='slideshow0']/div[@class='owl-stage-outer']/div");
    private By slideshowSwitchersByXpath = By.xpath(".//*[@id='slideshow0']/div[@class='owl-nav']");
    private By slideshowDotsByXpath = By.xpath(".//*[@id='slideshow0']/div[@class='owl-dots']");
    private By slideshowCarouselByXpath = By.xpath(".//*[@id='content']/script");
    private By bannersSmallBarByXpath = By.xpath(".//*[@id='content']/div[@class='block block-banner block-banner-40']/div[@class='banner-body']");





    public By getLogoByXpath() {
        return logoByXpath;
    }

    public By getSearchFieldByID() {
        return searchFieldByID;
    }

    public By getSearchButtonByXpath() {
        return searchButtonByXpath;
    }

    public By getPhoneFieldByXpath() {
        return phoneFieldByXpath;
    }

    public By getPhoneIconClassicByXpath() {
        return phoneIconClassicByXpath;
    }

    public By getPhoneIconViberByXpath() {
        return phoneIconViberByXpath;
    }

    public By getBasketByXpath() {
        return basketByXpath;
    }

    public By getBasketResultTotalPriceByID() {
        return basketResultTotalPriceByID;
    }

    public By getBasketResultProductQuantityByID() {
        return basketResultProductQuantityByID;
    }

    public By getSlideshowPicturesByXpath() {
        return slideshowPicturesByXpath;
    }

    public By getSlideshowSwitchersByXpath() {
        return slideshowSwitchersByXpath;
    }

    public By getSlideshowDotsByXpath() {
        return slideshowDotsByXpath;
    }

    public By getSlideshowCarouselByXpath() {
        return slideshowCarouselByXpath;
    }

    public By getBannersSmallBarByXpath() {
        return bannersSmallBarByXpath;
    }


    @Step("Main page opening")
    public void openMainPage() {
        openPage(PageUtils.VESHYNA_BASE_URL);
    }

    @Step("Creating list of the header Elements")
    public List<WebElement> headerElementsListCreation() {
        WebElement table = searchElementByLocator(headerTopByXpath);
        List<WebElement> allElements = table.findElements(By.tagName("a"));
        return allElements;
    }

    @Step("Creating list of the head menu links")
    public List<WebElement> headMenuElementsListCreation() {
        WebElement headMenuBar = searchElementByLocator(headMenuByXpath);
        List<WebElement> allMenuElements = headMenuBar.findElements(By.xpath("li/div[@class='head']"));
        allMenuElements.add(headMenuBar.findElement(By.xpath("li/a")));
        return allMenuElements;
    }

    @Step("Creating list of the slideshow elements")
    public List<WebElement> slideshowElementsListCreation() {
        WebElement slideshowBar = searchElementByLocator(slideshowPicturesByXpath);
        List<WebElement> allSlideshowElements = slideshowBar.findElements(By.xpath("div[@class='owl-item']"));
        allSlideshowElements.add(slideshowBar.findElement(By.xpath("div[@class='owl-item active']")));
        return allSlideshowElements;
    }

    @Step("Checking if each element of a List contains attribute with certain value ")
    public boolean checkIfAttributeValueIsPresent(List<WebElement> listToCheck, String attribute, String value) {
        for (int i = 0; i < listToCheck.size(); i++) {
            if (!(listToCheck.get(i).getAttribute(attribute).equals(value))) {
                // TODO create a LOG here
                return false;
            }
        }
        return true;
    }

    @Step("Creation List<WebElement> via the xpath and main element locator ")
    public List<WebElement> webElementsListCreation(By mainElementLocator, String xPathLocator) {
        WebElement mainElementToSearchIn = searchElementByLocator(mainElementLocator);
        List<WebElement> elementsList = mainElementToSearchIn.findElements(By.xpath(xPathLocator));
        return elementsList;
    }

    @Step("Creation List<String> via the tagName from List<WebElement>")
    public List<String> stringListCreation(List<WebElement> slideshowElements, String tagName) {
        List<String> elementsList = new ArrayList<>();
        for (int i = 0; i < slideshowElements.size(); i++) {
            String linkDestionation = slideshowElements.get(i).getAttribute(tagName);
            elementsList.add(linkDestionation);
            }
        return elementsList;
    }

}
