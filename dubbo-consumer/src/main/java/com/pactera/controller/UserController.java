package com.pactera.controller;

import com.pactera.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by pactera on 2017/11/20.
 */

public class UserController {
   public static void main(String[] args) throws IOException {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-dubbo.xml");
      UserService service = (UserService) context.getBean("userService");
      service.sayHello();
      context.start();
      System.in.read();
   }
}
