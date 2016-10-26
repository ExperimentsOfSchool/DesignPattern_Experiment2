/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class Item {
    private String itemName;
    private double price;
    private int quantity;

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 1;
    }
    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void printItem() {
        System.out.printf("%-12s\t%6.2f\n", this.itemName, this.price * this.quantity);
    }
    public double getPrice() {
        return this.price * this.quantity;
    }
}
