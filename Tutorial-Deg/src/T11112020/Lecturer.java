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
public class Lecturer extends Person {

    String qualification;
    String subject[] = new String[10];
    int nos = 0;

    public Lecturer(String address, String name, String qualification) {
        super(address, name);
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void addSubject(String subject) {
        this.subject[nos] = subject;
        this.nos++;
    }

    public void printDetails() {
        System.out.println("Name of the Lecturer = " + super.getName());
        System.out.println("Address of this Lecturer = " + super.getAddress());
        System.out.println("----------------------------------------------");
        System.out.println("No of subject taken" + nos);
        for (int i = 0; i < nos; i++) {
            System.out.println("Subject : " + this.subject[i]);
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        Lecturer l = new Lecturer("12", "123", "13");
        l.addSubject("sss");

    }

}
