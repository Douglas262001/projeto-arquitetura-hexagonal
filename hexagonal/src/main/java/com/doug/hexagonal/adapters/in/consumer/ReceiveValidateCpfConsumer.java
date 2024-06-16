package com.doug.hexagonal.adapters.in.consumer;

import com.doug.hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.doug.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.doug.hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "doug")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCostumer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
