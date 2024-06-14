package com.doug.hexagonal.adapters.out.client.response;

import lombok.Data;

@Data
public class AddressResponse {

    private String street;
    private String city;
    private String state;
}
