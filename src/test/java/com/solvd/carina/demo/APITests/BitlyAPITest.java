package com.solvd.carina.demo.APITests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.solvd.carina.demo.api.bitly.methods.DeleteLinkMethod;
import com.solvd.carina.demo.api.bitly.methods.GetLinkMethod;
import com.solvd.carina.demo.api.bitly.methods.PostLinkMethod;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BitlyAPITest implements IAbstractTest {
    @Test
    public void shortenLinkTest(ITestContext context){
        PostLinkMethod api = new PostLinkMethod();
        api.setProperties("api/users/user.properties");
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        String linkID = api.callAPI().peek().then().extract().path("id");
        context.setAttribute("linkID",linkID);
        api.validateResponseAgainstSchema("api/users/bitly/_post/rs.schema");
    }

    @Test(dataProvider = "getLinkID", dependsOnMethods = "shortenLinkTest")
    public void getLinkTest(String linkID){
        GetLinkMethod api = new GetLinkMethod();
        api.setMethodPath(api.getMethodPath().concat(linkID));
        api.callAPI();
        api.validateResponseAgainstSchema("api/users/bitly/_get/rs.schema");
    }

    @Test(dataProvider = "getLinkID", dependsOnMethods = "getLinkTest")
    public void deleteLinkTest(String linkID){
        DeleteLinkMethod api = new DeleteLinkMethod();
        api.setMethodPath(api.getMethodPath().concat(linkID));
        api.callAPI();
        api.validateResponseAgainstSchema("api/users/bitly/_delete/rs.schema");
    }

    @DataProvider (name = "getLinkID")
    public Object[][] getLinkID(ITestContext context){
        return new Object[][]{
                {context.getAttribute("linkID")}
        };
    }
}
