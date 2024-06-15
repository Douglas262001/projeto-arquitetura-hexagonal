package com.doug.hexagonal.application.ports.in;

import com.doug.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
