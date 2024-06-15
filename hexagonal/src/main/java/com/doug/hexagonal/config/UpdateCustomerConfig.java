package com.doug.hexagonal.config;

import com.doug.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.doug.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.doug.hexagonal.application.core.usecase.FindCustumerByIdUseCase;
import com.doug.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(FindCustumerByIdUseCase findCustumerByIdUseCase, FindAddressByZipCodeAdapter findAddressByZipCodeAdapter, UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustumerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
