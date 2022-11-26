package com.solvd.carina.demo.api.bitly.methods;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;


@Endpoint(url = "${base_url}/v4/bitlinks/", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/bitly/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetLinkMethod extends AbstractApiMethodV2 {
    public GetLinkMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        String authorization = String.format("Authorization= Bearer %s",Configuration.getEnvArg("access_token"));
        setHeaders(authorization);
    }
}
