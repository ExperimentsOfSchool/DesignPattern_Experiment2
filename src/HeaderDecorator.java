/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class HeaderDecorator extends Decorator {
    private String marketName;
    public HeaderDecorator(String marketName, VisualComponent component) {
        super(component);
        this.marketName = marketName;
    }
    private void printHeader() {
        String showName = this.marketName;
        for(int i = 0; i < (22 - marketName.length()) / 2; i++) {
            showName = " " + showName + " ";
        }
        System.out.println(showName);
        System.out.println("-------------------------");
    }
    @Override
    public void draw() {
        component.draw();
        this.printHeader();
    }
}
