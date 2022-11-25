package com.solvd.carina.demo.gui.components.dolarhoy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.carina.demo.gui.pages.dolarhoy.BCRAPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class EconomySubMenu  extends AbstractUIObject {

    @FindBy(xpath = "//*[@class = 'dropdown-list']//*[@title = 'bcra']")
    private ExtendedWebElement bcraLink;

    @FindBy(xpath = "//*[@class = 'dropdown-list']//*[@title = 'campo']")
    private ExtendedWebElement campoLink;

    @FindBy(xpath = "//*[@class = 'dropdown-list']//*[@title = 'gobierno']")
    private ExtendedWebElement gobiernoLink;

    @FindBy(xpath = "//*[@class = 'dropdown-list']//*[@title = 'indec']")
    private ExtendedWebElement indecLink;

    @FindBy(xpath = "//*[@class = 'dropdown-list']//*[@title = 'propiedades']")
    private ExtendedWebElement propiedadesLink;

    @FindBy(xpath = "//*[@class = 'dropdown-list']//*[@title = 'servicios']")
    private ExtendedWebElement serviciosLink;

    public String getBcraLinkText(){
        assertElementPresent(bcraLink);
        return bcraLink.getText();
    }

    public String getCampoLinkText(){
        assertElementPresent(campoLink);
        return campoLink.getText();
    }

    public String getGobiernoLinkText(){
        assertElementPresent(gobiernoLink);
        return gobiernoLink.getText();
    }

    public String getIndecLinkText(){
        assertElementPresent(indecLink);
        return indecLink.getText();
    }

    public String getPropiedadesLinkText(){
        assertElementPresent(propiedadesLink);
        return propiedadesLink.getText();
    }

    public String getServiciosLinkText(){
        assertElementPresent(serviciosLink);
        return serviciosLink.getText();
    }

    public ExtendedWebElement getServiciosLink() {
        return serviciosLink;
    }

    public BCRAPage clickBCRALink(){
        bcraLink.click();
        return new BCRAPage(driver);
    }

    public EconomySubMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}



