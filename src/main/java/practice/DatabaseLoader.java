package practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Urja Ramanandi",33, 9));
        this.employeeRepository.save(new Employee("Anil Bharadia",30, 9));
        this.employeeRepository.save(new Employee("Krunal Bhatt",25, 5));
        this.employeeRepository.save(new Employee("XYZ",29, 3));
    }
}
