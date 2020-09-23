/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T23092020;


/**
 *
 * @author CCK
 */
public class Employee extends Person {

    String office;
    int salary;
    MyDate hiredDate;
    Staff staff;

    @Override
    public String toString() {
        return getClass() + this.name;
    }
    
   public static void main(String[] args) {
        System.out.println(new Employee().toString());
    }
    
}
