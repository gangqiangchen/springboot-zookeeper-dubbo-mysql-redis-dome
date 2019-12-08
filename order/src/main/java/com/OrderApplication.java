package com;

import com.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDubbo
public class OrderApplication {

  @Reference
  UserService UserService;

  public static void main(String[] args) {
    SpringApplication.run(OrderApplication.class, args);
  }

  @RequestMapping({"/", "/home"})
  String home() {
    return UserService.getNickName(1L);
  }
}
