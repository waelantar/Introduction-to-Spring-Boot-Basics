package com.courses.introductiontospringbootbasics.Configuration;

import com.courses.introductiontospringbootbasics.Service.EmailService;
import com.courses.introductiontospringbootbasics.Service.MessageService;
import com.courses.introductiontospringbootbasics.Service.NotificationService;
import com.courses.introductiontospringbootbasics.Service.SMSService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration class for Spring
@Configuration
public class AppConfig {
    // Define beans for MessageService implementations
    @Bean
    public MessageService emailService() {
        return new EmailService();
    }

    @Bean
    public MessageService smsService() {
        return new SMSService();
    }

    // Define a bean for NotificationService with constructor injection
    @Bean
    public NotificationService notificationService(@Qualifier("emailService") MessageService messageService) {
        return new NotificationService(messageService);
    }
}
