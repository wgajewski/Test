package Vodafon.Storefront.Utils;


import Vodafon.PageObject;
import Vodafon.Storefront.Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static Vodafon.Storefront.Utils.WebUtils.timestamp;

public class NavigationHelper extends PageObject {
    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    Actions builder = new Actions(driver);

    private String StoreFront37 = "https://37.59.19.116:9002/vodafonestorefront/b2ctelco/en#";
    private String StoreFront10 = "https://10.10.200.10 :9002/storefront";
    private String StoreFrontLocal = "https://localhost:9002/storefront";

    @FindBy(xpath = "//*[@id=\"ajax\"]/div/div/form/fieldset/div[1]/div/label/input")
    private WebElement SearchText;

    @FindBy(xpath = " //*[@id=\"ajax\"]/div/div/form/fieldset/div[1]/div/button")
    private WebElement SearchButton;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[1]/div/ul/li/a")
    private WebElement RetentionCategory;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/span/a")
    private WebElement RedHeader;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[1]/a")
    private WebElement UjRedCsomagokheader;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[2]/a")
    private WebElement Ajánlatokheader;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[2]/div/ul/li[1]/a")
    private WebElement RedEUtarifák;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[2]/div/ul/li[2]/a")
    private WebElement KeszulekekRed;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[3]/a")
    private WebElement SzolgáltatásokHeaderRED;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[3]/div/ul/li[1]/a")
    private WebElement KészülékbiztosításRED;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[3]/div/ul/li[2]/a")
    private WebElement RedEuRoaming;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[3]/div/ul/li[3]/a")
    private WebElement RedMozi;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[4]/a")
    private WebElement RedtörődésHeader;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[4]/div/ul/li[1]/a")
    private WebElement RedSzülinap;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[1]/div/div/ul/li[4]/div/ul/li[2]/a")
    private WebElement Redasszisztens;

    @FindBy(xpath = "//div[@class='header']/div[3]/ul/li[2]/span/a")
    private WebElement KeszulekekMainHeader;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[1]/a")
    private WebElement VodafoneFamilyHeader;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[1]/div/ul/li[1]/a")
    private WebElement FamilyTariffs;                               //<---NO NI CHUJ NIE WIEM.

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[1]/div/ul/li[2]/a")
    private WebElement FamilyCalculator;

    @FindBy(xpath = "//div[@class='header']/div[3]/ul/li[2]/div/div/ul/li[2]/a")
    private WebElement KeszulekekKeszulekekHeader;

    @FindBy(xpath = "//div[@class='header']//a[.='Telefonok']")
    private WebElement Telefonok;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[2]/div/ul/li[2]/a")
    private WebElement Tabletek;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[2]/div/ul/li[3]/a")
    private WebElement Modemek;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[2]/div/ul/li[4]/a")
    private WebElement WifiHotspot;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[3]/a")
    private WebElement TartozékokHeader;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[3]/div/ul/li[1]/a")
    private WebElement Headsetek;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[3]/div/ul/li[2]/a")
    private WebElement Memóriakártyák;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[3]/div/ul/li[3]/a")
    private WebElement Tartók;

    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[3]/div/ul/li[4]/a")
    private WebElement Egyéb;

    //Készülékek -> Kiemelt ajánlatok
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[4]/a")
    private WebElement KiemeltaAjánlatokHeader;

    //Készülékek -> Kiemelt ajánlatok -> Készletkisöprő
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[4]/div/ul/li[1]/a")
    private WebElement Készletkisöprő;

    //Készülékek -> Kiemelt ajánlatok -> iPhone 6s
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[4]/div/ul/li[2]/a")
    private WebElement iPhone6s;

    //Készülékek -> Kiemelt ajánlatok -> SIM kártya 0 Ft-ért
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[2]/div/div/ul/li[4]/div/ul/li[3]/a")
    private WebElement SIMkártya0;

    //Tarifákk
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/span/a")
    private WebElement TarifákkHeader;

    //Tarifákk -> VodafoneFamilyCategory
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[1]/a")
    private WebElement VodafoneFamilyCategory_2;

    //Tarifákk -> VodafoneFamilyCategory -> Gyerekeknekésfiataloknak
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[1]/div/ul/li[1]/a")
    private WebElement Gyerekeknekésfiataloknak;

    //Tarifákk -> VodafoneFamilyCategory -> DigitálisCsalád
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[1]/div/ul/li[2]/a")
    private WebElement DigitálisCsalád;

    //Tarifákk -> Mobiltelefon
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[2]/a")
    private WebElement MobiltelefonHeader;

    //Tarifákk -> Mobiltelefon - Red
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[2]/div/ul/li[1]/a")
    private WebElement Red;

    //Tarifákk -> Mobiltelefon - Vodafone You
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[2]/div/ul/li[2]/a")
    private WebElement VodafoneYou;

    //Tarifákk -> Mobiltelefon - Elofizeteses
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[2]/div/ul/li[3]/a")
    private WebElement Elofizeteses;

    //Tarifákk -> Mobiltelefon - Feltoltokartyas
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[2]/div/ul/li[4]/a")
    private WebElement Feltoltokartyas;

    //Tarifákk -> Mobiltelefon - Flotta
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[2]/div/ul/li[5]/a")
    private WebElement Flotta;

    //Tarifákk -> Mobiltelefon - Elfogyott az adatod?
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[2]/div/ul/li[6]/a")
    private WebElement Elfogyottazadatod;

    //Tarifákk -> Internet
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[3]/a")
    private WebElement InternetHeader;

    //Tarifákk -> Internet -> Internettablettel
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[3]/div/ul/li[1]/a")
    private WebElement Internettablettel;

    //Tarifákk -> Internet -> Internethordozhatómodemmel
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[3]/div/ul/li[2]/a")
    private WebElement Internethordozhatómodemmel;

    //Tarifákk -> Internet -> Internet otthonra
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[3]/div/ul/li[3]/a")
    private WebElement Internetotthonra;

    //Tarifákk -> Internet -> Feltöltőkártyás internet
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[3]/div/ul/li[4]/a")
    private WebElement Feltöltőkártyásinternet;

    //Tarifákk -> Internet -> Még több adatot szeretnél?
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[3]/div/ul/li[5]/a")
    private WebElement Mégtöbbadatotszeretnél;

    //Tarifákk -> Szolgáltatások
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[4]/a")
    private WebElement SzolgáltatásokHeaderTarifak;

    //Tarifákk -> Szolgáltatások -> Készülékbiztosítás
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[4]/div/ul/li[1]/a")
    private WebElement KészülékbiztosításTarifak;

    //Tarifákk -> Szolgáltatások -> KülföldönRoaming
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[4]/div/ul/li[2]/a")
    private WebElement KülföldönRoaming;

    //Tarifákk -> Szolgáltatások -> Netinfo
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[4]/div/ul/li[3]/a")
    private WebElement Netinfo;

    //Tarifákk -> Szolgáltatások -> Mobilvásárlás
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[4]/div/ul/li[4]/a")
    private WebElement Mobilvásárlás;

    //Tarifákk -> Szolgáltatások -> Tarifakiegészitők
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[4]/div/ul/li[5]/a")
    private WebElement Tarifakiegészitők;

    //Tarifákk -> Hálózat
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[5]/a")
    private WebElement HálózatHeader;

    //Tarifákk -> Hálózat -> Lefedettségéssebesség
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[3]/div/div/ul/li[5]/div/ul/li/a")
    private WebElement Lefedettségéssebesség;

    //Segíthetünk
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/span")
    private WebElement SegíthetünkHeader;

    //Segíthetünk -> Onlineügyintézés
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[2]/a")
    private WebElement OnlineügyintézésHeader;

    //Segíthetünk -> Onlineügyintézés -> SIMkártyaésNetjegyaktiválása
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[2]/div/ul/li[1]/a")
    private WebElement SIMkártyaésNetjegyaktiválása;

    //Segíthetünk -> Onlineügyintézés -> Üzletésszervizkereső
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[2]/div/ul/li[2]/a")
    private WebElement Üzletésszervizkereső;

    //Segíthetünk -> Onlineügyintézés -> Tudakozó
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[2]/div/ul/li[3]/a")
    private WebElement Tudakozó;

    //Segíthetünk -> Onlineügyintézés -> Összesonlineszolgáltatás
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[2]/div/ul/li[4]/a")
    private WebElement Összesonlineszolgáltatás;

    //Segíthetünk -> Számlázásésfizetés
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[3]/a")
    private WebElement SzámlázásésfizetésHeader;

    //Segíthetünk -> Számlázásésfizetés -> Számlasúgó
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[3]/div/ul/li[1]/a")
    private WebElement Számlasúgó;

    //Segíthetünk -> Számlázásésfizetés -> E-számla
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[3]/div/ul/li[2]/a")
    private WebElement Eszámla;

    //Segíthetünk -> Számlázásésfizetés -> ePack
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[3]/div/ul/li[3]/a")
    private WebElement EPack;

    //Segíthetünk -> Számlázásésfizetés -> Fizetésimódok
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[3]/div/ul/li[4]/a")
    private WebElement Fizetésimódok;

    //Segíthetünk -> Számlázásésfizetés -> Számlabefizetés
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[3]/div/ul/li[5]/a")
    private WebElement Számlabefizetés;

    //Segíthetünk -> Számlázásésfizetés -> Egyenlegfeltöltés
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[3]/div/ul/li[6]/a")
    private WebElement Egyenlegfeltöltés;

    //Segíthetünk -> Készülékek
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/a")
    private WebElement KészülékekHeader;

    //Segíthetünk -> Készülékek -> Készülékbeállításiútmutató
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[1]/a")
    private WebElement Készülékbeállításiútmutató;

    //Segíthetünk -> Készülékek -> Videós útmutatók
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[2]/a")
    private WebElement Videósútmutatók;

    //Segíthetünk -> Készülékek -> Távbeállítás
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[3]/a")
    private WebElement Távbeállítás;

    //Segíthetünk -> Készülékek -> Szervizfigyelő
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[4]/a")
    private WebElement Szervizfigyelő;

    //Segíthetünk -> Készülékek -> Készülék árlisták
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[5]/a")
    private WebElement Készülékárlisták;

    //Segíthetünk -> Készülékek -> Okosoldal
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[6]/a")
    private WebElement Okosoldal;

    //Segíthetünk -> Készülékek -> Készülékjavítás
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[7]/a")
    private WebElement Készülékjavítás;

    //Segíthetünk -> Készülékek -> Kárrendezés
    @FindBy(xpath = "/html/body/div[10]/vf-header/header/div/div[3]/ul/li[4]/div/div/ul/li[4]/div/ul/li[8]/a")
    private WebElement Kárrendezés;

    //Segíthetünk? -> Számlázásésfizetés ---------------------------

    public MainPage GoToKészülékbeállításiútmutató () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Készülékbeállításiútmutató.click();
        return new MainPage(driver);
    }

    public  MainPage GoToVideósútmutatók () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Videósútmutatók.click();
        return new MainPage(driver);
    }

    public  MainPage GoToTávbeállítás () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Távbeállítás.click();
        return new MainPage(driver);
    }

    public  MainPage GoToSzervizfigyelő () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Szervizfigyelő.click();
        return new MainPage(driver);
    }

    public  MainPage GoToKészülékárlisták () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Készülékárlisták.click();
        return new MainPage(driver);
    }

    public  MainPage GoToOkosoldal () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Okosoldal.click();
        return new MainPage(driver);
    }

    public  MainPage GoToKészülékjavítás () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Készülékjavítás.click();
        return new MainPage(driver);
    }

    public  MainPage GoToKárrendezés () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KészülékekHeader).perform();
        Thread.sleep(800);
        Kárrendezés.click();
        return new MainPage(driver);
    }

    //--------------------------------------------------------------

    //Segíthetünk? -> Számlázásésfizetés ----------------------------

    public  MainPage GoToSzámlasúgó () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzámlázásésfizetésHeader).perform();
        Thread.sleep(800);
        Számlasúgó.click();
        return new MainPage(driver);
    }

    public  MainPage GoToEszámla () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzámlázásésfizetésHeader).perform();
        Thread.sleep(800);
        Eszámla.click();
        return new MainPage(driver);
    }

    public  MainPage GoToEPack () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzámlázásésfizetésHeader).perform();
        Thread.sleep(800);
        EPack.click();
        return new MainPage(driver);
    }

    public  MainPage GoToFizetésimódok () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzámlázásésfizetésHeader).perform();
        Thread.sleep(800);
        Fizetésimódok.click();
        return new MainPage(driver);
    }

    public  MainPage GoToSzámlabefizetés () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzámlázásésfizetésHeader).perform();
        Thread.sleep(800);
        Számlabefizetés.click();
        return new MainPage(driver);
    }

    public  MainPage GoToEgyenlegfeltöltés () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzámlázásésfizetésHeader).perform();
        Thread.sleep(800);
        Egyenlegfeltöltés.click();
        return new MainPage(driver);
    }

    //--------------------------------------------------------------

    //Segíthetünk? -> Online ügyintézés ----------------------------

    public  MainPage GoToSIMkártyaésNetjegyaktiválása () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(OnlineügyintézésHeader).perform();
        Thread.sleep(800);
        SIMkártyaésNetjegyaktiválása.click();
        return new MainPage(driver);
    }

    public  MainPage GoToÜzletésszervizkereső () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(OnlineügyintézésHeader).perform();
        Thread.sleep(800);
        Üzletésszervizkereső.click();
        return new MainPage(driver);
    }

    public  MainPage GoToTudakozó () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(OnlineügyintézésHeader).perform();
        Thread.sleep(800);
        Tudakozó.click();
        return new MainPage(driver);
    }

    public  MainPage GoToÖsszesonlineszolgáltatás () throws Exception {
        builder.moveToElement(SegíthetünkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(OnlineügyintézésHeader).perform();
        Thread.sleep(800);
        Összesonlineszolgáltatás.click();
        return new MainPage(driver);
    }
    //-------------------------------------------------------------

    //Tarifákk -> Hálózat--------------------------------------------

    public  MainPage GoToLefedettségéssebesség () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(HálózatHeader).perform();
        Thread.sleep(800);
        Lefedettségéssebesség.click();
        return new MainPage(driver);
    }

    //-----------------------------------------------------------------

    //Tarifákk -> Segíthetünk--------------------------------------------

    public  MainPage GoToKészülékbiztosításTarifak () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderTarifak).perform();
        Thread.sleep(800);
        KészülékbiztosításTarifak.click();
        return new MainPage(driver);
    }

    public  MainPage GoToKülföldönRoaming () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderTarifak).perform();
        Thread.sleep(800);
        KülföldönRoaming.click();
        return new MainPage(driver);
    }

    public  MainPage GoToNetinfo () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderTarifak).perform();
        Thread.sleep(800);
        Netinfo.click();
        return new MainPage(driver);
    }

    public  MainPage GoToMobilvásárlás () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderTarifak).perform();
        Thread.sleep(800);
        Mobilvásárlás.click();
        return new MainPage(driver);
    }

    public  MainPage GoToTarifakiegészitők () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderTarifak).perform();
        Thread.sleep(800);
        Tarifakiegészitők.click();
        return new MainPage(driver);
    }
   // ---------------------------------------------------------------------

    //Tarifákk -> Internet-----------------------------------------------

    public  MainPage GoToInternettablettel () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(InternetHeader).perform();
        Thread.sleep(800);
        Internettablettel.click();
        return new MainPage(driver);
    }

    public  MainPage GoToInternethordozhatómodemmel () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(InternetHeader).perform();
        Thread.sleep(800);
        Internethordozhatómodemmel.click();
        return new MainPage(driver);
    }

    public  MainPage GoToInternetotthonra () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(InternetHeader).perform();
        Thread.sleep(800);
        Internetotthonra.click();
        return new MainPage(driver);
    }

    public  MainPage GoToFeltöltőkártyásinternet () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(InternetHeader).perform();
        Thread.sleep(800);
        Feltöltőkártyásinternet.click();
        return new MainPage(driver);
    }

    public  MainPage GoToMégtöbbadatotszeretnél () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(InternetHeader).perform();
        Thread.sleep(800);
        Mégtöbbadatotszeretnél.click();
        return new MainPage(driver);
    }
    //---------------------------------------------------------------------

    //Tarifákk -> Mobiltelefon-----------------------------------------------

    public  MainPage GoToRed () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(MobiltelefonHeader).perform();
        Thread.sleep(800);
        Red.click();
        return new MainPage(driver);
    }

    public  MainPage GoToVodafoneYou () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(MobiltelefonHeader).perform();
        Thread.sleep(800);
        VodafoneYou.click();
        return new MainPage(driver);
    }

    public  MainPage GoToElofizeteses () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(MobiltelefonHeader).perform();
        Thread.sleep(800);
        Elofizeteses.click();
        return new MainPage(driver);
    }

    public  MainPage Feltoltokartyas () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(MobiltelefonHeader).perform();
        Thread.sleep(800);
        Feltoltokartyas.click();
        return new MainPage(driver);
    }

    public  MainPage Flotta () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(MobiltelefonHeader).perform();
        Thread.sleep(800);
        Flotta.click();
        return new MainPage(driver);
    }

    public  MainPage Elfogyottazadatod () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(MobiltelefonHeader).perform();
        Thread.sleep(800);
        Elfogyottazadatod.click();
        return new MainPage(driver);
    }
    //------------------------------------------------------------------------

    //Tarifákk -> VodafoneFamilyCategory-------------------------------------

    public  MainPage GoToGyerekeknekésfiataloknak () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(VodafoneFamilyCategory_2).perform();
        Thread.sleep(800);
        Gyerekeknekésfiataloknak.click();
        return new MainPage(driver);
    }

    public  MainPage GoToDigitálisCsalád () throws Exception {
        builder.moveToElement(TarifákkHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(VodafoneFamilyCategory_2).perform();
        Thread.sleep(800);
        DigitálisCsalád.click();
        return new MainPage(driver);
    }
    //-------------------------------------------------------------------------

    //Készülékek -> Kiemelt ajánlatok---------------------------------------

    public  MainPage SIMkártya0 () throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KiemeltaAjánlatokHeader).perform();
        Thread.sleep(800);
        SIMkártya0.click();
        return new MainPage(driver);
    }

    public  MainPage GoToiPhone6s () throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KiemeltaAjánlatokHeader).perform();
        Thread.sleep(800);
        iPhone6s.click();
        return new MainPage(driver);
    }

    public  MainPage GoToKészletkisöprő () throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KiemeltaAjánlatokHeader).perform();
        Thread.sleep(800);
        Készletkisöprő.click();
        return new MainPage(driver);
    }

    //----------------------------------------------------------------------------

    public  MainPage GoToEgyéb() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(TartozékokHeader).perform();
        Thread.sleep(800);
        Egyéb.click();
        return new MainPage(driver);
    }


    public  MainPage GoToTartók() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(TartozékokHeader).perform();
        Thread.sleep(800);
        Tartók.click();
        return new MainPage(driver);
    }

    public  MainPage GoToMemóriakártyák() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(TartozékokHeader).perform();
        Thread.sleep(800);
        Memóriakártyák.click();
        return new MainPage(driver);
    }



    public  MainPage GoToHeadsetek() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(TartozékokHeader).perform();
        Thread.sleep(800);
        Headsetek.click();
        return new MainPage(driver);
    }


    public  MainPage GoToWiFiHotspot() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KeszulekekKeszulekekHeader).perform();
        Thread.sleep(800);
        WifiHotspot.click();
        return new MainPage(driver);
    }

    public  MainPage GoToModemek() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KeszulekekKeszulekekHeader).perform();
        Thread.sleep(800);
        Modemek.click();
        return new MainPage(driver);
    }

    public  MainPage GoToTabletek() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(KeszulekekKeszulekekHeader).perform();
        Thread.sleep(800);
        Tabletek.click();
        return new MainPage(driver);
    }


    public  MainPage GoToTelefonok() throws Exception {


        List<WebElement> AmountOfMobiles1 = driver.findElements(By.className("filter-button"));


        if (AmountOfMobiles1.isEmpty()) {
            builder.moveToElement(KeszulekekMainHeader).perform();
            Thread.sleep(700);
            builder.moveToElement(KeszulekekKeszulekekHeader).perform();
            Thread.sleep(800);
            Telefonok.click();
            Thread.sleep(2000);


        }

        List<WebElement> AmountOfMobiles2 = driver.findElements(By.className("filter-button"));
        if (AmountOfMobiles2.isEmpty()) {
            System.out.println("Redirection to MobileList failed. Screenshot saved in ./target/screenshots/" + timestamp());
            WebUtils.captureScreen(driver);
            System.exit(1);

        }

        return new MainPage(driver);


    }

    public  MainPage GoToFamilyCalculator() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(VodafoneFamilyHeader).perform();
        Thread.sleep(800);
        FamilyCalculator.click();
        return new MainPage(driver);
    }
    public  MainPage GoToFamilyTariff() throws Exception {
        builder.moveToElement(KeszulekekMainHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(VodafoneFamilyHeader).perform();
        Thread.sleep(800);
        FamilyTariffs.click();
        return new MainPage(driver);
    }


    public  MainPage GoToRedasszisztens() throws Exception{
        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(RedtörődésHeader).perform();
        Thread.sleep(800);
        Redasszisztens.click();
        return new MainPage(driver);
    }
    public  MainPage GoToRedSzulinap() throws Exception{
        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(RedtörődésHeader).perform();
        Thread.sleep(800);
        RedSzülinap.click();
        return new MainPage(driver);
    }

    public MainPage GoToRedMozi() throws Exception {
        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderRED).perform();
        Thread.sleep(800);
         RedMozi.click();
        return new MainPage(driver);
    }

    public MainPage GoToRedEuRoaming() throws Exception {
        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderRED).perform();
        Thread.sleep(700);
        RedEuRoaming.click();
        return new MainPage(driver);
    }

    public MainPage GoToKészülékbiztosítás() throws Exception {
        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(SzolgáltatásokHeaderRED).perform();
        Thread.sleep(700);
        KészülékbiztosításRED.click();
        return new MainPage(driver);
    }

    public MainPage GoToRetention() throws Exception {
        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(UjRedCsomagokheader).perform();
        Thread.sleep(700);
        RetentionCategory.click();
        return new MainPage(driver);
    }

    public MainPage GoToRedEUTarifak() throws Exception {

        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(Ajánlatokheader).perform();
        Thread.sleep(700);
        RedEUtarifák.click();
        return new MainPage(driver);
    }

    public MainPage GoToKeszulekek() throws Exception {
        builder.moveToElement(RedHeader).perform();
        Thread.sleep(700);
        builder.moveToElement(Ajánlatokheader).perform();
        Thread.sleep(700);
        KeszulekekRed.click();
        return new MainPage(driver);
    }

    public MainPage GoToFrontPage37() {
        driver.get(StoreFront37);
        return new MainPage(driver);
    }

    public MainPage GoToFrontPage10() {
        driver.get(StoreFront10);

        return new MainPage(driver);

        }

    public MainPage GoToFrontPageLocal() {
        driver.get(StoreFrontLocal);

        return new MainPage(driver);

    }


}
