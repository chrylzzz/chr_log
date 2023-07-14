package com.chryl;

import com.chryl.config.ChrylConfigProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties({ChrylConfigProperty.class})
@ComponentScan("com.chryl.**")
public class XccLogPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(XccLogPlusApplication.class, args);
    }

}
