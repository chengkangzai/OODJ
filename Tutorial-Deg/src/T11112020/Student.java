/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T11112020;

/**
 *
 * @author CCK
 */
public class Student extends Person {

    String subject[] = new String[10];
    int marks[] = new int[10];
    int nos = 0;

    public Student(String address, String name) {
        super(address, name);
    }

    public void addGrades(String sub, int marks) {
        this.subject[nos] = sub;
        this.marks[nos] = marks;
        this.nos++;
    }

    public void printDetails() {
        System.out.println("Name of the student = " + super.getName());
        System.out.println("Address of this student = " + super.getAddress());
        System.out.println("----------------------------------------------");
        System.out.println("Number of subject" + nos);
        for (int i = 0; i < nos; i++) {
            System.out.println("Subject : " + this.subject[i] + " Marks :" + this.marks[i]);
        }
        System.out.println("");
    }

}
