package lux.pe.customer.service;

import lux.pe.customer.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
