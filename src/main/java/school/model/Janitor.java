package school.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Janitor extends Employee{

    private List<String> workingAreas;

    public Janitor(String firstName, String lastName, int dni, LocalDate birthDate, BigDecimal salary, List<String> workingAreas) {
        super(firstName, lastName, dni, birthDate, salary);
        this.workingAreas=workingAreas;
    }

    public List<String> getWorkingAreas() {
        return workingAreas;
    }
}
