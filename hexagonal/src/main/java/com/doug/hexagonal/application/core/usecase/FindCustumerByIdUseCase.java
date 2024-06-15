package com.doug.hexagonal.application.core.usecase;

import com.doug.hexagonal.application.core.domain.Customer;
import com.doug.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustumerByIdUseCase {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustumerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
