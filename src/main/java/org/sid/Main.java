package org.sid;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.addStudent(new Student("Alice", 20, 15));
        service.addStudent(new Student("Bob", 22, 18));
        service.addStudent(new Student("Alice", 20, 15)); // duplicate

        service.printAllStudents();

        System.out.println("Average: " + service.calculateAverage());

        service.removeStudent(null); // BUG (NullPointerException)
    }
}