package com.hibernateexample.Controller;

import com.hibernateexample.Model.Customer;
import com.hibernateexample.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository repository = null;

    @GetMapping("/{id}")
    @ResponseBody
    public Customer getCustomer(@PathVariable Long id) {
        Customer customer = repository.findById(id).get();
        return customer;

    }
}
