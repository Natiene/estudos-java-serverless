package com.serverless;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimpleHttpHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {

    @Override
    public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
        input.forEach((key, value) -> System.out.println(key + ":" + value));

        Map<String, Object> response = new HashMap();

        System.out.println("input: " + input);

        response.put("statusCode", 200);
        // response.put("body", "{\"name\": \"duke\"}");

        return response;
    }

}
