package ua.com.vershyna;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ua.com.vershyna.core.WebDriverTestBase;
import ua.com.vershyna.pages.MainPage;
import ua.com.vershyna.util.PageUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kotuyk A
 */

public class MainPageTest extends WebDriverTestBase {

    private String mainPageTitle = "Интернет-магазин Вершина: туристическое снаряжение, спортивная одежда, товары для кемпинга и активного отдыха";
    private String storeTitle = "Вершина";

    private String deliveryLinkDestination = PageUtils.VESHYNA_BASE_URL + "shipping-and-payment";
    private String guaranteeLinkDestination = PageUtils.VESHYNA_BASE_URL + "garantiya";
    private String contactsLinkDestination = PageUtils.VESHYNA_BASE_URL + "contacts";
    private String logoLocation = PageUtils.VESHYNA_BASE_URL + "image/catalog/logo.svg";
    private String deliveryLinkText = "Доставка и оплата";
    private String guaranteeLinkText = "Гарантия";
    private String contactsLinkText = " Контакты";
    private String placeholderSearchField = "Поиск";
    private String phoneNumbersText = "044 232-5224 • 093 923-3929 • 096 363-2239";
    private String phoneIconClassicClass = "fa fa-phone";
    private String phoneIconViberClass = "viber";
    private String basketText = "Корзина";
    private String basketLinkDestination = PageUtils.VESHYNA_BASE_URL + "index.php?route=checkout/cart";
    private String basketRelAttribute = "rel";
    private String basketRelAttributeValue = "nofollow";
    private String tourismAndCampingLinkText = "Туризм и кемпинг";
    private String clothesLinkText = "Одежда";
    private String winterSportLinkText = "Зимний спорт";
    private String specialEquipmentLinkText = "Спецснаряжение";
    private String accessoriesLinkText = "Аксессуары";
    private String brandsLinkText = "Бренды";
    private String saleLinkText = "saleLink";
    private List<String> owlNames = Arrays.asList(PageUtils.VESHYNA_BASE_URL + "osprey", PageUtils.VESHYNA_BASE_URL + "exped",
            PageUtils.VESHYNA_BASE_URL + "biolite", PageUtils.VESHYNA_BASE_URL + "kepki-buff");
    private String owlsStyleValue = "width: 1329px;";
    private String bioliteOwlLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "slides1380x400-biolite-1380x400.jpg";
    private String kepkiBuffOwlLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "slides1380x400-buff-1380x400.jpg";
    private String ospreyOwlLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "slides1380x400-osprey-1380x400.jpg";
    private String expedOwlLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "slides1380x400-exped-1380x400.jpg";
    private String bioliteOwlAltValue = "Biolite - заражай, готовь на дровах!";
    private String kepkiBuffOwlAltValue = "Новинка - кепка для бега Buff Run Cap";
    private String ospreyOwlAltValue = "Новинки Osprey с обновленной спинкой AntiGravity!";
    private String expedOwlAltValue = "Exped - швейцарское качество. Коврики, палатки, аксессуары.";
    private String owlPreviousClass = "owl-prev";
    private String owlNextClass = "owl-next";
    private String owlPreviousAttributeClass = "fa fa-chevron-left fa-5x";
    private String owlNextAttributeClass = "fa fa-chevron-right fa-5x";
    private String owlsNavigatorsAttributeXpathLocator = "div/i";
    private String owlDotsClass = "owl-dot";
    private String owlActiveDotClass = "owl-dot active";
    private String owlCarouselType = "text/javascript";
    private String owlCarouselScriptCode = "<!--\n" +
            "$('#slideshow0').owlCarousel({\n" +
            "  items: 1,\n" +
            "  autoplay: true,\n" +
            "  autoplayHoverPause: true,\n" +
            "  loop: true,\n" +
            "  nav: true,\n" +
            "  navText: ['<i class=\"fa fa-chevron-left fa-5x\"></i>', '<i class=\"fa fa-chevron-right fa-5x\"></i>'],\n" +
            "});\n" +
            "-->";

    private String smartwoolSmallBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "mainpage/home-brands-block-smartwool-115x50.png";
    private String ospreySmallBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "mainpage/home-brands-block-osprey-58x50.png";
    private String seaToSummitSmallBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "mainpage/home-brands-block-sts-141x50.png";
    private String nikwaxSmallBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "mainpage/home-brands-block-nikwax-84x50.png";
    private String marmotSmallBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "mainpage/home-brands-block-marmot-115x50.png";
    private String craftSmallBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "mainpage/home-brands-block-craft-98x50.png";
    private String buffSmallBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "mainpage/home-brands-block-buff-51x50.png";

    private String emptyString = "";
    private String zeroValue = "0";


    @Description("Main page opening")
    @BeforeClass()
    public void openMainPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
    }

    @Description("Header testing: ")
    @Test()
    public void headerTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> headerElementsList = mainPage.headerElementsListCreation();

        WebElement deliveryLink = headerElementsList.get(0);
        WebElement guaranteeLink = headerElementsList.get(1);
        WebElement contactsLink = headerElementsList.get(2);

        Assert.assertTrue(deliveryLink.isDisplayed());
        Assert.assertEquals(deliveryLinkDestination, deliveryLink.getAttribute(PageUtils.ElementAttributes.href));
        Assert.assertEquals(deliveryLinkText, deliveryLink.getText());

        Assert.assertTrue(guaranteeLink.isDisplayed());
        Assert.assertEquals(guaranteeLinkDestination, guaranteeLink.getAttribute(PageUtils.ElementAttributes.href));
        Assert.assertEquals(guaranteeLinkText, guaranteeLink.getText());

        Assert.assertTrue(contactsLink.isDisplayed());
        Assert.assertEquals(contactsLinkDestination, contactsLink.getAttribute(PageUtils.ElementAttributes.href));
        Assert.assertEquals(contactsLinkText, contactsLink.getText());

        // TODO check the element location in webPage.
    }

    @Description("Search field testing: ")
    @Test()
    public void searchFieldTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement searchField = mainPage.searchElementByLocator(mainPage.getSearchFieldByID());
        Assert.assertTrue(searchField.isDisplayed());
        Assert.assertEquals(emptyString, searchField.getAttribute(PageUtils.ElementAttributes.value));
        Assert.assertEquals(placeholderSearchField, searchField.getAttribute(PageUtils.ElementAttributes.placeholder));
        WebElement searchButton = mainPage.searchElementByLocator(mainPage.getSearchButtonByXpath());
        Assert.assertTrue(searchButton.isDisplayed());
        // TODO check the element location in webPage.
    }

    @Description("Vershyna logo testing: ")
    @Test()
    public void logoVershynaTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement logoCell = mainPage.searchElementByLocator(mainPage.getLogoByXpath());
        Assert.assertTrue(logoCell.isDisplayed());
        Assert.assertEquals(PageUtils.VESHYNA_BASE_URL, logoCell.getAttribute(PageUtils.ElementAttributes.href));

        WebElement logo = logoCell.findElement(By.tagName(PageUtils.ElementTags.img));
        Assert.assertTrue(logo.isDisplayed());
        Assert.assertEquals(logoLocation, logo.getAttribute(PageUtils.ElementAttributes.src));
        Assert.assertEquals(storeTitle, logo.getAttribute(PageUtils.ElementAttributes.title));
        Assert.assertEquals(storeTitle, logo.getAttribute(PageUtils.ElementAttributes.alt));
        // TODO check the element location in webPage.
    }

    @Description("Phone numbers testing: ")
    @Test()
    public void phoneNumbersTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement phonesLine = mainPage.searchElementByLocator(mainPage.getPhoneFieldByXpath());
        Assert.assertTrue(phonesLine.isDisplayed());
        Assert.assertEquals(phoneNumbersText, phonesLine.getText());

        WebElement phoneIconClassic = mainPage.searchElementByLocator(mainPage.getPhoneIconClassicByXpath());
        Assert.assertTrue(phoneIconClassic.isDisplayed());
        Assert.assertEquals(phoneIconClassicClass, phoneIconClassic.getAttribute(PageUtils.ElementAttributes.clas));

        WebElement phoneIconViber = mainPage.searchElementByLocator(mainPage.getPhoneIconViberByXpath());
        Assert.assertTrue(phoneIconViber.isDisplayed());
        Assert.assertEquals(phoneIconViberClass, phoneIconViber.getAttribute(PageUtils.ElementAttributes.clas));
        // TODO check the element location in webPage.
    }

    @Description("Phone numbers testing: ")
    @Test()
    public void basketTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement basket = mainPage.searchElementByLocator(mainPage.getBasketByXpath());
        Assert.assertTrue(basket.isDisplayed());
        Assert.assertEquals(basketText, basket.getText());
        Assert.assertEquals(basketLinkDestination, basket.getAttribute(PageUtils.ElementAttributes.href));
        Assert.assertEquals(basketRelAttributeValue, basket.getAttribute(basketRelAttribute));

        WebElement basketResultPrice = mainPage.searchElementByLocator(mainPage.getBasketResultTotalPriceByID());
        Assert.assertFalse(basketResultPrice.isDisplayed());
        Assert.assertEquals(emptyString, basketResultPrice.getText());

        WebElement basketProductQuantity = mainPage.searchElementByLocator(mainPage.getBasketResultProductQuantityByID());
        Assert.assertTrue(basketProductQuantity.isDisplayed());
        Assert.assertEquals(zeroValue, basketProductQuantity.getText());
        // TODO check the element location in webPage.
    }

    @Description("Head menu bar testing: ")
    @Test()
    public void menuBarTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> menuElements = mainPage.headMenuElementsListCreation();

        WebElement tourismAndCampingLink = menuElements.get(0);
        WebElement clothesLink = menuElements.get(1);
        WebElement winterSportLink = menuElements.get(2);
        WebElement specialEquipmentLink = menuElements.get(3);
        WebElement accessoriesLink = menuElements.get(4);
        WebElement brandsLink = menuElements.get(5);
        WebElement saleLink = menuElements.get(6);

        Assert.assertTrue(tourismAndCampingLink.isDisplayed());
        Assert.assertTrue(clothesLink.isDisplayed());
        Assert.assertTrue(winterSportLink.isDisplayed());
        Assert.assertTrue(specialEquipmentLink.isDisplayed());
        Assert.assertTrue(accessoriesLink.isDisplayed());
        Assert.assertTrue(brandsLink.isDisplayed());
        Assert.assertTrue(saleLink.isDisplayed());

        Assert.assertEquals(tourismAndCampingLinkText, tourismAndCampingLink.getText());
        Assert.assertEquals(clothesLinkText, clothesLink.getText());
        Assert.assertEquals(winterSportLinkText, winterSportLink.getText());
        Assert.assertEquals(specialEquipmentLinkText, specialEquipmentLink.getText());
        Assert.assertEquals(accessoriesLinkText, accessoriesLink.getText());
        Assert.assertEquals(brandsLinkText, brandsLink.getText());
        Assert.assertEquals(saleLinkText, saleLink.getText());
        // TODO check the elements location in webPage.
    }

    @Description("Slideshow bar testing: ")
    @Test()
    public void slideshowBarTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> slideshowElements = mainPage.slideshowElementsListCreation();
        Assert.assertTrue(mainPage.checkIfAttributeValueIsPresent(slideshowElements, PageUtils.ElementAttributes.style,
                owlsStyleValue));

        List<WebElement> slideshowElementsLinks = mainPage.webElementsListCreation(mainPage.getSlideshowPicturesByXpath(),
                PageUtils.ElementTags.div_a);
        Assert.assertTrue(mainPage.stringListCreation(slideshowElementsLinks, PageUtils.ElementAttributes.href).
                containsAll(owlNames));

        List<WebElement> slideshowElementsImages = mainPage.webElementsListCreation(mainPage.getSlideshowPicturesByXpath(),
                PageUtils.ElementTags.div_a_img);

        List<String> owlLocations = Arrays.asList(bioliteOwlLocation, kepkiBuffOwlLocation, ospreyOwlLocation, expedOwlLocation);
        Assert.assertTrue(mainPage.stringListCreation(slideshowElementsImages, PageUtils.ElementAttributes.src).
                containsAll(owlLocations));

        List<String> owlAltValues = Arrays.asList(bioliteOwlAltValue, kepkiBuffOwlAltValue, ospreyOwlAltValue, expedOwlAltValue);
        Assert.assertTrue(mainPage.stringListCreation(slideshowElementsImages, PageUtils.ElementAttributes.alt).
                containsAll(owlAltValues));

        List<WebElement> slideshowNavigation = mainPage.webElementsListCreation(mainPage.getSlideshowSwitchersByXpath(),
                PageUtils.ElementTags.div);
        List<String> owlSwitchersClasses = Arrays.asList(owlPreviousClass, owlNextClass);
        Assert.assertTrue(mainPage.stringListCreation(slideshowNavigation, PageUtils.ElementAttributes.clas).
                containsAll(owlSwitchersClasses));

        List<WebElement> slideshowNavigationAttributes = mainPage.webElementsListCreation(mainPage.getSlideshowSwitchersByXpath(),
                owlsNavigatorsAttributeXpathLocator);
        List<String> owlSwitchersAttributeClasses = Arrays.asList(owlPreviousAttributeClass, owlNextAttributeClass);
        Assert.assertTrue(mainPage.stringListCreation(slideshowNavigationAttributes, PageUtils.ElementAttributes.clas).
                containsAll(owlSwitchersAttributeClasses));

        List<WebElement> slideshowDots = mainPage.webElementsListCreation(mainPage.getSlideshowDotsByXpath(),
                PageUtils.ElementTags.div);
        List<String> owlDotsClasses = Arrays.asList(owlDotsClass, owlActiveDotClass);
        Assert.assertTrue(mainPage.stringListCreation(slideshowDots, PageUtils.ElementAttributes.clas).
                containsAll(owlDotsClasses));

        WebElement owlScriptElement = mainPage.searchElementByLocator(mainPage.getSlideshowCarouselByXpath());
        Assert.assertEquals(owlCarouselType, owlScriptElement.getAttribute(PageUtils.ElementAttributes.type));
        Assert.assertEquals(owlCarouselScriptCode, owlScriptElement.getAttribute(PageUtils.ElementAttributes.textContent));
        // TODO check the elements location in webPage.
    }

    @Description("Banners small bar testing: ")
    @Test()
    public void bannersSmallBarTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> bannersElements = mainPage.webElementsListCreation(mainPage.getBannersSmallBarByXpath(),
                PageUtils.ElementTags.div_a);
        List<String> bannersSmallLinks = Arrays.asList(
                PageUtils.VESHYNA_BASE_URL + PageUtils.SMARTWOOL,
                PageUtils.VESHYNA_BASE_URL + PageUtils.OSPREY,
                PageUtils.VESHYNA_BASE_URL + PageUtils.SEATOSUMMIT,
                PageUtils.VESHYNA_BASE_URL + PageUtils.NIKWAX,
                PageUtils.VESHYNA_BASE_URL + PageUtils.MARMOT,
                PageUtils.VESHYNA_BASE_URL + PageUtils.CRAFT,
                PageUtils.VESHYNA_BASE_URL + PageUtils.BUFF);
        Assert.assertTrue(mainPage.stringListCreation(bannersElements, PageUtils.ElementAttributes.href).
                containsAll(mainPage.elementsToLowercase(bannersSmallLinks)));

        List<WebElement> bannersElementsAttributes = mainPage.webElementsListCreation(mainPage.getBannersSmallBarByXpath(),
                PageUtils.ElementTags.div_a_img);

        List<String> bannersLocationsList = Arrays.asList(smartwoolSmallBannerLocation, ospreySmallBannerLocation,
                seaToSummitSmallBannerLocation, nikwaxSmallBannerLocation, marmotSmallBannerLocation,
                craftSmallBannerLocation, buffSmallBannerLocation);
        Assert.assertTrue(mainPage.stringListCreation(bannersElementsAttributes, PageUtils.ElementAttributes.src).
                containsAll(bannersLocationsList));

        List<String> bannersAltAntTitleList = Arrays.asList(PageUtils.SMARTWOOL, PageUtils.OSPREY,
                PageUtils.SEA_TO_SUMMIT, PageUtils.NIKWAX, PageUtils.MARMOT,
                PageUtils.CRAFT, PageUtils.BUFF);
        Assert.assertTrue(mainPage.stringListCreation(bannersElementsAttributes, PageUtils.ElementAttributes.alt).
                containsAll(bannersAltAntTitleList));
        Assert.assertTrue(mainPage.stringListCreation(bannersElementsAttributes, PageUtils.ElementAttributes.title).
                containsAll(bannersAltAntTitleList));
        // TODO check the elements location in webPage.
    }
}
