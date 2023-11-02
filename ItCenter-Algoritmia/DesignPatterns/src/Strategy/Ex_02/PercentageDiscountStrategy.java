package Strategy.Ex_02;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private double descontoPorPorcentagem;

    public PercentageDiscountStrategy(double descontoPorPorcentagem) {
        this.descontoPorPorcentagem = descontoPorPorcentagem;
    }

    @Override
    public double contratoEstrategiaDesconto(double valorProduto) {
        System.out.println("----- Tabela com Desconto Percentual -----");
        System.out.println("» Preço do Produto = €" + valorProduto);
        System.out.println("» Desconto Por Porcentagem de " + (this.descontoPorPorcentagem * 100) + "%");
        System.out.println("» Total com Desconto = €" + (valorProduto - (valorProduto * this.descontoPorPorcentagem)));
        System.out.println("------------------------------------------");
        return this.descontoPorPorcentagem;
    }
}
