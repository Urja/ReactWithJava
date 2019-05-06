package practice;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author urja
 */
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private int years;

    private Employee(){}

    public  Employee(String name, int age, int years){
        this.name = name;
        this.age = age;
        this.years = years;
    }

}
