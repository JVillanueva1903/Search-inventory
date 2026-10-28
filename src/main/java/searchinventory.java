
import java.util.ArrayList;

class Product {
    private final String name;
    private final double price;
    private final int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // toString for printing
    public String toString() {
        return name + " - $" + price + " (Qty: " + quantity + ")";
    }
}

 public class searchinventory {

    // This method builds and returns the inventory list
    public static ArrayList<Product> getInventory() {

        ArrayList<Product> inventory = new ArrayList<>();

        // Initial inventory of at least 5 products
        inventory.add(new Product("Laptop", 899.99, 10));
        inventory.add(new Product("Gaming Mouse", 49.99, 25));
        inventory.add(new Product("Mechanical Keyboard", 129.99, 15));
        inventory.add(new Product("Monitor 27in", 199.99, 8));
        inventory.add(new Product("USB-C Cable", 12.99, 50));

        return inventory;
    }

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        System.out.println("=== Current Inventory ===");
        for (Product p : inventory) {
            System.out.println(p);
        }

        // Example of adding more products (ArrayList grows automatically)
        inventory.add(new Product("Webcam", 59.99, 12));
        inventory.add(new Product("Headset", 79.99, 20));

        System.out.println("\n=== Updated Inventory ===");
        for (Product p : inventory) {
            System.out.println(p);
        }
    }
}