package com.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimpleLambda implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        // TODO Auto-generated method stub
        return input.toUpperCase();
    }

}