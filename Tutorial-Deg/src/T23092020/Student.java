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
public class Student extends Person {

    STATUS status;

    //Freshman,Sophomore,Junior,Senior
    static enum STATUS {
        Freshman, Sophomore, Junior, Senior
    }

    public Student() {
    }

    public Student(String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.status = STATUS.Freshman;
    }

    @Override
    public String toString() {
        return getClass() + this.name;
    }
}
