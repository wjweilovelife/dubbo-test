package com.pactera.serviceImpl;

import com.pactera.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by pactera on 2017/11/20.
 */
@Service
public class UserServiceImpl implements UserService {


   public String sayHello() {
      System.out.println("hello world----------------------------");
      return "hello world";
   }
}
