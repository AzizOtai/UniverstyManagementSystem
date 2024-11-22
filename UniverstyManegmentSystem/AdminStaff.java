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
public class AdminStaff extends UniversityMember {
    private String role;
    private double monthlySalary;

    public AdminStaff(String name, String id, String role, double monthlySalary) {
        super(name, id);
        this.role = role;
        this.monthlySalary = monthlySalary;
    }

    public void manage() {
        System.out.println(getName() + " is performing administrative tasks.");
    }

    @Override
    public double calculateGPA() {
        return 0.0;
    }

    @Override
    public double calculateAnnualExpense() {
        return monthlySalary * 12;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName() +
                           ", ID: " + getId() +
                           ", Role: " + getRole() +
                           ", Position: " + role +
                           ", Annual Expense: $" + String.format("%.2f", calculateAnnualExpense()));
    }

    @Override
    public String getRole() {
        return "Admin Staff";
    }
}
