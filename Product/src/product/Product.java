/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author thejcode24
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    private String name;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price: " + price + ", amount: " + amount);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Product banana = new Product("Banana", 1.0, 30);
        banana.printProduct();
    }
}
