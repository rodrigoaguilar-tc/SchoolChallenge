package school.repository;


import school.model.Student;
import school.model.Subject;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Repository for Students.
 */
public interface StudentRepository {

    /**
     * Get All students grouped by the first letter of the last name.
     * @return Map<Character, List<Student>> for each letter the list of students.
     */
    Map<Character, List<Student>> getStudentsGroupByFirstLetterOfLastName();

    /**
     * Get all students in a specific subject.
     * @param subject subject.
     * @return the list of student in the specific subject.
     */
    List<Student> getStudentsBySubject(Subject subject);

    /**
     * Save all students in a list.
     * @param students students for save.
     */
    void saveStudents(List<Student> students);

    /**
     * Get all students in the database
     * @return SetOfStudents.
     */
    Set<Student> getAllStudents();
}
