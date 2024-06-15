package com.doug.hexagonal.config;

import com.doug.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.doug.hexagonal.application.core.usecase.FindCustumerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustumerByIdUseCase findCustumerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustumerByIdUseCase(findCustomerByIdAdapter);
    }

}
