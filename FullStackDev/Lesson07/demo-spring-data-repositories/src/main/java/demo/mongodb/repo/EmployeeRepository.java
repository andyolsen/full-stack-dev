package demo.mongodb.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee,Long> {
    
	List<Employee> findByRegion(String region);
    
	@Query("{'dosh' : {$gte : ?0, $lte : ?1}}")
    List<Employee> findInSalaryRange(double from, double to);
    
	Page<Employee> findByDoshGreaterThan(double salary, Pageable pageable);
}
