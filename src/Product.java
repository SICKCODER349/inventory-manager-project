import java.io.Serializable;

public class Product implements Serializable {
    public int id;
    public String name;
    public int quantity;
    public double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Qty: " + quantity + " | Price: " + price);
    }
}
