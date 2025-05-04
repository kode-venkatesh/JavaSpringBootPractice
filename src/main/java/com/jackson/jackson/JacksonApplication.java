package com.jackson.jackson;

import JacksonAPI.JsonToJava;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class JacksonApplication {

    public static void main(String[] args) {

        SpringApplication.run(JacksonApplication.class, args);
        System.out.println("Java");

    }

}
