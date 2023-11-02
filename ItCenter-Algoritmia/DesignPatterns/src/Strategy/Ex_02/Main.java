package Strategy.Ex_02;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new NoDiscountStrategy());
        double total = paymentProcessor.calculateTotal(100);

        paymentProcessor = new PaymentProcessor(new FlatDiscountStrategy(10.0));
        total = paymentProcessor.calculateTotal(100);

        paymentProcessor = new PaymentProcessor(new PercentageDiscountStrategy(0.2));
        total = paymentProcessor.calculateTotal(100);
    }
}
