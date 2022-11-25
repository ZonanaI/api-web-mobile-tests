package com.solvd.carina.demo.mobile.gui.pages.android.grasshopper;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.grasshopper.GrasshopperFirstExampleSolutionPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.grasshopper.GrasshopperLetsStartPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GrasshopperLetsStartPageBase.class)
public class GrasshopperLetsStartPage extends GrasshopperLetsStartPageBase {
    public GrasshopperLetsStartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[26,928][1054,1091]']")
    private ExtendedWebElement nextBtn;


    @FindBy(xpath = "//android.widget.TextView[@bounds='[26,400][1054,552]']")
    private ExtendedWebElement letsStartText;
    @FindBy(xpath = "//android.widget.TextView[@bounds='[65,681][1040,833]']")
    private ExtendedWebElement instructionsText;

    @Override
    public String getLetsStartText() {
        return letsStartText.getText();
    }

    @Override
    public String getInstructionsText() {
        return instructionsText.getText();
    }

    @Override
    public GrasshopperFirstExampleSolutionPageBase clickNextBtn() {
        nextBtn.click();
        return initPage(getDriver(),GrasshopperFirstExampleSolutionPageBase.class);
    }
}
