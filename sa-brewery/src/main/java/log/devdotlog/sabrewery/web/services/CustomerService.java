package log.devdotlog.sabrewery.web.services;

import log.devdotlog.sabrewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById();

    CustomerDto saveCustomerDto(CustomerDto customerDto);
}
