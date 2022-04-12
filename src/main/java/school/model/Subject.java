package school.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Subject {
    private String name;
    private Employee teacher;
    private Set<Student> students;

    public Subject(String name, Employee teacher, Set<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
