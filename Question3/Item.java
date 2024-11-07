package Question3;

import java.text.NumberFormat;

public class Item {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    // Returns a string with item information
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price * quantity));
    }

    // Getter for the price
    public double getPrice() {
        return price;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the quantity
    public int getQuantity() {
        return quantity;
    }
}
