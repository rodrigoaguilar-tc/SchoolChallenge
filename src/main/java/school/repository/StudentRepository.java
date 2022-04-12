package school.repository;


import school.model.Student;
import school.model.Subject;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface StudentRepository {

    Map<Character, List<Student>> getStudentsGroupByFirstLetterOfLastName();

    List<Student> getStudentsBySubject(Subject subject);

    void saveStudents(List<Student> students);

    Set<Student> getAllStudents();
}
