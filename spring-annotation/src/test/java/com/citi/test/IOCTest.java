package com.citi.test;

import com.citi.config.Context;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
  @Test
  public void test() {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(Context.class);
    System.out.println("ioc container are created...");
      String[] definationsNames = applicationContext.getBeanDefinitionNames();
     for (String names : definationsNames) System.out.println(names);
  }
}
