package com.sample.in.flight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api(value="stock")
public class StockController {

	@RequestMapping(value = "/users/get", method = RequestMethod.GET)  
    public List<String> userList(){  
		List<String> ls = new ArrayList<String>();
		ls.add("Godson");
		ls.add("Ponson");
        return ls;  
    } 
	
	
}
