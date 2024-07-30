package uz.pdp.customer.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.internal.build.AllowNonPortable;

@AllowNonPortable
@NoArgsConstructor
@Data
public class CustomerCreateDto {
    private String firstName;
    private String lastName;
    private String email;
}
