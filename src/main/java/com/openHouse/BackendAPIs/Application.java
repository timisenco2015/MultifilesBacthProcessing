package com.openHouse.BackendAPIs;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
@EnableScheduling 
@Configuration


@ComponentScan(basePackages=
	{
			"com.openHouse.BackendAPIs","controller","dao","daoImp","domain","dto","repo","service","serviceImp","config","job","batch","error","exception","listener"
	})

@EntityScan(basePackageClasses = 
	{
	
		dto.DataLogDetails.class,
	
	})

@EnableMongoRepositories(basePackageClasses = 
	{
		repo.DataLogRepo.class,
		
	})


public class Application 
{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	

	@Bean
    public static Logger getLogger() {

		return logger;
		
    }
	public static void main(String[] args) 
	{
		
		SpringApplication.run(Application.class, args);
		
	}
	
	

}
