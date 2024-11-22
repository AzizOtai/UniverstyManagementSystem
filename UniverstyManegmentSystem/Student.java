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
import java.util.*;

public class Student extends UniversityMember implements Reportable {
    private String major;
    private double[] grades;

    public Student(String name, String id, String major, double[] grades) {
        super(name, id);
        this.major = major;
        this.grades = grades;
    }

    public void study() {
        System.out.println(getName() + " is studying.");
    }

    @Override
    public double calculateGPA() {
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    @Override
    public double calculateAnnualExpense() {
        return calculateGPA() * 5000;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() +
                           ", ID: " + getId() +
                           ", Role: " + getRole() +
                           ", Major: " + major +
                           ", GPA: " + String.format("%.2f", calculateGPA()));
    }

    @Override
    public String getRole() {
        return "Student";
    }
    @Override
    public String generateReport() {
        return "Student Report:\n" +
               "Name: " + getName() + "\n" +
               "ID: " + getId() + "\n" +
               "Major: " + major + "\n" +
               "GPA: " + String.format("%.2f", calculateGPA());
    }
}
