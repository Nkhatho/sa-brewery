package log.devdotlog.sabrewery.web.services.impl;

import log.devdotlog.sabrewery.web.model.CustomerDto;
import log.devdotlog.sabrewery.web.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById() {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Dave Manly")
                .build();
    }
    @Override
    public CustomerDto saveCustomerDto(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Stanly Manly")
                .build();
    }
    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
      log.debug("Updating customer ...");
    }
    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting customer ...");
    }
}
