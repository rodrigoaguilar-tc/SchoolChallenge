package school.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Principal extends Employee {
    private List<Person> dependants;

    public Principal(String firstName, String lastName, int dni, LocalDate birthDate, BigDecimal salary, List<Person>  dependants) {
        super(firstName, lastName, dni, birthDate, salary);
        this.dependants = dependants;
    }

}
