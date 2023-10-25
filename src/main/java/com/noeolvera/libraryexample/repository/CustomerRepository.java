package com.noeolvera.libraryexample.repository;

import com.noeolvera.libraryexample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Procedure(name = "GetAllCustomers")
    Iterable<Customer> GetAllCustomers();

    @Procedure(name = "GetCustomerById")
    Customer GetCustomerById(Integer customerId);
}
