package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	@Autowired
	private Engine engine;
	
}
