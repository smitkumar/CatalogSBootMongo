package org.smit.sp.mongo.app.main;

import org.apache.log4j.Logger;
import org.smit.sp.mongo.resource.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackageClasses = ProductController.class) // Working 
public class CatalogApplication extends SpringBootServletInitializer{

	private static final Logger logger=Logger.getLogger(CatalogApplication.class.getName());
	  public static void main(String[] args) {
		  
	    SpringApplication.run(CatalogApplication.class, args);
	    System.out.println("Hello World");
	  }

	 /*
	  * StartupRunner Bean is used to provide initialization of the resource before App start.
	  * */ 
	  
	  /*@Bean
	  public StartupRunner schedulerRunner() {
		  logger.info("StartupRunner Bean is getting intialized");
		 
		  return new StartupRunner();
		}*/
	}


