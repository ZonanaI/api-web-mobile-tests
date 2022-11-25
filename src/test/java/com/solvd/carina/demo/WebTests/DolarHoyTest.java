package com.solvd.carina.demo.WebTests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.demo.gui.components.dolarhoy.EconomySubMenu;
import com.solvd.carina.demo.gui.components.dolarhoy.HeaderMenu;
import com.solvd.carina.demo.gui.pages.dolarhoy.BCRAPage;
import com.solvd.carina.demo.gui.pages.dolarhoy.EconomyPage;
import com.solvd.carina.demo.gui.pages.dolarhoy.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DolarHoyTest implements IAbstractTest {
    @Test
    public void openTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        String url = homePage.getCurrentUrl();
        Assert.assertTrue(homePage.isPageOpened(),"Home page is not opened");
    }

    @Test
    public void headerLinksTextTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(headerMenu.getEconomyLinkText(),"Economía","Link text differs");
        softAssert.assertEquals(headerMenu.getMarketLinkText(),"Mercado","Link text differs");
        softAssert.assertEquals(headerMenu.getInvestmentLinkText(),"Herramientas de inversión","Link text differs");
        softAssert.assertEquals(headerMenu.getInternationalLinkText(),"Internacional","Link text differs");
        softAssert.assertEquals(headerMenu.getCompaniesLinkText(),"Empresas","Link text differs");
        softAssert.assertEquals(headerMenu.getCryptoLinkText(),"Criptos","Link text differs");
        softAssert.assertAll();
    }

    @Test
    public void economyTitlesTextTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        EconomyPage economyPage = headerMenu.openEconomyPage();
        Assert.assertTrue(economyPage.isPageOpened());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(economyPage.getTitleText(),"Economía","Title text differs");
        softAssert.assertEquals(economyPage.getSubTitleText(),"Economía, Noticias sobre Economía, Último momento Economía",
                "Subtitle text differs");
        softAssert.assertAll();
    }

    @Test
    public void economySubMenuLinkTextTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        EconomySubMenu economySubMenu = headerMenu.getEconomySubMenu();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(economySubMenu.getBcraLinkText(),"BCRA","Link text differs");
        softAssert.assertEquals(economySubMenu.getCampoLinkText(),"Campo","Link text differs");
        softAssert.assertEquals(economySubMenu.getGobiernoLinkText(),"Gobierno","Link text differs");
        softAssert.assertEquals(economySubMenu.getIndecLinkText(),"INDEC","Link text differs");
        softAssert.assertEquals(economySubMenu.getPropiedadesLinkText(),"Propiedades","Link text differs");
        softAssert.assertEquals(economySubMenu.getServiciosLinkText(),"Servicios","Link text differs");
        softAssert.assertAll();
    }

    @Test
    public void bcraTitlesTextTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        BCRAPage bcraPage = headerMenu.openBCRAPage();
        Assert.assertTrue(bcraPage.isPageOpened());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(bcraPage.getTitleText(),"BCRA","Title differs");
        softAssert.assertEquals(bcraPage.getSubTitleText(),"BCRA, Noticias sobre BCRA, Último momento BCRA",
                "Subtitle differs");
        softAssert.assertAll();
    }
}
