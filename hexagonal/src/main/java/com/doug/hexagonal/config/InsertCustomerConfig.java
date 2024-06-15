package com.doug.hexagonal.config;

import com.doug.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.doug.hexagonal.adapters.out.InsertCustomerAdapter;
import com.doug.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter, InsertCustomerAdapter insertCustomerAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }

}
