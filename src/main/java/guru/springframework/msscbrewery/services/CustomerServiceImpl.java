package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("John Doe")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Jim Bob")
                .build();
    }

    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {
        // do something with the customer
        log.info("update the customer");
    }

    @Override
    public void deleteCustomer(UUID id) {
        // delete the customer in storage
        log.info("delete customer id: {}", id);
    }

}
