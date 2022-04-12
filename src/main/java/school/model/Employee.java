package school.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Employee extends Person implements Worker{

    private BigDecimal salary;
    private Long employeeNumber;
    private List<String> responsabilities;

    public Employee(String firstName, String lastName, int dni, LocalDate birthDate, BigDecimal salary) {
        super(firstName, lastName, dni, birthDate);
        this.salary = salary;
    }


    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void work() {

    }
}
