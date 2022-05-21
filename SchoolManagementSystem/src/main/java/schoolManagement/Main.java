package schoolManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Teacher kakashi = new Teacher(1, "Kakashi", 500);
        Teacher mightGuy = new Teacher(2, "Might Guy", 700);
        Teacher asuma = new Teacher(3, "Asuma", 600);
        
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(kakashi);
        teachers.add(mightGuy);
        teachers.add(asuma);
        
        Student naruto = new Student(1, "Naruto", 4);
        Student sasuke = new Student(2, "Sasuke", 5);
        Student sai = new Student(3, "Sai", 6);
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(naruto);
        students.add(sasuke);
        students.add(sai);
        
        School konoha = new School(teachers, students);
        
        Teacher kurenai = new Teacher(6, "Kurenai", 900);
        konoha.addTeacher(kurenai);
        
        naruto.payFees(5000);
        sasuke.payFees(6000);
        System.out.println("Konoha has earned : $" + konoha.getTotalMoneyEarned());
        
        System.out.println("---MAKING SCHOOL PAY SALARY---");
        kakashi.receiveSalary(kakashi.getSalary());
        System.out.println("Konoha has spent for salary to " + kakashi.getName()
                + " and now has $" + konoha.getTotalMoneyEarned());
        
        mightGuy.receiveSalary(mightGuy.getSalary());
        System.out.println("Konoha has spent for salary to " + mightGuy.getName()
                + " and now has $" + konoha.getTotalMoneyEarned());
        
        System.out.println(naruto.toString());
        System.out.println(kakashi.toString());
        System.out.println(kurenai.toString());
    }
}
