/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class FooterDecorator extends Decorator {
    private String footerInfo;
    public FooterDecorator(String footerInfo, VisualComponent component) {
        super(component);
        this.footerInfo = footerInfo;
    }
    private void printFooter() {
        System.out.println(this.footerInfo);
    }
    @Override
    public void draw() {
        component.draw();
        this.printFooter();
    }
}
