package com.doug.hexagonal.application.ports.in;

import com.doug.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
