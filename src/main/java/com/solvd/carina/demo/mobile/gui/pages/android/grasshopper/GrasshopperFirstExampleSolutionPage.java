package com.solvd.carina.demo.mobile.gui.pages.android.grasshopper;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.grasshopper.GrasshopperFirstExampleSolutionPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.grasshopper.GrasshopperFirstYourSolutionPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GrasshopperFirstExampleSolutionPageBase.class)
public class GrasshopperFirstExampleSolutionPage extends GrasshopperFirstExampleSolutionPageBase {

    public GrasshopperFirstExampleSolutionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@bounds='[26,1034][1054,1197]']")
    private ExtendedWebElement nextBtn;

    @FindBy(xpath = "//android.widget.TextView[@bounds='[52,1060][1027,1115]']")
    private ExtendedWebElement yourGoalText;

    @Override
    public String getYourGoalText() {
        return yourGoalText.getText();
    }

    @Override
    public GrasshopperFirstYourSolutionPageBase clickNextBtn() {
        nextBtn.click();
        return initPage(getDriver(),GrasshopperFirstYourSolutionPageBase.class);
    }
}
