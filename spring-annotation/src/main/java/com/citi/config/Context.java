package com.citi.config;

import com.citi.bean.Person;
import com.citi.dao.BookDao;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Configurable
//@ComponentScan(
//    value = "com.citi",
//    excludeFilters = {
//      @Filter(
//          type = FilterType.ANNOTATION,
//          classes = {Controller.class, Service.class}),
//      @Filter(
//          type = FilterType.ASSIGNABLE_TYPE,
//          classes = {BookDao.class})
//    })
public class Context {
  @Bean(value = "Joseph")
  @Scope("prototype")
  public Person person() {
    System.out.println("created Joseph...");
    return new Person("Joseph", 23);
  }

  @Lazy
  @Bean(value = "Lei")
  public Person person2() {
    System.out.println("created Lei...");
    return new Person("Lei", 29);
  }
}
