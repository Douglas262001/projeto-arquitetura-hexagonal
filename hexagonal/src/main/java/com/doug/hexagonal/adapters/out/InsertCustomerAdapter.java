package com.doug.hexagonal.adapters.out;

import com.doug.hexagonal.adapters.out.repository.CustomerRepository;
import com.doug.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.doug.hexagonal.application.core.domain.Customer;
import com.doug.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var costumerEntity = customerEntityMapper.toConsumerEntity(customer);
        customerRepository.save(costumerEntity);
    }
}