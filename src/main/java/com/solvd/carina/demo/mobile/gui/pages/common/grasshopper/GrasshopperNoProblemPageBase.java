package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperWhatIsCodePage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperNoProblemPageBase extends AbstractPage {
    public GrasshopperNoProblemPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperWhatIsCodePageBase clickNextBtn ();

    public abstract String getNoExperienceText();
}
