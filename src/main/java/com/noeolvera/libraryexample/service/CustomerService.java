package com.noeolvera.libraryexample.service;

import com.noeolvera.libraryexample.entity.Book;
import com.noeolvera.libraryexample.entity.Customer;
import com.noeolvera.libraryexample.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> GetAllCustomers() {
        return customerRepository.GetAllCustomers();
    }

    public Customer GetCustomerDetail(Integer customerId) {
        return customerRepository.GetCustomerById(customerId);
    }

}
