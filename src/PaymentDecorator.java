/**
 * Created by Lawrence Lee on 2016/10/26.
 *
 */
public class PaymentDecorator extends Decorator {
    private double shouldPay;
    private double didPay;
    public PaymentDecorator(double shouldPay, double didPay, VisualComponent component) {
        super(component);
        this.shouldPay = shouldPay;
        this.didPay = didPay;
    }
    private void printPayment() {
        System.out.printf("应付款：%16.2f\n", shouldPay);
        System.out.printf("实付款：%16.2f\n", didPay);
        System.out.printf("找零：%18.2f\n", didPay - shouldPay);
        System.out.println("-------------------------");
    }
    @Override
    public void draw() {
        component.draw();
        this.printPayment();
    }
}
