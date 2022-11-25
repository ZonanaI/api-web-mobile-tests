package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperWhatIsAProgLangPageBase extends AbstractPage {
    public GrasshopperWhatIsAProgLangPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperWhyShouldILearnPageBase clickNextBtn();

    public abstract String getWhatIsAProgLangText();
}
