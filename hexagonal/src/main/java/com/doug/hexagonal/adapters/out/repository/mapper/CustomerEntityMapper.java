package com.doug.hexagonal.adapters.out.repository.mapper;

import com.doug.hexagonal.adapters.out.repository.entity.CustumerEntity;
import com.doug.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustumerEntity toConsumerEntity(Customer customer);
}
