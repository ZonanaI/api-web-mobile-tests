package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperNoProblemPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperExperienceSetupPageBase  extends AbstractPage {
    public GrasshopperExperienceSetupPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract GrasshopperNoProblemPageBase clickNoExperienceBtn();

    public abstract String getNoExperienceText();
    public abstract String getSomeExperienceText();
    public abstract String getALotOfExperienceText();

}
