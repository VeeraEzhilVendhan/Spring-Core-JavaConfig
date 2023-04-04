package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:coach.properties")
public class SpringConfig 
{
	@Bean
	public QuoteService getQuoteS()
	{
		return new BestQuoteService();
	}
	
	
	@Bean
	public Coach getBaseballc()
	{
		return new Baseballcoach(getQuoteS());
	}

	
}
