package uz.pdp.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.customer.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
