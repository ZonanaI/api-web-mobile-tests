package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperWhyDoYouWantPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperWhyShouldILearnPageBase extends AbstractPage {
    public GrasshopperWhyShouldILearnPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperWhyDoYouWantPageBase clickNextBtn ();

    public abstract String getWhyShouldILearnText();
}
