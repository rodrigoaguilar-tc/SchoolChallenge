package school.model;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Student extends Person {
    private List<Subject> subjects;

    public Student(String firstName, String lastName, int dni, LocalDate birthDate, List<Subject> subjects) {
        super(firstName, lastName, dni, birthDate);
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(subjects, student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjects);
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjects=" + subjects +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dni=" + dni +
                ", birthDate=" + birthDate +
                '}';
    }
}
