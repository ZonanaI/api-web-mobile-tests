package com.solvd.carina.demo.api.bitly;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/v4/shorten", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/users/bitly/_post/rq.json")
@ResponseTemplatePath(path = "api/users/bitly/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)

public class PostLinkMethod extends AbstractApiMethodV2 {
    public PostLinkMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        String authorization = String.format("Authorization= Bearer %s",Configuration.getEnvArg("access_token"));
        setHeaders(authorization,"Content-Type= application/json");
    }
}
