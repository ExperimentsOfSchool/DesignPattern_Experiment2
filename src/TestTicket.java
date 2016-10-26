import java.util.ArrayList;

/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class TestTicket {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(new Item("哇哈哈AD钙奶", 1.9, 10));
        itemList.add(new Item("旺仔牛奶", 3.5));
        new Ticket(itemList).decorateClient();
    }
}
