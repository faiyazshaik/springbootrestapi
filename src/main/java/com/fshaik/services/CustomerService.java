package com.fshaik.services;

import org.springframework.stereotype.Service;
import com.fshaik.models.Customer;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> custList = new ArrayList<Customer>();
    public CustomerService ()  {
        Customer cust = new Customer();
        cust.setId(1);
        cust.setName("AWS");
        custList.add(cust);

        cust = new Customer();
        cust.setId(2);
        cust.setName("Microsoft");
        custList.add(cust);

        cust = new Customer();
        cust.setId(3);
        cust.setName("Google");
        custList.add(cust);

        cust = new Customer();
        cust.setId(4);
        cust.setName("OceanDigital");
        custList.add(cust);

    }

    public List<Customer> getCustomers() {

        return this.custList;
    }

}
