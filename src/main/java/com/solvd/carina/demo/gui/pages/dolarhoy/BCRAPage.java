package com.solvd.carina.demo.gui.pages.dolarhoy;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BCRAPage extends AbstractPage {

    private static final String urlEnding = "subseccion/bcra";

    @FindBy(xpath = "//*[contains(@class,'inversiones-list')]")
    private ExtendedWebElement footerMenu;

    @FindBy(xpath = "//*[contains(@class,'titulo_divider')]/h1")
    private ExtendedWebElement subTitle;
    @FindBy(xpath = "//*[contains(@class,'titulo_divider')]/p")
    private ExtendedWebElement title;

    public BCRAPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(footerMenu);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()).concat(urlEnding));
    }

    public String getTitleText(){
        assertElementPresent(title);
        return title.getText();
    }

    public String getSubTitleText(){
        assertElementPresent(subTitle);
        return subTitle.getText();
    }
}
