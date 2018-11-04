package com.source.document;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories({"com.source.document.repository"})
@SpringBootApplication
public class document
  extends SpringBootServletInitializer
{
 // public document() {}
  
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
  {
    return application.sources(new Class[] { document.class });
  }
  
  public static void main(String[] args) throws Exception
  {
    SpringApplication.run(document.class, args);
  }
}