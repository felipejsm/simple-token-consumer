package com.nssp.tokenconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nssp.token","com.nssp.tokenconsumer"})
public class TokenConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TokenConsumerApplication.class, args);
    }

}
