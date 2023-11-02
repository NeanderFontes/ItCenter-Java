package Strategy.Ex_02;

public class PaymentProcessor {
    private final DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double processadorPagamento) {
        return this.discountStrategy.contratoEstrategiaDesconto(processadorPagamento);
    }
}
