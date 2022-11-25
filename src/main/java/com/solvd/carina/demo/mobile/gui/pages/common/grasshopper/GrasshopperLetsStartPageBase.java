package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperLetsStartPageBase  extends AbstractPage {
    public GrasshopperLetsStartPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperFirstExampleSolutionPageBase clickNextBtn();
    public abstract String getLetsStartText();
    public abstract String getInstructionsText();
}
