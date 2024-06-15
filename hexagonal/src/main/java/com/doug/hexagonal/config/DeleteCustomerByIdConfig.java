package com.doug.hexagonal.config;

import com.doug.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.doug.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.doug.hexagonal.application.core.usecase.FindCustumerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustumerByIdUseCase findCustumerByIdUseCase, DeleteCustomerByIdAdapter deleteCustomerByIdAdapter) {
        return new DeleteCustomerByIdUseCase(findCustumerByIdUseCase, deleteCustomerByIdAdapter);
    }

}
