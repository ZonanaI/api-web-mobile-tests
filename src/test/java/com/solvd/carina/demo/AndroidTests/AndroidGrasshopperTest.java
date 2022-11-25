package com.solvd.carina.demo.AndroidTests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.carina.demo.mobile.gui.pages.common.grasshopper.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidGrasshopperTest implements IAbstractTest, IMobileUtils {
    @Test()
    @MethodOwner(owner = "izonana")
    public void testExperienceTexts(){
        String noExperienceText = "No experience";
        String someExperienceText = "Some experience";
        String aLotOfExperienceText = "A lot of experience";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(),GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        Assert.assertEquals(setupPage.getNoExperienceText(),noExperienceText,"Text differs from expected");
        Assert.assertEquals(setupPage.getSomeExperienceText(),someExperienceText,"Text differs from expected");
        Assert.assertEquals(setupPage.getALotOfExperienceText(),aLotOfExperienceText,"Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testNoProblemText(){
        String noProblemText = "Anyone can learn to code. In just 5 minutes or less per day, Grasshopper will teach you how to code from the ground up.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(),GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        Assert.assertEquals(noProblemPage.getNoExperienceText(),noProblemText,"Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testWhatIsCodeText(){
        String whatIsCodeText = "Code is how we communicate with computers. Writing code is like writing a set of instructions that tell a computer what to do.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(),GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        Assert.assertEquals(whatIsCodePage.getWhatIsCodeText(),whatIsCodeText,"Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testWhatIsAProgLangText(){
        String whatIsAProgLangText = "A programming language is used to give computers instructions. There are many types of programming languages, just like there are many spoken languages.\n" +
                "\n" +
                "Grasshopper teaches JavaScript, used by over 70% of professional coders. It can create websites, build phone apps, automate common office tasks, and much more.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(),GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        Assert.assertEquals(whatIsAProgLangPage.getWhatIsAProgLangText(),whatIsAProgLangText,"Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testWhyShouldIText(){
        String whyShouldIText = "Perhaps you have an idea you'd like to make a reality, or are looking to take the next step in your career, or maybe you are just curious. Learning to code can help you open up new paths and opportunities.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(),GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        Assert.assertEquals(whyShouldILearnPage.getWhyShouldILearnText(),whyShouldIText,"Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testWhyDoYouWantText(){
        String developGames = "I want to develop games";
        String changeMyCareer = "I want to change my career";
        String gainSkills = "I want to gain skills for my current job";
        String justCurious = "I'm just curious or I'm not sure yet";
        String buildAnApp = "I want to build an application or website";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(),GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        GrasshopperWhyDoYouWantPageBase whyDoYouWantPage = whyShouldILearnPage.clickNextBtn();
        Assert.assertEquals(whyDoYouWantPage.getDevelopGamesText(),developGames,"Text differs from expected");
        Assert.assertEquals(whyDoYouWantPage.getChangeMyCareerText(),changeMyCareer,"Text differs from expected");
        Assert.assertEquals(whyDoYouWantPage.getGainSkillsText(),gainSkills,"Text differs from expected");
        Assert.assertEquals(whyDoYouWantPage.getJustCuriousText(),justCurious,"Text differs from expected");
        Assert.assertEquals(whyDoYouWantPage.getBuildAnApplicationText(),buildAnApp,"Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testYourPathText() {

        String fundamentals = "Learn about functions, create variables, control code flow, and much more. These fundamentals concepts are taught in JavaScript, a language that can be used to build games, and the skills you’ll learn can be used in many other coding languages.";
        String fundamentalsII = "Learn how to create your own functions, manipulate strings and arrays, and discover new ways to solve familiar problems. In this course, you'll also tackle more advanced concepts like variable scope, callback functions, and recursion. This course begins to give you a deeper knowledge of how programming and game development work.";
        String animations = "Learn how to create, manipulate, and animate shapes. This course uses the D3 library, Scalable Vector Graphics (SVG), and JavaScript. All of these skills can be used to create the visuals within a game.";
        String animationsII = "This course shows you how to create interactive, manipulatable animations. You'll get to create more complex functions and use arrow functions for the first time. These skills will allow you to develop more complex visuals within the games you create.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(), GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        GrasshopperWhyDoYouWantPageBase whyDoYouWantPage = whyShouldILearnPage.clickNextBtn();
        GrasshopperYourPathPageBase yourPathPage = whyDoYouWantPage.nextPage();
        yourPathPage.clickFundamentalsBtn();
        Assert.assertEquals(yourPathPage.getFundamentalsText(), fundamentals, "Text differs from expected");
        yourPathPage.clickFundamentalsBtn();
        yourPathPage.clickFundamentalsIIBtn();
        Assert.assertEquals(yourPathPage.getFundamentalsIIText(), fundamentalsII, "Text differs from expected");
        yourPathPage.clickFundamentalsIIBtn();
        yourPathPage.clickAnimationsBtn();
        Assert.assertEquals(yourPathPage.getAnimationsText(), animations, "Text differs from expected");
        yourPathPage.clickAnimationsBtn();
        yourPathPage.clickAnimationsIIBtn();
        Assert.assertEquals(yourPathPage.getAnimationsIIText(), animationsII, "Text differs from expected");
    }
    @Test()
    @MethodOwner(owner = "izonana")
    public void testByTheWayText() {
        String byTheWayText = "As you complete the courses in your path you’ll earn official certificates, which you can download and share.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(), GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        GrasshopperWhyDoYouWantPageBase whyDoYouWantPage = whyShouldILearnPage.clickNextBtn();
        GrasshopperYourPathPageBase yourPathPage = whyDoYouWantPage.nextPage();
        GrasshopperByTheWayPageBase byTheWayPage = yourPathPage.clickLooksGoodBtn();
        Assert.assertEquals(byTheWayPage.getByTheWayText(), byTheWayText, "Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testLetsStartText() {
        String letsStartText = "In this puzzle, you will draw the French flag with code.";
        String instructionsText = "Use the drawBox() function to add 3 new boxes: blue, white, and red";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(), GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        GrasshopperWhyDoYouWantPageBase whyDoYouWantPage = whyShouldILearnPage.clickNextBtn();
        GrasshopperYourPathPageBase yourPathPage = whyDoYouWantPage.nextPage();
        GrasshopperByTheWayPageBase byTheWayPage = yourPathPage.clickLooksGoodBtn();
        GrasshopperLetsStartPageBase letsStartPage = byTheWayPage.clickStartCodingBtn();
        Assert.assertEquals(letsStartPage.getLetsStartText(), letsStartText, "Text differs from expected");
        Assert.assertEquals(letsStartPage.getInstructionsText(), instructionsText, "Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testFirstExampleText() {
        String yourGoalText = "Your goal is to create something like this.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(), GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        GrasshopperWhyDoYouWantPageBase whyDoYouWantPage = whyShouldILearnPage.clickNextBtn();
        GrasshopperYourPathPageBase yourPathPage = whyDoYouWantPage.nextPage();
        GrasshopperByTheWayPageBase byTheWayPage = yourPathPage.clickLooksGoodBtn();
        GrasshopperLetsStartPageBase letsStartPage = byTheWayPage.clickStartCodingBtn();
        GrasshopperFirstExampleSolutionPageBase firstExampleSolutionPage = letsStartPage.clickNextBtn();
        Assert.assertEquals(firstExampleSolutionPage.getYourGoalText(), yourGoalText, "Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testFirstYourSolutionText() {
        String hereIsText = "Here is your solution so far. We drew some boxes to get you started.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(), GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        GrasshopperWhyDoYouWantPageBase whyDoYouWantPage = whyShouldILearnPage.clickNextBtn();
        GrasshopperYourPathPageBase yourPathPage = whyDoYouWantPage.nextPage();
        GrasshopperByTheWayPageBase byTheWayPage = yourPathPage.clickLooksGoodBtn();
        GrasshopperLetsStartPageBase letsStartPage = byTheWayPage.clickStartCodingBtn();
        GrasshopperFirstExampleSolutionPageBase firstExampleSolutionPage = letsStartPage.clickNextBtn();
        GrasshopperFirstYourSolutionPageBase firstYourSolutionPage = firstExampleSolutionPage.clickNextBtn();
        Assert.assertEquals(firstYourSolutionPage.getHereIsText(), hereIsText, "Text differs from expected");
    }

    @Test()
    @MethodOwner(owner = "izonana")
    public void testFirstYourCodeText() {
        String halfTheCodeText = "Half the code is already here, tap to get started.";
        GrasshopperInitialPageBase initialPage = initPage(getDriver(), GrasshopperInitialPageBase.class);
        GrasshopperExperienceSetupPageBase setupPage = initialPage.clickSignInWithoutAccount();
        GrasshopperNoProblemPageBase noProblemPage = setupPage.clickNoExperienceBtn();
        GrasshopperWhatIsCodePageBase whatIsCodePage = noProblemPage.clickNextBtn();
        GrasshopperWhatIsAProgLangPageBase whatIsAProgLangPage = whatIsCodePage.clickNextBtn();
        GrasshopperWhyShouldILearnPageBase whyShouldILearnPage = whatIsAProgLangPage.clickNextBtn();
        GrasshopperWhyDoYouWantPageBase whyDoYouWantPage = whyShouldILearnPage.clickNextBtn();
        GrasshopperYourPathPageBase yourPathPage = whyDoYouWantPage.nextPage();
        GrasshopperByTheWayPageBase byTheWayPage = yourPathPage.clickLooksGoodBtn();
        GrasshopperLetsStartPageBase letsStartPage = byTheWayPage.clickStartCodingBtn();
        GrasshopperFirstExampleSolutionPageBase firstExampleSolutionPage = letsStartPage.clickNextBtn();
        GrasshopperFirstYourSolutionPageBase firstYourSolutionPage = firstExampleSolutionPage.clickNextBtn();
        GrasshopperFirstYourCodePageBase firstYourCodePage = firstYourSolutionPage.clickStartPuzzleBtn();
        Assert.assertEquals(firstYourCodePage.getHalfTheCodeText(), halfTheCodeText, "Text differs from expected");
    }
}
