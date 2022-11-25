package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperFirstExampleSolutionPageBase extends AbstractPage {
    public GrasshopperFirstExampleSolutionPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperFirstYourSolutionPageBase clickNextBtn();

    public abstract String getYourGoalText();
}
