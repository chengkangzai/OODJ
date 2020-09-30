/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T30092020;

import T30092020.Q1.Address;
import T30092020.Q1.Person;
import T30092020.Q2.Benefit;
import T30092020.Q2.Employee;

/**
 *
 * @author CCK
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
        Address address = new Address("Jalan Bukit Jalil", "Bukit Jalil", "KL", "57000", "Malaysia");
        Person p = new Person("Najib", "999", "najib@najib.me", address);
        p.getPersonDetail();

        //Q2
        Employee employee = new Employee("Rosmah", "rosmah", 'F', 5, 120000);
        double calculatePay = employee.calculatePay();
        System.out.println("Pay Per month" + calculatePay);
        Benefit benefit = employee.getBenefit();
        benefit.displayBenefit();
        
    }

}
