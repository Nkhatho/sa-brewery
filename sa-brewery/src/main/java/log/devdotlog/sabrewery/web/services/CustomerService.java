package log.devdotlog.sabrewery.web.services;

import log.devdotlog.sabrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById();

    CustomerDto saveCustomerDto(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
