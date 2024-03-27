package com.courses.introductiontospringbootbasics.Service;

public class NotificationService {
    private final MessageService messageService;

    // Constructor-based dependency injection
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification() {
        String message = messageService.getMessage();
        System.out.println("Sending notification: " + message);
    }
}
