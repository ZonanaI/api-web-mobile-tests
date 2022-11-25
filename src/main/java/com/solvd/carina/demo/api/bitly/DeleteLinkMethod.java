package com.solvd.carina.demo.api.bitly;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/v4/bitlinks/${bitly-link}", methodType = HttpMethodType.DELETE)
@RequestTemplatePath(path = "api/users/bitly/_delete/rq.json")
@ResponseTemplatePath(path = "api/users/bitly/_delete/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteLinkMethod extends AbstractApiMethodV2 {

    public static final String bitlyLink= "bit.ly/3ESIPev";

    public DeleteLinkMethod() {
        super();
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("bitly-link", Configuration.getEnvArg("bitly-link"));
        String authorization = String.format("Authorization= Bearer %s",Configuration.getEnvArg("access_token"));
        setHeaders(authorization);
    }
}
