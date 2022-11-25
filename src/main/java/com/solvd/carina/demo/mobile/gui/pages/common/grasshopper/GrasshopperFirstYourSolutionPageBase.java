package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperFirstYourCodePage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperFirstYourSolutionPageBase extends AbstractPage {
    public GrasshopperFirstYourSolutionPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperFirstYourCodePageBase clickStartPuzzleBtn();

    public abstract String getHereIsText();
}
