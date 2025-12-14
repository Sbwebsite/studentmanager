package org.sid;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    public List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).printStudent();
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum = sum + students.get(i).grade;
        }

        if (students.size() == 0) {
            return 0;
        } else {
            return sum / students.size();
        }
    }

    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                students.remove(i);
            }
        }
    }
}