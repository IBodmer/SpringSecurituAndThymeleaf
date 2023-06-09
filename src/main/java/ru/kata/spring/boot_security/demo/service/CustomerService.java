package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.models.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);

    List<Customer> findAllCustomers();

    Customer findByUsername(String email);

    void update(Long id, Customer customer);
    void deleteCustomer(Long id);
}
