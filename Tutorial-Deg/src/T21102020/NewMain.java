/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T21102020;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CCK
 */
public class NewMain {

    static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println("===========");
        System.out.println("1) Add Book");
        System.out.println("2) Search Book");
        System.out.println("3) Display Book");
        System.out.println("4) Exit ");

        int nextInt = scan.nextInt();
        switch (nextInt) {
            case 1:
                addBook();
                break;
            case 2:
                searchBook();
                break;
            case 3:
                displayBooks();
                break;
            default:
                System.exit(1);
                break;

        }
    }

    private static void addBook() {
        System.out.println("Enter Name");
        String name = scan.next();
        System.out.println("Enter author");
        String author = scan.next();
        System.out.println("Enter Price");
        Double price = scan.nextDouble();
        System.out.println("Enter Qty");
        Integer qty = scan.nextInt();

        Book b = new Book();
        b.setName(name);
        b.setAuthor(author);
        b.setPrice(price);
        b.setQty(qty);
        if (b.create()) {
            System.out.println("Done");
        }
    }

    private static void searchBook() {
        System.out.println("Give me the name to search");
        String search = scan.next();
        Book b = new Book().getByName(search);
        if (b != null) {
            System.out.println("Got cha !");
            System.out.println("The name of the book is " + b.getName());
            System.out.println("The Author of the book is " + b.getAuthor());
            System.out.println("The Price of the book is " + b.getPrice());
            System.out.println("The Quantity of the book is " + b.getQty());
        } else {
            System.out.println("No Search result bitch");
        }
    }

    private static void displayBooks() {
        ArrayList<Book> all = new Book().getAll();
        for (int i = 0; i < all.size(); i++) {
            Book b = all.get(i);
            System.out.println(" Name : " + b.getName() + " Author : " + b.getAuthor() + " Price : " + b.getPrice() + " Quantity : " + b.getQty());
        }
    }

}
