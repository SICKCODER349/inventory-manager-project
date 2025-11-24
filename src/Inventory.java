import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Inventory {
    public ArrayList<Product> items = new ArrayList<>();

    public Inventory() {
    }

    public void addProd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        items.add(new Product(id, name, qty, price));
        System.out.println("Product added.");
    }

    public void viewAll() {
        if(items.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        for(Product p : items) {
            p.display();
        }
    }

    public void updateQty() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        Product p = searchById(id);
        if(p == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.print("Enter new quantity: ");
        int q = sc.nextInt();
        p.quantity = q;
        System.out.println("Quantity updated.");
    }

    public void deleteProd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID to delete: ");
        int id = sc.nextInt();
        Iterator<Product> it = items.iterator();
        while(it.hasNext()) {
            Product p = it.next();
            if(p.id == id) {
                it.remove();
                System.out.println("Product deleted.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public Product searchById(int id) {
        for(Product p : items) {
            if(p.id == id) return p;
        }
        return null;
    }

    public void checkLowStock() {
        boolean found = false;
        for(Product p : items) {
            if(p.quantity <= 5) {
                p.display();
                found = true;
            }
        }
        if(!found) System.out.println("No low-stock products.");
    }
}
