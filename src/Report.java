import java.util.ArrayList;

public class Report {
    private ArrayList<Product> items;

    public Report(ArrayList<Product> items) {
        this.items = items;
    }

    public void generateReport() {
        System.out.println("--- Inventory Report ---");
        int totalItems = 0;
        double totalValue = 0.0;
        for(Product p : items) {
            totalItems += p.quantity;
            totalValue += p.quantity * p.price;
        }
        System.out.println("Total distinct products: " + items.size());
        System.out.println("Total item quantity: " + totalItems);
        System.out.println("Total inventory value: " + totalValue);
    }

    public void showExpensive() {
        System.out.println("--- Expensive Products (price > 100) ---");
        boolean found = false;
        for(Product p : items) {
            if(p.price > 100) {
                p.display();
                found = true;
            }
        }
        if(!found) System.out.println("No expensive products found.");
    }
}
