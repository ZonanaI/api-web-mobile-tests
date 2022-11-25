package com.solvd.carina.demo.mobile.gui.pages.android.grasshopper;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.carina.demo.mobile.gui.pages.common.grasshopper.GrasshopperWhatIsAProgLangPageBase;
import com.solvd.carina.demo.mobile.gui.pages.common.grasshopper.GrasshopperWhyShouldILearnPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GrasshopperWhatIsAProgLangPageBase.class)
public class GrasshopperWhatIsAProgLangPage extends GrasshopperWhatIsAProgLangPageBase {
    public GrasshopperWhatIsAProgLangPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
    private ExtendedWebElement nextBtn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
    private ExtendedWebElement whatIsAProgLangText;

    @Override
    public String getWhatIsAProgLangText() {
        return whatIsAProgLangText.getText();
    }

    @Override
    public GrasshopperWhyShouldILearnPageBase clickNextBtn() {
        nextBtn.click();
        return initPage(getDriver(),GrasshopperWhyShouldILearnPageBase.class);
    }
}
