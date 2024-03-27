package com.courses.introductiontospringbootbasics.Service;

// Service implementation
public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email message";
    }
}
