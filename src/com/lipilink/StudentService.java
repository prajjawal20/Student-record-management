package com.lipilink;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.\n");
            return;
        }
        for (Student s : students) System.out.println(s);
        System.out.println();
    }

    public void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new Name: ");
                String name = sc.nextLine();
                System.out.print("Enter new Marks: ");
                int marks = sc.nextInt();
                s.setName(name);
                s.setMarks(marks);
                System.out.println("Student updated successfully!\n");
                return;
            }
        }
        System.out.println("Student not found!\n");
    }

    public void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!\n");
                return;
            }
        }
        System.out.println("Student not found!\n");
    }
}
