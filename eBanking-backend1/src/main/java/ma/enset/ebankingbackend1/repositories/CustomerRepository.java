package ma.enset.ebankingbackend1.repositories;

import ma.enset.ebankingbackend1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
