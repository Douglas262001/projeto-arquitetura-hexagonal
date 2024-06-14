package com.doug.hexagonal.application.ports.out;

import com.doug.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
