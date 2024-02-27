package demo.jpa.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    
	List<Employee> findByRegion(String region);
    
	@Query("select emp from Employee emp where emp.dosh >= ?1 and emp.dosh <= ?2")
    List<Employee> findInSalaryRange(double from, double to);
    
	Page<Employee> findByDoshGreaterThan(double salary, Pageable pageable);
}
