package com.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Baseballcoach implements Coach {
	
	@Value("${c.name}")
	private String name;
	
	@Value("${c.email}")
	private String email;

	private QuoteService qs;
	
	public Baseballcoach(QuoteService qs)
	{
		this.qs=qs;
	}
	
	@Override
	public String getWorkout() {
		
		return "practice batting daily";
	}

	@Override
	public String getQuote() {
		return qs.getQuote();
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	
}
