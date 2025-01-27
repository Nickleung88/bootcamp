package com.bootcamp.web.demo_springweb;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

// = @SpringBootConfiguration + @ EnableAutoConfiguration + @ComponentsScan
public class DemoSpringwebApplication {

  public static org.springframework.context.ApplicationContext context;

  public static void main(String[] args) {
    context = SpringApplication.run(DemoSpringwebApplication.class, args);
    
  }

}
