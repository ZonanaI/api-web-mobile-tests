package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.carina.demo.mobile.gui.pages.android.grasshopper.GrasshopperLetsStartPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperByTheWayPageBase extends AbstractPage {
    public GrasshopperByTheWayPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getByTheWayText();
    public abstract GrasshopperLetsStartPageBase clickStartCodingBtn();
}
