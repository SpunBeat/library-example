package com.noeolvera.libraryexample.controller;

import com.noeolvera.libraryexample.entity.Customer;
import com.noeolvera.libraryexample.service.CustomerService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/customers")
public class CustomerController {

    private final CustomerService costumerService;

    public CustomerController(CustomerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping(path="/{customerId}")
    @Transactional()
    public @ResponseBody Customer getById(@PathVariable Integer customerId) {
        return costumerService.GetCustomerDetail(customerId);
    }

    @GetMapping(path="/all")
    @Transactional()
    public @ResponseBody Iterable<Customer> getAll() {
        return costumerService.GetAllCustomers();
    }

}
