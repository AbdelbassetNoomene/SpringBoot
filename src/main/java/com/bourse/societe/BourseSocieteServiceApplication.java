package com.bourse.societe;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.bourse.societe.dao.SocieteRepository;
import com.bourse.societe.entities.Societe;

@EnableEurekaClient
@SpringBootApplication
public class BourseSocieteServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BourseSocieteServiceApplication.class, args);
		SocieteRepository societeRepository=ctx.getBean(SocieteRepository.class);
		Stream.of("Ta3tou3a","Ta3tou3","WC","AinNoon").forEach(s->societeRepository.save(new Societe(s)));
		societeRepository.findAll().forEach(s->System.out.println(s.getNomSociete()));
	}
}

@Configuration
class MyConfig extends RepositoryRestMvcConfiguration{
	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		config.exposeIdsFor(Societe.class);
	}
}
