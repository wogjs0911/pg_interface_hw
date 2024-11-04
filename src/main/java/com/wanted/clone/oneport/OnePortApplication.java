package com.wanted.clone.oneport;

import com.wanted.clone.oneport.payments.representation.web.request.PaymentRequestMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class OnePortApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnePortApplication.class, args);
    }

//    @GetMapping("/hello")
//    public String helloCheck() {
//        return "hello11";
//    }
}

