package Question3;

import java.text.NumberFormat;
import java.util.Scanner;

public class ShoppingCart {
    private Item[] cart;
    private int itemCount;
    private double totalPrice;
    private int capacity;

    // Constructor - initializes the cart array with a capacity of 5 items
    public ShoppingCart() {
        capacity = 5;
        cart = new Item[capacity];
        itemCount = 0;
        totalPrice = 0.0;
    }

    // Adds an item to the shopping cart
    public void addToCart(String itemName, double price, int quantity) {
        if (itemCount == capacity) {
            increaseSize();
        }
        cart[itemCount] = new Item(itemName, price, quantity);
        itemCount++;
        totalPrice += price * quantity;
    }

    // Increases the capacity of the shopping cart by 3
    private void increaseSize() {
        Item[] newCart = new Item[capacity + 3];
        System.arraycopy(cart, 0, newCart, 0, capacity);
        cart = newCart;
        capacity += 3;
    }

    // Returns the contents of the cart with summary information
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++) {
            contents += cart[i].toString() + "\n";
        }
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }

    // Main program to simulate shopping
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        boolean shopping = true;

        while (shopping) {
            System.out.print("Enter the name of the item: ");
            String name = scanner.nextLine();
            System.out.print("Enter the price of the item: ");
            double price = scanner.nextDouble();
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            cart.addToCart(name, price, quantity);
            System.out.println(cart);

            System.out.print("Do you want to add another item? (yes/no): ");
            String response = scanner.nextLine();
            shopping = response.equalsIgnoreCase("yes");
        }

        System.out.println("Please pay " + NumberFormat.getCurrencyInstance().format(cart.totalPrice));
        scanner.close();
    }
}
