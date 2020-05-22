package com.citi;

import com.citi.bean.Person;
import com.citi.config.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(value="com.citi.service")
public class Application {
  public static void main(String[] args) {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Context.class);
    Person bean = applicationContext.getBean(Person.class);
    System.out.println(bean);
    String[] namesByType = applicationContext.getBeanNamesForType(Person.class);
    for (String beanName : namesByType) System.out.println(beanName);
    System.out.println("all beans in container: ");
    String[] definitionNames = applicationContext.getBeanDefinitionNames();
    for (String name : definitionNames) System.out.println(name);
  }
}
