package com.courses.introductiontospringbootbasics.Service;

public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS message";
    }
}
