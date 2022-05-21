package schoolManagement;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalMoneyEarned; 
    private static int totalMoneySpent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public ArrayList<Teacher> getTeachers() {
        return this.teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
        totalMoneySpent += MoneySpent;
    }
}
