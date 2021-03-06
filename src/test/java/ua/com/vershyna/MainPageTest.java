package ua.com.vershyna;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    private String saleLinkText = "Распродажа";
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
    private String productBlockRecommendedTitleText = "Рекомендуемые";
    private int intEight = 8;
    private int intSeven = 7;
    private int intSix = 6;
    private int intFour = 4;
    private int intThree = 3;
    private String productBlockImagesXpathLocator = "div/div[@class='image']";
    private String productBlockImagesLinksXpathLocator = "div/div[@class='image']/a";
    private String productBlockImagesLocationXpathLocator = "div/div[@class='image']/a/img";
    private String productBlockNamesXpathLocator = "div/div[@class='name']";
    private String productBlockNamesLinksXpathLocator = "div/div[@class='name']/a";
    private String productBlockProductCodeXpathLocator = "div/div[@class='sku']";
    private String productBlockPriceXpathLocator = "div/div[@class='price']";
    private String seaToSummitBigBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "homepage-seat-to-summit-426x256.jpg";
    private String nikwaxBigBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "homepage-nikwax-426x256.jpg";
    private String marmotBigBannerLocation = PageUtils.VESHYNA_BASE_URL + PageUtils.BANNERS_CATALOG_URL + "homepage-marmot-426x256.jpg";
    private String productBlockNewArrivalsTitleText = "Новые поступления";
    private int productBlockNewArrivalsRecommendedQuantity = 4;
    private String productBlocNewsTitleText = "Новости";
    private String newsBlockHeadingsXpathLocator = "div/h3/a";
    private String newsBlockImagesLinksXpathLocator = "div/div[@class='image']/img";
    private String newsBlockDescriptionXpathLocator = "div/div[@class='news-story']";
    private String showMoreButtonText = "Показать больше";
    private String footerBlockOneHeadersXpathLocator = "div/h3";
    private List<String> footerImagesClasses = Arrays.asList("fa fa-comments", "fa fa-info-circle", "fa fa-gift", "fa fa-newspaper-o");
    private String footerBlockOneHeadersImagesXpathLocator = "div/h3/i";
    private List<String> footerContactsText = Arrays.asList("Пн-Пт с 10:00 до 18:00", "Сб-Вс выходные дни", "099 661-3902", "093 923-3929", "096 363-2239", "info@vershyna.com.ua");
    private String footerBlockOneContactsTextXpathLocator = "div[1]/ul/li";
    private String footerBlockOneInformationXpathLocator = "div[2]/ul/li/a";
    private List<String> footerInformationText = Arrays.asList("Доставка и оплата", "Гарантия", "Возврат", "Контакты");
    private List<String> footerInformationLinks = Arrays.asList(PageUtils.VESHYNA_BASE_URL + "shipping-and-payment",
            PageUtils.VESHYNA_BASE_URL + "garantiya", PageUtils.VESHYNA_BASE_URL + "vozvrat", PageUtils.VESHYNA_BASE_URL + "contacts");
    private List<String> footerProfitablyText = Arrays.asList("Акции", "Распродажа", "Программа лояльности");
    private List<String> footerProfitablyLinks = Arrays.asList(PageUtils.VESHYNA_BASE_URL + "discount",
            PageUtils.VESHYNA_BASE_URL + "rasprodazha", PageUtils.VESHYNA_BASE_URL + "programma-loyalnosti");
    private String footerBlockOneProfitablyXpathLocator = "div[3]/ul/li/a";
    private String footerSalesClass = "sales";

    private List<String> footerStayUpToDateText = Arrays.asList("Новинки", "Новости", "Блог");
    private List<String> footerStayUpToDateLinks = Arrays.asList(PageUtils.VESHYNA_BASE_URL + "novinki",
            PageUtils.VESHYNA_BASE_URL + "news", PageUtils.VESHYNA_BASE_URL + "blog");
    private String footerBlockOneStayUpToDateXpathLocator = "div[4]/ul/li/a";
    private String footerBlockTwoHeadersXpathLocator = "div/span";
    private List<String> footerSocialHeaderText = Arrays.asList("Присоединяйтесь в соцсетях:".toUpperCase(),
            "Читайте и\n".toUpperCase() + "смотрите обзоры".toUpperCase(), "Будьте на связи\n".toUpperCase() + "с нами".toUpperCase());
    private List<String> footerSocialIconsClass = Arrays.asList("vk-b", "fb-b", "gp-b", "ig-b", "bl-b", "yt-b", "sk-b");
    private String footerBlockTwoSocialIconsXpathLocator = "div/a";
    private String targetTagValue = "_blank";
    private String vkLinkVershyna = "http://vk.com/vershyna";
    private String fbLinkVershyna = "http://www.facebook.com/pages/%D0%92%D0%B5%D1%80%D1%88%D0%B8%D0%BD%D0%B0-%D1%82%D1%83%D1%80%D0%B8%D1%81%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B5-%D1%81%D0%BD%D0%B0%D1%80%D1%8F%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5/191115290987696";
    private String googlePlusLinkVershyna = "https://www.google.com/+VershynaUa";
    private String instagramLinkVershyna = "http://instagram.com/vershynacomua";
    private String blogLinkVershyna = "https://vershyna.com.ua/blog";
    private String youTubeLinkVershyna = "http://www.youtube.com/vershyna";
    private String skypeLinkVershyna = "skype:vershyna-kiev?chat";
    private String copyrightVershynaText = "© 2010-2017 Интернет-магазин \"Вершина\"";
    private String onlineConsultationXpathLocator = "p";
    private String onlineConsultationText = "Напишите нам!";


    private String emptyString = "";
    private String zeroValue = "0";


    @Description("Main page opening.")
    @BeforeClass()
    public void openMainPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
    }

    @Description("Smoke main page test: Header testing.")
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

        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Search field testing.")
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
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Vershyna logo testing.")
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
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Phone numbers testing.")
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
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Phone numbers testing.")
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
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Head menu bar testing.")
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

        Assert.assertEquals(tourismAndCampingLinkText.toUpperCase(), tourismAndCampingLink.getText());
        Assert.assertEquals(clothesLinkText.toUpperCase(), clothesLink.getText());
        Assert.assertEquals(winterSportLinkText.toUpperCase(), winterSportLink.getText());
        Assert.assertEquals(specialEquipmentLinkText.toUpperCase(), specialEquipmentLink.getText());
        Assert.assertEquals(accessoriesLinkText.toUpperCase(), accessoriesLink.getText());
        Assert.assertEquals(brandsLinkText.toUpperCase(), brandsLink.getText());
        Assert.assertEquals(saleLinkText.toUpperCase(), saleLink.getText());
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: Slideshow bar testing.")
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
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: Banners small bar testing.")
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
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: Recommended products block title testing.")
    @Test()
    public void productBlockRecommendedTitleTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement productBlockTitle = mainPage.searchElementByLocator(mainPage.getProductBlockRecommendedTitleByXpath());
        Assert.assertTrue(productBlockTitle.isDisplayed());
        Assert.assertEquals(productBlockRecommendedTitleText.toUpperCase(), productBlockTitle.getText());
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: Recommended products block testing.")
    @Test()
    public void productBlockRecommendedTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> productBlockElements = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                PageUtils.ElementTags.div);
        Assert.assertEquals(intEight, productBlockElements.size());
        Assert.assertTrue(mainPage.elementsVisibility(productBlockElements));

        List<WebElement> productBlockImages = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                productBlockImagesXpathLocator);
        Assert.assertEquals(intEight, productBlockImages.size());
        Assert.assertTrue(mainPage.elementsVisibility(productBlockImages));

        List<WebElement> productBlockImagesLinks = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                productBlockImagesLinksXpathLocator);
        Assert.assertEquals(intEight, productBlockImagesLinks.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockImagesLinks, PageUtils.ElementAttributes.href));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockImagesLinks));

        List<WebElement> productBlockImagesLocation = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                productBlockImagesLocationXpathLocator);
        Assert.assertEquals(intEight, productBlockImagesLocation.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockImagesLocation, PageUtils.ElementAttributes.src));
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockImagesLocation, PageUtils.ElementAttributes.alt));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockImagesLocation));

        List<WebElement> productBlockNames = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                productBlockNamesXpathLocator);
        Assert.assertEquals(intEight, productBlockNames.size());
        Assert.assertTrue(mainPage.elementsVisibility(productBlockNames));

        List<WebElement> productBlockNamesLinks = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                productBlockNamesLinksXpathLocator);
        Assert.assertEquals(intEight, productBlockNamesLinks.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockNamesLinks, PageUtils.ElementAttributes.href));
        Assert.assertTrue(mainPage.elementsContainsText(productBlockNamesLinks));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockNamesLinks));

        List<WebElement> productBlockProductCode = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                productBlockProductCodeXpathLocator);
        Assert.assertEquals(intEight, productBlockProductCode.size());
        Assert.assertTrue(mainPage.elementsContainsText(productBlockProductCode));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockProductCode));

        List<WebElement> productBlockPrice = mainPage.webElementsListCreation(mainPage.getProductBlockRecommendedByXpath(),
                productBlockPriceXpathLocator);
        Assert.assertEquals(intEight, productBlockPrice.size());
        Assert.assertTrue(mainPage.elementsContainsText(productBlockPrice));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockPrice));
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: Banners big bar testing.")
    @Test()
    public void bannersBigBarTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> bannersElements = mainPage.webElementsListCreation(mainPage.getBannersBigBarByXpath(),
                PageUtils.ElementTags.div_a);
        List<String> bannersBigLinks = Arrays.asList(
                PageUtils.VESHYNA_BASE_URL + PageUtils.SEATOSUMMIT,
                PageUtils.VESHYNA_BASE_URL + PageUtils.NIKWAX,
                PageUtils.VESHYNA_BASE_URL + PageUtils.MARMOT);
        Assert.assertEquals(intThree, bannersBigLinks.size());
        Assert.assertTrue(mainPage.stringListCreation(bannersElements, PageUtils.ElementAttributes.href).
                containsAll(mainPage.elementsToLowercase(bannersBigLinks)));

        List<WebElement> bannersElementsAttributes = mainPage.webElementsListCreation(mainPage.getBannersBigBarByXpath(),
                PageUtils.ElementTags.div_a_img);
        Assert.assertEquals(intThree, bannersElementsAttributes.size());
        List<String> bannersLocationsList = Arrays.asList(seaToSummitBigBannerLocation, nikwaxBigBannerLocation,
                marmotBigBannerLocation);
        Assert.assertTrue(mainPage.stringListCreation(bannersElementsAttributes, PageUtils.ElementAttributes.src).
                containsAll(bannersLocationsList));

        List<String> bannersAltAntTitleList = Arrays.asList("Sea To Summit", PageUtils.NIKWAX, PageUtils.MARMOT); // change alt and title
        Assert.assertTrue(mainPage.stringListCreation(bannersElementsAttributes, PageUtils.ElementAttributes.alt).
                containsAll(bannersAltAntTitleList));
        Assert.assertTrue(mainPage.stringListCreation(bannersElementsAttributes, PageUtils.ElementAttributes.title).
                containsAll(bannersAltAntTitleList));
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: New arrivals block title testing.")
    @Test()
    public void productBlockNewArrivalsTitleTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement productBlockTitle = mainPage.searchElementByLocator(mainPage.getProductBlockNewArrivalsTitleByXpath());
        Assert.assertTrue(productBlockTitle.isDisplayed());
        Assert.assertEquals(productBlockNewArrivalsTitleText.toUpperCase(), productBlockTitle.getText());
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: New arrivals product block testing.")
    @Test()
    public void productBlockNewArrivalsTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> productBlockElements = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                PageUtils.ElementTags.div);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockElements.size());
        Assert.assertTrue(mainPage.elementsVisibility(productBlockElements));

        List<WebElement> productBlockImages = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                productBlockImagesXpathLocator);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockImages.size());
        Assert.assertTrue(mainPage.elementsVisibility(productBlockImages));

        List<WebElement> productBlockImagesLinks = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                productBlockImagesLinksXpathLocator);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockImagesLinks.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockImagesLinks, PageUtils.ElementAttributes.href));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockImagesLinks));

        List<WebElement> productBlockImagesLocation = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                productBlockImagesLocationXpathLocator);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockImagesLocation.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockImagesLocation, PageUtils.ElementAttributes.src));
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockImagesLocation, PageUtils.ElementAttributes.alt));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockImagesLocation));

        List<WebElement> productBlockNames = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                productBlockNamesXpathLocator);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockNames.size());
        Assert.assertTrue(mainPage.elementsVisibility(productBlockNames));

        List<WebElement> productBlockNamesLinks = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                productBlockNamesLinksXpathLocator);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockNamesLinks.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(productBlockNamesLinks, PageUtils.ElementAttributes.href));
        Assert.assertTrue(mainPage.elementsContainsText(productBlockNamesLinks));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockNamesLinks));

        List<WebElement> productBlockProductCode = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                productBlockProductCodeXpathLocator);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockProductCode.size());
        Assert.assertTrue(mainPage.elementsContainsText(productBlockProductCode));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockProductCode));

        List<WebElement> productBlockPrice = mainPage.webElementsListCreation(mainPage.getProductBlockNewArrivalsByXpath(),
                productBlockPriceXpathLocator);
        Assert.assertEquals(productBlockNewArrivalsRecommendedQuantity, productBlockPrice.size());
        Assert.assertTrue(mainPage.elementsContainsText(productBlockPrice));
        Assert.assertTrue(mainPage.elementsVisibility(productBlockPrice));
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: News block title testing.")
    @Test()
    public void productBlockNewsTitleTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement productBlockTitle = mainPage.searchElementByLocator(mainPage.getNewsBlockTitleByXpath());
        Assert.assertTrue(productBlockTitle.isDisplayed());
        Assert.assertEquals(productBlocNewsTitleText.toUpperCase(), productBlockTitle.getText());
        // TODO check the elements location on webPage.
    }

    @Description("Smoke main page test: News block testing.")
    @Test()
    public void newsBlockTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        List<WebElement> newsBlockElements = mainPage.webElementsListCreation(mainPage.getNewsBlockByXpath(),
                PageUtils.ElementTags.div);
        Assert.assertEquals(intFour, newsBlockElements.size());
        Assert.assertTrue(mainPage.elementsVisibility(newsBlockElements));

        List<WebElement> newsBlockImages = mainPage.webElementsListCreation(mainPage.getNewsBlockByXpath(),
                productBlockImagesXpathLocator);
        Assert.assertEquals(intFour, newsBlockImages.size());
        Assert.assertTrue(mainPage.elementsVisibility(newsBlockImages));

        List<WebElement> newsBlockImagesLinks = mainPage.webElementsListCreation(mainPage.getNewsBlockByXpath(),
                newsBlockImagesLinksXpathLocator);
        Assert.assertEquals(intFour, newsBlockImagesLinks.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(newsBlockImagesLinks, PageUtils.ElementAttributes.src));
        Assert.assertTrue(mainPage.elementsVisibility(newsBlockImagesLinks));

        List<WebElement> newsHeadings = mainPage.webElementsListCreation(mainPage.getNewsBlockByXpath(),
                newsBlockHeadingsXpathLocator);
        Assert.assertEquals(intFour, newsHeadings.size());
        Assert.assertTrue(mainPage.elementsAttributeIsNotEmpty(newsHeadings, PageUtils.ElementAttributes.href));
        Assert.assertTrue(mainPage.elementsContainsText(newsHeadings));
        Assert.assertTrue(mainPage.elementsVisibility(newsHeadings));

        List<WebElement> newsDescriptions = mainPage.webElementsListCreation(mainPage.getNewsBlockByXpath(),
                newsBlockDescriptionXpathLocator);
        Assert.assertEquals(intFour, newsDescriptions.size());
        Assert.assertTrue(mainPage.elementsContainsText(newsDescriptions));
        Assert.assertTrue(mainPage.elementsVisibility(newsDescriptions));
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Show-more button testing.")
    @Test()
    public void showMoreButtonTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement showMoreButton = mainPage.searchElementByLocator(mainPage.getShowMoreButtonXpathLocator());
        Assert.assertTrue(showMoreButton.isDisplayed());
        Assert.assertEquals(showMoreButtonText, showMoreButton.getText());
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Block 1 footer testing.")
    @Test()
    public void footerBlockOneTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement footerBlockOne = mainPage.searchElementByLocator(mainPage.getFooterBlockOneXpathLocator());
        Assert.assertTrue(footerBlockOne.isDisplayed());

        List<WebElement> footerBlockOneHeaders = mainPage.webElementsListCreation(mainPage.getFooterBlockOneXpathLocator(),
                footerBlockOneHeadersXpathLocator);
        Assert.assertEquals(intFour, footerBlockOneHeaders.size());
        Assert.assertTrue(mainPage.elementsContainsText(footerBlockOneHeaders));
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockOneHeaders));

        List<WebElement> footerBlockOneHeadersImages = mainPage.webElementsListCreation(mainPage.getFooterBlockOneXpathLocator(),
                footerBlockOneHeadersImagesXpathLocator);
        Assert.assertEquals(intFour, footerBlockOneHeadersImages.size());
        Assert.assertTrue(mainPage.stringListCreation(footerBlockOneHeadersImages, PageUtils.ElementAttributes.clas).
                containsAll(footerImagesClasses));
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockOneHeadersImages));

        List<String> footerBlockOneContactsText = mainPage.stringListTextCreation(mainPage.webElementsListCreation(mainPage.getFooterBlockOneXpathLocator(),
                footerBlockOneContactsTextXpathLocator));
        Assert.assertEquals(intSix, footerBlockOneContactsText.size());
        Assert.assertTrue(footerBlockOneContactsText.containsAll(footerContactsText));

        List<WebElement> footerBlockOneContactsElement = mainPage.webElementsListCreation(mainPage.getFooterBlockOneXpathLocator(),
                footerBlockOneContactsTextXpathLocator);
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockOneContactsElement));

        List<WebElement> footerBlockOneInformationElements = mainPage.webElementsListCreation(mainPage.getFooterBlockOneXpathLocator(),
                footerBlockOneInformationXpathLocator);
        Assert.assertEquals(intFour, footerBlockOneInformationElements.size());
        Assert.assertTrue(mainPage.stringListCreation(footerBlockOneInformationElements, PageUtils.ElementAttributes.href).
                containsAll(footerInformationLinks));
        Assert.assertEquals(mainPage.stringListTextCreation(footerBlockOneInformationElements), footerInformationText);
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockOneInformationElements));

        List<WebElement> footerBlockOneProfitablyElements = mainPage.webElementsListCreation(mainPage.getFooterBlockOneXpathLocator(),
                footerBlockOneProfitablyXpathLocator);
        Assert.assertEquals(intThree, footerBlockOneProfitablyElements.size());
        Assert.assertTrue(mainPage.stringListCreation(footerBlockOneProfitablyElements, PageUtils.ElementAttributes.href).
                containsAll(footerProfitablyLinks));
        Assert.assertTrue(mainPage.checkIfAttributeValueIsPresent(footerBlockOneProfitablyElements,
                PageUtils.ElementAttributes.clas, footerSalesClass));
        Assert.assertEquals(mainPage.stringListTextCreation(footerBlockOneProfitablyElements), footerProfitablyText);
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockOneProfitablyElements));

        List<WebElement> footerBlockOneStayUpToDateElements = mainPage.webElementsListCreation(mainPage.getFooterBlockOneXpathLocator(),
                footerBlockOneStayUpToDateXpathLocator);
        Assert.assertEquals(intThree, footerBlockOneStayUpToDateElements.size());
        Assert.assertTrue(mainPage.stringListCreation(footerBlockOneStayUpToDateElements, PageUtils.ElementAttributes.href).
                containsAll(footerStayUpToDateLinks));
        Assert.assertTrue(mainPage.checkIfAttributeValueIsPresent(footerBlockOneStayUpToDateElements,
                PageUtils.ElementAttributes.clas, footerSalesClass));
        Assert.assertEquals(mainPage.stringListTextCreation(footerBlockOneStayUpToDateElements), footerStayUpToDateText);
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockOneStayUpToDateElements));
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Block 2 footer (social) testing.")
    @Test()
    public void footerBlockTwoTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement footerBlockTwo = mainPage.searchElementByLocator(mainPage.getFooterBlockTwoIDLocator());
        Assert.assertTrue(footerBlockTwo.isDisplayed());

        List<WebElement> footerBlockTwoGeneral = mainPage.webElementsListCreation(mainPage.getFooterBlockTwoIDLocator(),
                footerBlockTwoHeadersXpathLocator);
        Assert.assertEquals(intThree, footerBlockTwoGeneral.size());
        Assert.assertTrue(mainPage.stringListTextCreation(footerBlockTwoGeneral).containsAll(footerSocialHeaderText));
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockTwoGeneral));

        List<WebElement> footerBlockTwoSocialIcons = mainPage.webElementsListCreation(mainPage.getFooterBlockTwoIDLocator(),
                footerBlockTwoSocialIconsXpathLocator);
        Assert.assertEquals(intSeven, footerBlockTwoSocialIcons.size());
        Assert.assertTrue(mainPage.stringListCreation(footerBlockTwoSocialIcons, PageUtils.ElementAttributes.clas).
                containsAll(footerSocialIconsClass));
        Assert.assertTrue(mainPage.checkIfAttributeValueIsPresent(footerBlockTwoSocialIcons, PageUtils.ElementAttributes.target,
                targetTagValue));
        List<String> footerSocialIconsLinksList = Arrays.asList(vkLinkVershyna, fbLinkVershyna, googlePlusLinkVershyna,
                instagramLinkVershyna, blogLinkVershyna, youTubeLinkVershyna, skypeLinkVershyna);
        Assert.assertTrue(mainPage.stringListCreation(footerBlockTwoSocialIcons, PageUtils.ElementAttributes.href).containsAll(footerSocialIconsLinksList));
        Assert.assertTrue(mainPage.elementsVisibility(footerBlockTwoSocialIcons));
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Block 3 footer (copyright) testing.")
    @Test()
    public void footerBlockThreeTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        WebElement footerBlockThree = mainPage.searchElementByLocator(mainPage.getCopyrightXpathLocator());
        Assert.assertTrue(footerBlockThree.isDisplayed());
        Assert.assertEquals(copyrightVershynaText, footerBlockThree.getText());
        // TODO check the element location on webPage.
    }

    @Description("Smoke main page test: Online consultation button testing.")
    @Test()
    public void onlineConsultationTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(mainPageTitle, driver.getTitle());

        mainPage.waitForExpectedCondition(driver,
                ExpectedConditions.visibilityOfElementLocated(mainPage.getConsultationButtonXpathLocator()));

        WebElement onlineConsultationButton = mainPage.searchElementByLocator(mainPage.getConsultationButtonXpathLocator());
        Assert.assertTrue(onlineConsultationButton.isDisplayed());

        String buttonText = onlineConsultationButton.findElement(By.xpath(onlineConsultationXpathLocator)).getText();
        Assert.assertEquals(onlineConsultationText, buttonText);

        WebElement onlineConsultationContainer = mainPage.searchElementByLocator(mainPage.getConsultationContainerXpathLocator());
        Assert.assertFalse(onlineConsultationContainer.isDisplayed());
        // TODO check the element location on webPage.
    }

}
