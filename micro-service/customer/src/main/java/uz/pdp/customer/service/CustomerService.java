package uz.pdp.customer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pdp.clients.fraud.FraudClient;
import uz.pdp.clients.fraud.FraudCheckResponse;
import uz.pdp.customer.dto.CustomerCreateDto;
import uz.pdp.customer.entity.Customer;
import uz.pdp.customer.mappers.CustomerMapper;
import uz.pdp.customer.repo.CustomerRepo;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final FraudClient fraudClient;
    private final CustomerRepo customerRepo;

    public HttpEntity<?> register(CustomerCreateDto customerCreateDto) {
        Customer customer = CustomerMapper.INSTANCE.toCustomer(customerCreateDto);
        customerRepo.save(customer);


        FraudCheckResponse fraudCheckResponse = fraudClient.checkFraudster(customer.getId());


        if (fraudCheckResponse.getIsFraud()){
            throw new RuntimeException("this is fraudster");
        }


        return ResponseEntity.ok(customer);
    }
}
