package com.lms.LMS.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException exception) {
        Map<String, String> errorMap = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error ->
        {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public Map<String, String> handleInvalidArgument(ConstraintViolationException exception) {
        Map<String, String> errorMap = new HashMap<>();
        exception.getConstraintViolations().forEach(error ->
        {
            String fieldName = error.getPropertyPath().toString();
            String errorMessage = error.getMessage();
            errorMap.put(fieldName, errorMessage);
        });
        return errorMap;
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ObjectIsNullException.class)
    public Map<String, String> handleUserNotFoundException(ObjectIsNullException exception) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("message", exception.getMessage());
        return errorMap;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(StudentNotEnrolledException.class)
    public Map<String, String> handleStudentNotEnrolledException(StudentNotEnrolledException exception) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("message", exception.getMessage());
        return errorMap;
    }


}