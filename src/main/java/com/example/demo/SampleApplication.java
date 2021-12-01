package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*	SpringBootServletInitializer no es más que un WebApplicationInitializer que ofrece Spring Boot
 	para configurar la aplicación web (es la encargada de crear el WebApplicationContext y su configuración).
 	El código del método configure() generado simplemente añade como fuente de configuración a la clase
 	SampleApplication, que es la clase anotada con @SpringBootApplication que contiene la configuración de la aplicación
 	Spring Boot. Es esa clase, SampleApplication, la que se ejecutaría para arrancar la aplicación en caso de ejecutarla
 	como jar en lugar de haberla empaquetado en formato war.*/

@SpringBootApplication
public class SampleApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SampleApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
