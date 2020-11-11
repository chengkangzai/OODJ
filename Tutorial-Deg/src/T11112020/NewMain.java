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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student now = new Student("name", "Norawy");
        now.addGrades("A1", 79);
        now.addGrades("DSA", 90);
        now.printDetails();
        
        Lecturer Dhill = new Lecturer("Penang", "Dhilshath", "Masters");
        Dhill.addSubject("Algorithms");
        Dhill.addSubject("Computing Theory");
        Dhill.addSubject("Crypography");
        Dhill.printDetails();
        
    }

}
