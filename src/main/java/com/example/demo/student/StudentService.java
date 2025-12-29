package com.example.demo.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1L, "Kunal", "kunal@1234mail.com"),
            new Student(2L, "Kartik", "kartik@1234mail.com"),
            new Student(3L, "Kirti", "kirti@1234mail.com")));

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(Long id) {
        return students.stream().filter(s -> s.getId().equals(id)).findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found!"));
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(Student student, Long id) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(id)) {
                students.set(i, student);
                return student;
            }
        }
        throw new RuntimeException("Student not found");
    }

    public void deleteStudent(Long id) {
        students.removeIf(s -> s.getId().equals(id));
    }

}
