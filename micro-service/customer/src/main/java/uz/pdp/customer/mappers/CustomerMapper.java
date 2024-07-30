package uz.pdp.customer.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import uz.pdp.customer.dto.CustomerCreateDto;
import uz.pdp.customer.entity.Customer;

@Mapper
public interface CustomerMapper {


    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerCreateDto toCustomerCreateDto(Customer customer);
    @Mapping(target = "id", ignore = true)
    Customer toCustomer(CustomerCreateDto customerCreateDto);
}
