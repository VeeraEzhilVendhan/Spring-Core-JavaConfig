package com.spring.javaconfig;

public class BestQuoteService implements QuoteService{
	
	@Override
	public String getQuote()
	{
		return "Higher the climb, better view";
	}

}
