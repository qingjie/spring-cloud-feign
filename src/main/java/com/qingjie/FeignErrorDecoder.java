package com.qingjie;


import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.util.Map;

@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        try {
            if (response.body() != null) {
                String message = Util.toString(response.body().asReader());
                Map<String, String> map = new ObjectMapper().readValue(message, Map.class);
                throw new CustomException(map.get("message"), map.get("errorCode"), HttpStatus.resolve(Integer.parseInt(map.get("status"))));
            }
        } catch (IOException var4) {
            log.error(" FEIGN service AnnotationErrorDecoder:  " + response.body().toString());
        }
        return defaultErrorDecoder.decode(methodKey, response);
    }
}