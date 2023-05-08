package com.nzj.myclientzookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyClientZookeeperApplication {

    @GetMapping("/")
    public String home() {
        return "Hello World! this is a zookeeper client";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyClientZookeeperApplication.class, args);
    }

}
