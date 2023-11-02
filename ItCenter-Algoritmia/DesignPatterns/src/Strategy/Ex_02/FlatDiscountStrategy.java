package Strategy.Ex_02;

public class FlatDiscountStrategy implements DiscountStrategy{
    private double descontoPorPlano;

    public FlatDiscountStrategy(double descontoPorPlano) {
        this.descontoPorPlano = descontoPorPlano;
    }

    @Override
    public double contratoEstrategiaDesconto(double valorProduto) {
        System.out.println("------- Tabela com Desconto Direto -------");
        System.out.println("» Valor do Produto = €" + valorProduto);
        System.out.println("» Desconto direto de €" + this.descontoPorPlano);
        System.out.println("» Total com Desconto = €" + (valorProduto - this.descontoPorPlano));
        System.out.println("------------------------------------------");
        return 0;
    }
}
