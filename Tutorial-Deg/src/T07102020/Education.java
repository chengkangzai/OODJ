/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T07102020;

/**
 *
 * @author CCK
 */
public class Education extends Customer {

    String name;
    String address;

    public Education(String name, String address, String customerID, String customerLead) {
        super(customerID, customerLead);
        this.name = name;
        this.address = address;
    }

    public Education(String name, String address) {
        this.name = name;
        this.address = address;
    }
    

}
