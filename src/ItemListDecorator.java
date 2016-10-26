import java.util.ArrayList;

/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class ItemListDecorator extends Decorator {
    private ArrayList<Item> itemList;
    public ItemListDecorator(ArrayList<Item> itemList, VisualComponent component) {
        super(component);
        this.itemList = itemList;
    }
    private void printItemList() {
        for (Item item : itemList) {
            item.printItem();
        }
        System.out.println("-------------------------");
    }
    @Override
    public void draw() {
        component.draw();
        this.printItemList();
    }
}
