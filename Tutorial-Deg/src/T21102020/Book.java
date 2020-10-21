/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T21102020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CCK
 */
public class Book {

    String name;
    String author;
    Double price;
    int qty;

    Connection con = new Connection("books.csv");

    public Book(String name, String author, Double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Book getByName(String name) {
        List<String> fromFile = con.getFromFile();
        for (String element : fromFile) {
            String[] split = element.split(",");
            if (split[0].contains(name.toLowerCase())) {
                return new Book(split[0], split[1], Double.valueOf(split[2]), Integer.valueOf(split[3]));
            }
        }
        return null;
    }

    public ArrayList<Book> getAll() {
        List<String> fromFile = con.getFromFile();
        ArrayList<Book> temp = new ArrayList();
        for (int i = 1; i < fromFile.size(); i++) {
            String[] split = fromFile.get(i).split(",");
            temp.add(new Book(split[0], split[1], Double.valueOf(split[2]), Integer.valueOf(split[3])));
        }
        return temp;
    }

    public boolean create() {
        List<String> fromFile = con.getFromFile();
        fromFile.add(this.toString());
        return con.reWrite(con.listToString(fromFile));
    }

    @Override
    public String toString() {
        return this.name + "," + this.author + "," + this.price + "," + this.qty;
    }

    public static void main(String[] args) {
//        Book b = new Book();
//        b.setName("random Name");
//        b.setAuthor("CCK");
//        b.setPrice(100.00);
//        b.setQty(10);
//        System.out.println(b.create());

        Book b = new Book().getByName("random Name");
        System.out.println(b.getAuthor());


//        ArrayList<Book> all = new Book().getAll();
//        for (int i = 0; i < all.size(); i++) {
//            System.out.println(all.get(i).getAuthor());
//        }

    }

}
