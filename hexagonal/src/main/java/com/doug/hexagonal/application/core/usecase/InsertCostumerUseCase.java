package com.doug.hexagonal.application.core.usecase;

import com.doug.hexagonal.application.core.domain.Customer;
import com.doug.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.doug.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCostumerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCostumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
