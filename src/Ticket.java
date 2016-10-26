import java.util.ArrayList;

/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class Ticket {
    private ArrayList<Item> itemList;
    public Ticket(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
    private double totalPrice() {
        double total = 0;
        for(Item item : itemList) {
            total += item.getPrice();
        }
        return total;
    }
    public void decorateClient() {
        VisualComponent component = new TipDecorator("购物袋有偿使用！",
                new FooterDecorator("家乐福文化路店 12:07:03",
                        new PaymentDecorator(this.totalPrice(), this.totalPrice(),
                                new ItemListDecorator(itemList,
                                        new HeaderDecorator("家乐福超市", new StartLine())))));
        component.draw();
    }
}
