
package Clases;

public class Book {
    private String name;
    private Autor autor;
    private double price;
    private int qty;

    public Book(String name, Autor author, double price, int qty) {
        this.name = name;
        this.autor = autor;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Autor getAuthor() {
        return autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    @Override
    public String toString() {
        return name + " was made by " + autor.toString();
    }
    
    
}
