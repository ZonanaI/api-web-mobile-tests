package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperByTheWayPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperYourPathPageBase extends AbstractPage {
    public GrasshopperYourPathPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickFundamentalsBtn();
    public abstract void clickFundamentalsIIBtn();
    public abstract void clickAnimationsBtn();
    public abstract void clickAnimationsIIBtn();

    public abstract String getFundamentalsText();
    public abstract String getFundamentalsIIText();
    public abstract String getAnimationsText();
    public abstract String getAnimationsIIText();
    public abstract GrasshopperByTheWayPageBase clickLooksGoodBtn();
}
