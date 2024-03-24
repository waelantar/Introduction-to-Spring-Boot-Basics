package com.courses.introductiontospringbootbasics.Service;
// HelloService.java
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getMessage() {
        return "Hello, World!";
    }
}
