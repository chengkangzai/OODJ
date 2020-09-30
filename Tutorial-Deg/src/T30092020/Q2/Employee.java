/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T30092020.Q2;

/**
 *
 * @author CCK
 */
public class Employee {

    String firstName;
    String lastName;
    char gender;
    int dependents;
    double annualSalary;
    static int numEmployee = 0;
    Benefit benefit;

    public Employee(String firstName, String lastName, char gender, int dependents, double annualSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dependents = dependents;
        this.annualSalary = annualSalary;
        this.benefit = new Benefit(
                "Health Insurance!",
                (double) Math.round(Math.random() * 10000),
                (int) Math.round(Math.random() * 50)
        );
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDependents() {
        return dependents;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setAnnualSalary(String annualSalary) {
        this.annualSalary = Double.valueOf(annualSalary);
    }

    public static int getNumEmployee() {
        return numEmployee;
    }

    public static void setNumEmployee(int numEmployee) {
        Employee.numEmployee = numEmployee;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }

    public double calculatePay() {
        return this.annualSalary / 12;
    }

}
