package com.cpd.hotel_system.auth_service_api.adviser;

import com.cpd.hotel_system.auth_service_api.exception.BadRequestException;
import com.cpd.hotel_system.auth_service_api.exception.DuplicateEntryException;
import com.cpd.hotel_system.auth_service_api.util.StandardResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<StandardResponseDto> handleBadRequestException(BadRequestException ex) {
        return new ResponseEntity<StandardResponseDto>(
                new StandardResponseDto(400,ex.getMessage(),ex),
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(DuplicateEntryException.class)
    public ResponseEntity<StandardResponseDto> handleDuplicateEntryException(DuplicateEntryException ex) {
        return new ResponseEntity<StandardResponseDto>(
                new StandardResponseDto(409,ex.getMessage(),ex),
                HttpStatus.BAD_REQUEST
        );
    }


}