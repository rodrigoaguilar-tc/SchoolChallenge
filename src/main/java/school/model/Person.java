package school.model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected Integer dni;
    protected LocalDate birthDate;

    public Person(String firstName, String lastName, int dni, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return dni == person.dni &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dni, birthDate);
    }

    public abstract String getLastName();
}
