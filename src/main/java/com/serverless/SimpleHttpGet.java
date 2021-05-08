package com.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimpleHttpGet implements RequestHandler<String, String> {

    @Override
    public String handleRequest() {

        return input + " teste sucesso";
    }

}
