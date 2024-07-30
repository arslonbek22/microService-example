package uz.pdp.customer.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.customer.dto.CustomerCreateDto;
import uz.pdp.customer.service.CustomerService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class
AuthController {

    private final CustomerService customerService;

    @PostMapping
    public HttpEntity<?> saveCustomer(@RequestBody CustomerCreateDto customerCreateDto){
        return customerService.register(customerCreateDto);
    }
}
