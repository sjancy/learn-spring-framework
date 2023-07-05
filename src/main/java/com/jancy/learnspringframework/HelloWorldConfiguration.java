package com.jancy.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//record person (String name,int age) {};

@Configuration
public class HelloWorldConfiguration {
	
  @Bean
  public String name() {
	  return "Ranga";
  }
  
  @Bean
  public int age() {
	  return 35;
  }

}
