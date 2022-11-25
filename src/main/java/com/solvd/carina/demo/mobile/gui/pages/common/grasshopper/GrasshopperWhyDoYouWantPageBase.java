package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperYourPathPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperWhyDoYouWantPageBase extends AbstractPage {
    public GrasshopperWhyDoYouWantPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void clickToDevelopGamesBtn();
    public abstract GrasshopperYourPathPageBase clickNextBtn();
    public abstract GrasshopperYourPathPageBase nextPage();

    public abstract String getDevelopGamesText();
    public abstract String getChangeMyCareerText();
    public abstract String getGainSkillsText();
    public abstract String getJustCuriousText();
    public abstract String getBuildAnApplicationText();
}
