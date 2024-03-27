# Introduction to Spring Boot Basics

## Introduction to Spring Container

The Spring container is at the core of the Spring Framework. The container creates objects, wires them together, configures them, and manages their complete lifecycle from creation till destruction. It utilizes Dependency Injection (DI) to manage the components that constitute an application. These objects are referred to as Spring Beans ([Tutorialpoint](https://www.tutorialspoint.com/spring/spring_container.htm)).

## Spring Boot Application Setup

When setting up a Spring Boot application using the Spring Initializr:

- Choose the programming language: Java, Kotlin, or Groovy.
- Select the build tool: Gradle (Groovy or Kotlin) or Maven.
- Specify the JDK and Java version.
- Select the packaging type: WAR or JAR.

WAR (Web ARchive) and JAR (Java ARchive) are packaging formats for Java applications. WAR files are intended for deployment to a web server, typically containing web application resources, servlets, and JSP files. JAR files are standalone Java applications packaged with their dependencies.

## The `@SpringBootApplication` Annotation

The `@SpringBootApplication` annotation is a convenience annotation that includes the following annotations:

- `@Configuration`: Indicates that this class can be used by the Spring IoC container as a source of bean definitions.
- `@EnableAutoConfiguration`: Enables Spring Boot's auto-configuration mechanism, which configures the Spring application based on its classpath and existing configurations.
- `@ComponentScan`: Enables component scanning for Spring-managed components like controllers, services, and repositories.

## Understanding Dependency Injection (DI): Documentation

### Overview

This documentation provides an explanation of Dependency Injection (DI) using a Java code example. It demonstrates how DI eliminates the need for explicit object creation and how Spring manages object dependencies.

### Components

- **MessageService Interface**
  - Description: An interface defining a method `getMessage()`.

- **EmailService and SMSService Classes**
  - Description: Implementations of the `MessageService` interface with different message types.

- **NotificationService Class**
  - Description: A class that depends on `MessageService` and sends notifications using it.
  - Dependencies:
    - `MessageService`: The service responsible for providing messages.

- **MainApplication Class**
  - Description: The main class demonstrating Dependency Injection (DI) using Spring.
  - Actions:
    - Creates a Spring application context.
    - Retrieves the `NotificationService` bean from the context.
    - Uses the `NotificationService` to send a notification.

- **AppConfig Configuration Class**
  - Description: A configuration class for Spring where beans are defined.
  - Beans Defined:
    - `emailService`: Bean for `EmailService` implementation of `MessageService`.
    - `smsService`: Bean for `SMSService` implementation of `MessageService`.
    - `notificationService`: Bean for `NotificationService` with constructor injection.

### Dependency Injection (DI) Explanation

#### What is Dependency Injection (DI)?

Dependency Injection is a design pattern used to achieve Inversion of Control (IoC) in software development. In DI, the dependencies of a class are provided externally rather than created internally, making the class more flexible and easier to test.

#### How does DI work in the provided code?

- The `NotificationService` class depends on the `MessageService` interface.
- Instead of creating instances of `MessageService` implementations within `NotificationService`, the dependencies are injected externally.
- In the `AppConfig` class, beans for `EmailService` and `SMSService` are defined.
- The `notificationService` bean is configured with constructor injection, receiving a `MessageService` bean (either `emailService` or `smsService`) as a dependency.

#### How does Spring manage object dependencies?

Spring manages object dependencies by maintaining a container known as the Spring IoC (Inversion of Control) container. In the provided code, Spring is configured using annotations such as `@Bean` and `@Configuration`. It automatically identifies dependencies between beans and injects the required beans into other beans. The `@Qualifier` annotation can be used to specify which bean to inject when there are multiple beans of the same type.
