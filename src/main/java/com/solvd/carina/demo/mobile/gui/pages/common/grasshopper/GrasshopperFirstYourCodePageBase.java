package com.solvd.carina.demo.mobile.gui.pages.common.grasshopper;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GrasshopperFirstYourCodePageBase extends AbstractPage {
    public GrasshopperFirstYourCodePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract String getHalfTheCodeText();
}
