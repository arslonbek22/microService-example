package uz.pdp.customer.mappers;

import javax.annotation.processing.Generated;
import uz.pdp.customer.dto.CustomerCreateDto;
import uz.pdp.customer.entity.Customer;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-22T14:12:55+0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerCreateDto toCustomerCreateDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerCreateDto customerCreateDto = new CustomerCreateDto();

        customerCreateDto.setFirstName( customer.getFirstName() );
        customerCreateDto.setLastName( customer.getLastName() );
        customerCreateDto.setEmail( customer.getEmail() );

        return customerCreateDto;
    }

    @Override
    public Customer toCustomer(CustomerCreateDto customerCreateDto) {
        if ( customerCreateDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setEmail( customerCreateDto.getEmail() );
        customer.setFirstName( customerCreateDto.getFirstName() );
        customer.setLastName( customerCreateDto.getLastName() );

        return customer;
    }
}
