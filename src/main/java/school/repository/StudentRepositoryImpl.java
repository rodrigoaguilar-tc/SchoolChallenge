package school.repository;

import school.model.Student;
import school.model.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class StudentRepositoryImpl implements StudentRepository {

    private final Set<Student> students;

    public StudentRepositoryImpl() {
        this.students = new HashSet<>();
    }

    @Override
    public Map<Character, List<Student>> getStudentsGroupByFirstLetterOfLastName() {
        Map<Character, List<Student>> studentsMap = new HashMap<>();

        students.forEach(student -> {
            char letter = student.getLastName().charAt(0);
            letter = Character.toUpperCase(letter);
            List<Student> studentsFromMap = studentsMap.get(letter);
            if(Objects.nonNull(studentsFromMap)) {
                studentsFromMap.add(student);
            } else {
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentsMap.put(letter, list);
            }
        });
        return studentsMap;
    }

    @Override
    public List<Student> getStudentsBySubject(Subject subject) {
        return subject.getStudents();
    }

    @Override
    public void saveStudents(List<Student> list) {
        students.addAll(list);
    }

    @Override
    public Set<Student> getAllStudents() {
        return students;
    }
}
