package com.qingjie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
@Slf4j
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<Object> handleOperrException(CustomException e, WebRequest request) {
        Map<String, String> entity = new HashMap();
        entity.put("message", e.getMessage());
        entity.put("errorCode", e.getStatusCode());
        return new ResponseEntity<>(entity, new HttpHeaders(), e.getStatus());
    }
}
