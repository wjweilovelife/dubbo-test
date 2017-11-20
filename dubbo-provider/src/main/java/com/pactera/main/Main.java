package com.pactera.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by pactera on 2017/11/20.
 */
public class Main {

   public static void main(String[] args) throws IOException {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-dubbo.xml");
      context.start();
      System.in.read();
   }
}
