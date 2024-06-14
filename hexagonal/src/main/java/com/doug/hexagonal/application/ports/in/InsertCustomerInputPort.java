package com.doug.hexagonal.application.ports.in;

import com.doug.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
