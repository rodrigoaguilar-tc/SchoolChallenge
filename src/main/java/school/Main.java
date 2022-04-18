package school;

import school.model.Employee;
import school.model.Student;
import school.model.Subject;
import school.repository.StudentRepositoryImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Main class for program execution, the requested logic was tested in units tests.
 */
public class Main {

    public static void main(String [] args) {
        StudentRepositoryImpl studentRepository = new StudentRepositoryImpl();
        studentRepository.saveStudents(Arrays.asList(
                new Student("Juan","Acedo",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Marquez",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Tita",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Shin",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Amero",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Linares",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Lose",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Ataro",123, LocalDate.now(), new ArrayList<>())
        ));
        System.out.println("Students by Letter of last name " + studentRepository.getStudentsGroupByFirstLetterOfLastName());

        Employee employee = new Employee("Prof","Juan",123456789, LocalDate.now(), BigDecimal.TEN);
        Subject subject = new Subject("Math", employee, studentRepository.getAllStudents());
        System.out.println("Students in " + subject.getName() + " " + subject.getStudents());
    }
}
