package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperWhatIsAProgLangPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperWhatIsCodePageBase extends AbstractPage {
    public GrasshopperWhatIsCodePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperWhatIsAProgLangPageBase clickNextBtn();

    public abstract String getWhatIsCodeText();
}
