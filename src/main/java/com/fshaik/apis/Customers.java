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
import org.springframework.http.MediaType;
import com.fshaik.services.*;
import com.fshaik.models.*;


@RestController
public class Customers {
	@RequestMapping(value = "/customers", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Customer> Customer() {
		CustomerService customerService = new CustomerService();

		return customerService.getCustomers();
	}

}
