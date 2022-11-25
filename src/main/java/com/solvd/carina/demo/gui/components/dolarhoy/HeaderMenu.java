package com.solvd.carina.demo.gui.components.dolarhoy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.dolarhoy.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenu extends AbstractUIObject {

    @FindBy(xpath = "//img[@alt='Dolarhoy.com']")
    private ExtendedWebElement homeLink;

    @FindBy(linkText = "Economía")
    private ExtendedWebElement economyLink;

    @FindBy(linkText = "Mercado")
    private ExtendedWebElement marketLink;

    @FindBy(linkText = "Herramientas de inversión")
    private ExtendedWebElement investmentToolsLink;

    @FindBy(linkText = "Internacional")
    private ExtendedWebElement internationalLink;

    @FindBy(linkText = "Empresas")
    private ExtendedWebElement companiesLink;

    @FindBy(linkText = "Criptos")
    private ExtendedWebElement cryptoLink;

    @FindBy(xpath = "//*[@class = 'dropdown-list']//*[@title = 'bcra']/parent::*")
    private EconomySubMenu economySubMenu;

    public HeaderMenu (WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage openHomePage() {
        homeLink.click();
        return new HomePage(driver);
    }

    public EconomyPage openEconomyPage() {
        economyLink.click();
        return new EconomyPage(driver);
    }

    public MarketPage openMarketPage() {
        marketLink.click();
        return new MarketPage(driver);
    }

    public InvestmentsToolsPage openInvestmentsToolsPage() {
        investmentToolsLink.click();
        return new InvestmentsToolsPage(driver);
    }

    public InternationalPage openInternationalPage() {
        internationalLink.click();
        return new InternationalPage(driver);
    }

    public CompaniesPage openCompaniesPage() {
        companiesLink.click();
        return new CompaniesPage(driver);
    }

    public CryptoPage openCryptoPage() {
        cryptoLink.click();
        return new CryptoPage(driver);
    }
    public BCRAPage openBCRAPage(){
        economyLink.hover();
        assertElementPresent(economySubMenu.getServiciosLink());
        EconomySubMenu economySubMenu = getEconomySubMenu();
        return economySubMenu.clickBCRALink();
    }
    public String getEconomyLinkText(){
        assertElementPresent(economyLink);
        return economyLink.getText();
    }

    public String getMarketLinkText(){
        assertElementPresent(marketLink);
        return marketLink.getText();
    }

    public String getInvestmentLinkText(){
        assertElementPresent(investmentToolsLink);
        return investmentToolsLink.getText();
    }

    public String getInternationalLinkText(){
        assertElementPresent(internationalLink);
        return internationalLink.getText();
    }

    public String getCompaniesLinkText(){
        assertElementPresent(companiesLink);
        return companiesLink.getText();
    }

    public String getCryptoLinkText(){
        assertElementPresent(cryptoLink);
        return cryptoLink.getText();
    }

    public EconomySubMenu getEconomySubMenu(){
        economyLink.hover();
        assertElementPresent(economySubMenu.getServiciosLink());
        return economySubMenu;
    }
}
