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
import java.util.Arrays;

public class Teacher extends UniversityMember implements Reportable {
    private String department;
    private double baseSalary;
    private String[] subjects;

    public Teacher(String name, String id, String department, double baseSalary, String[] subjects) {
        super(name, id);
        this.department = department;
        this.baseSalary = baseSalary;
        this.subjects = subjects;
    }

    public void teach() {
        System.out.println(getName() + " is teaching.");
    }

    @Override
    public double calculateGPA() {
        return 0.0;
    }

    @Override
    public double calculateAnnualExpense() {
        return baseSalary + subjects.length * 1000;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() +
                           ", ID: " + getId() +
                           ", Role: " + getRole() +
                           ", Department: " + department +
                           ", Annual Expense: $" + String.format("%.2f", calculateAnnualExpense()));
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    @Override
    public String generateReport() {
        return "Teacher Report:\n" +
               "Name: " + getName() + "\n" +
               "ID: " + getId() + "\n" +
               "Department: " + department + "\n" +
               "Subjects: " + String.join(", ", subjects) + "\n" +
               "Annual Expense: $" + String.format("%.2f", calculateAnnualExpense());
    }
}
