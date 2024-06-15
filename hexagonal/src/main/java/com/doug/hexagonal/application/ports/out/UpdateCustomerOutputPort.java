package com.doug.hexagonal.application.ports.out;

import com.doug.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
