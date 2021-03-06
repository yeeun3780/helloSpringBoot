package kr.ac.hansung.cse.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

//DAO 역할 대신
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
