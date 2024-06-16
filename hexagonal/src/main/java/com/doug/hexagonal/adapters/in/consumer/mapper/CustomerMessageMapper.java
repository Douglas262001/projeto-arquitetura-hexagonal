package com.doug.hexagonal.adapters.in.consumer.mapper;

import com.doug.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.doug.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCostumer(CustomerMessage customerMessage);

}
