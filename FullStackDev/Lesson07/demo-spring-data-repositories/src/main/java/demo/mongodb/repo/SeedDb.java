package demo.mongodb.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SeedDb {

	@Autowired
	private EmployeeRepository repository;
	
	@PostConstruct
    public void init() {
		repository.save(new Employee(1,  "James", 21000,  "London"));
        repository.save(new Employee(2,  "Marie", 22000,  "Edinburgh"));
        repository.save(new Employee(3,  "Peter", 23000,  "Belfast"));
        repository.save(new Employee(4,  "Sally", 24000,  "Cardiff"));
        repository.save(new Employee(5,  "Peter", 51000,  "London"));
        repository.save(new Employee(6,  "Berty", 52000,  "Edinburgh"));
        repository.save(new Employee(7,  "Milly", 53000,  "Belfast"));
        repository.save(new Employee(8,  "Jayne", 54000,  "Cardiff"));
        repository.save(new Employee(9,  "Wally", 91000,  "London"));
        repository.save(new Employee(10, "Emily", 92000,  "Edinburgh"));
        repository.save(new Employee(11, "Tommy", 93000,  "Belfast"));
        repository.save(new Employee(12, "Colin", 94000,  "Cardiff"));
        repository.save(new Employee(13, "Sarah", 121000, "London"));
        repository.save(new Employee(14, "Darel", 122000, "Edinburgh"));
        repository.save(new Employee(15, "Benji", 123000, "Belfast"));
        repository.save(new Employee(16, "Carys", 124000, "Cardiff"));
    }
	
/*	@PreDestroy
	public void cleanup() {
		repository.deleteAll();
	}
*/
}
