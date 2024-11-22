/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniverstyManegmentSystem;

/**
 *
 * @author otaishan
 */
import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    public static void main(String[] args) {
        List<UniversityMember> members = new ArrayList<>();

        Student student1 = new Student("Alice", "S001", "Computer Science", new double[]{3.8, 3.9, 4.0});
        Student student2 = new Student("Bob", "S002", "Mathematics", new double[]{3.5, 3.6, 3.7});

        Teacher teacher1 = new Teacher("Dr. Smith", "T001", "Mathematics", 50000, new String[]{"Calculus", "Algebra"});
        Teacher teacher2 = new Teacher("Dr. Johnson", "T002", "Computer Science", 55000, new String[]{"Programming", "Data Structures"});

        AdminStaff admin1 = new AdminStaff("John", "A001", "Accountant", 4000);
        AdminStaff admin2 = new AdminStaff("Emma", "A002", "HR Manager", 4500);

        members.add(student1);
        members.add(student2);
        members.add(teacher1);
        members.add(teacher2);
        members.add(admin1);
        members.add(admin2);

        System.out.println("University Member Details:");
        System.out.println("---------------------------");
        for (UniversityMember member : members) {
            member.displayDetails();
            if (member instanceof Reportable) {
                Reportable reportableMember = (Reportable) member;
                System.out.println(reportableMember.generateReport());
            }
            System.out.println();
        }


        double totalAnnualExpense = 0;
        for (UniversityMember member : members) {
            totalAnnualExpense += member.calculateAnnualExpense();
        }
        System.out.println("Total Annual University Expense: $" + String.format("%.2f", totalAnnualExpense));


        System.out.println("\nFiltering by Role: Teachers");
        for (UniversityMember member : members) {
            if (member.getRole().equals("Teacher")) {
                member.displayDetails();
            }
        }
        
        Student topStudent = null;
        double highestGPA = 0.0;
        for (UniversityMember member : members) {
            if (member instanceof Student) {
                Student student = (Student) member;
                double gpa = student.calculateGPA();
                if (gpa > highestGPA) {
                    highestGPA = gpa;
                    topStudent = student;
                }
            }
        }
        if (topStudent != null) {
            System.out.println("\nTop-Performing Student: " + topStudent.getName() +
                               ", GPA: " + String.format("%.2f", highestGPA));
        }
    }
}
