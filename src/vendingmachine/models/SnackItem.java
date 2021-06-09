/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.models;

/**
 *
 * @author rawan
 */
public class SnackItem {
    final int capacity=5;
    private String name;
    private String id;
    private double price;
    private int amount;

    public SnackItem(String name, String id, double price, int amount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.amount = amount;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SnackItem{" + "name=" + name + ", id=" + id + ", price=" + price + ", amount=" + amount + '}';
    }
    
    
    
}
