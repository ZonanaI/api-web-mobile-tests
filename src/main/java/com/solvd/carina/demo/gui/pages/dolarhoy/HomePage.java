package com.solvd.carina.demo.gui.pages.dolarhoy;


import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.gui.components.dolarhoy.FooterMenu;
import com.solvd.carina.demo.gui.components.dolarhoy.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//*[contains(@class,'cont__slide')]")
    private HeaderMenu headerMenu;

    @FindBy(xpath = "//*[contains(@class,'inversiones-list')]")
    private ExtendedWebElement footerMenu;

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }

    public HomePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(footerMenu);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

}
