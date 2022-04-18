package school.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import school.model.Employee;
import school.model.Student;
import school.model.Subject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class StudentRepositoryTest {

    private StudentRepository studentRepository;
    private List<Student> studentListMock;

    @BeforeEach
    public void setup() {
        studentListMock = new ArrayList<>();
        studentListMock.addAll(Arrays.asList(
                new Student("Juan","Acedo",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Marquez",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Tita",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Shin",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Amero",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Linares",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Lose",123, LocalDate.now(), new ArrayList<>()),
                new Student("Juan","Ataro",123, LocalDate.now(), new ArrayList<>())
        ));
        studentRepository = new StudentRepositoryImpl();
    }

    @Test
    public void getStudentsGroupByFirstLetterOfLastNameShouldReturnOk() {
        studentRepository.saveStudents(studentListMock);
        Map<Character, List<Student>> result =  studentRepository.getStudentsGroupByFirstLetterOfLastName();
        Assertions.assertEquals(studentListMock.get(1),result.get('M').get(0));
        Assertions.assertEquals(3,result.get('A').size());
    }

    @Test
    public void getStudentsBySubject() {
        Employee employee = new Employee("Prof","Juan",123456789, LocalDate.now(), BigDecimal.TEN);
        Subject subject = new Subject("Math", employee, new HashSet<>(studentListMock));
        subject.getStudents();
        Assertions.assertEquals(studentListMock.size(),subject.getStudents().size());
    }


}
