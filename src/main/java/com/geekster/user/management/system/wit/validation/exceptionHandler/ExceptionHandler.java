package com.geekster.user.management.system.wit.validation.exceptionHandler;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> exception(MethodArgumentNotValidException ex){
       Map<String,String> mp=new HashMap<>();
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();
        for(ObjectError error:allErrors){
            String code = error.getCode();
            String defaultMessage = error.getDefaultMessage();
            mp.put(code,defaultMessage);
        }
         return  mp;
    }
}
