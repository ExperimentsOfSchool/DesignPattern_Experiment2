/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class TipDecorator extends Decorator {
    private String tip;
    public TipDecorator(String tip, VisualComponent component) {
        super(component);
        this.tip = tip;
    }
    private void printTip() {
        String showTip = tip;
        for(int i = 0; i < (18 - tip.length()) / 2; i++) {
            showTip = " " + showTip + " ";
        }
        System.out.println(showTip);
        System.out.println("-------------------------");
    }
    @Override
    public void draw() {
        component.draw();
        this.printTip();
    }
}
