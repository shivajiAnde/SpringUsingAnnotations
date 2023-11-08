package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
	
	@Autowired
	@Qualifier("butterScotch")
	IceCream ice;
	
}
