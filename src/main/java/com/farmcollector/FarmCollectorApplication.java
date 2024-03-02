package com.farmcollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.farmcollector","com.farmcollector.application","com.farmcollector.repository" })

public class FarmCollectorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FarmCollectorApplication.class, args);
    }
}
