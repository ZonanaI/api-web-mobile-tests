package com.solvd.carina.demo.APITests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.carina.demo.api.bitly.DeleteLinkMethod;
import com.solvd.carina.demo.api.bitly.GetLinkMethod;
import com.solvd.carina.demo.api.bitly.PostLinkMethod;
import org.testng.annotations.Test;

public class BitlyAPITest implements IAbstractTest {
    @Test
    public void shortenLinkTest(){
        PostLinkMethod api = new PostLinkMethod();
        api.setProperties("api/users/user.properties");
        api.callAPI();
        api.validateResponse("api/users/bitly/_post/rs.schema");
    }

    @Test
    public void getLinkTest(){
        GetLinkMethod api = new GetLinkMethod();
        api.callAPI();
        api.validateResponse("api/users/bitly/_get/rs.schema");
    }

    @Test
    public void deleteLinkTest(){
        DeleteLinkMethod api = new DeleteLinkMethod();
        api.callAPI();
        api.validateResponse("api/users/bitly/_delete/rs.schema");
    }
}
