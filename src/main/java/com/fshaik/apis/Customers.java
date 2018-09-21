package com.fshaik.apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fshaik.models.Customer;

@RestController
public class Customers {
	@RequestMapping(value = "/customers", method=RequestMethod.GET)
	public @ResponseBody List<String> Customer() {
		/*Customer cust = new Customer();
		ArrayList<Customer> custList = new  ArrayList<Customer>();
		custList.add(cust);
		cust.setId(1);
		cust.setName("AWS"); */
		return Arrays.asList("A","B","C");
	}

}
