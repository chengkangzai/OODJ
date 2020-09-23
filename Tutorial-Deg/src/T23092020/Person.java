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
public class Person {

    String name;
    String address;
    String phoneNumber;
    String email;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return getClass() + " " + this.name;
    }
}
