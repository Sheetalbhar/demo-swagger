package com.spring.swagger.demoswagger;

import java.util.Collections;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class DemoSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSwaggerApplication.class, args);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(null, null);
		
		
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				//.apis(RequestHandlerSelectors.basePackage("com.spring.swagger.demoswagger"))
				.build()
				.apiInfo(apiDetails());
		
		
	}
	private ApiInfo apiDetails() {
		return new ApiInfo("AddressBook API",
				"Sample API",
				"1.0",
				"Free to use",
		new springfox.documentation.service.Contact("Sheetal", "http://javabrains.io", "abc.com"),
		"API License",
		"https://javabrains.io",
		Collections.emptyList());
	}
	

}
