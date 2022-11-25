package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperExperienceSetupPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperInitialPageBase extends AbstractPage {
    public GrasshopperInitialPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperExperienceSetupPageBase clickSignInWithoutAccount();
}
