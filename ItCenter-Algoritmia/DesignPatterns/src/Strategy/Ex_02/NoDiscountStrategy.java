package Strategy.Ex_02;

public class NoDiscountStrategy implements DiscountStrategy{
    @Override
    public double contratoEstrategiaDesconto(double valorProduto) {
        System.out.println("----------- Plano Sem Desconto -----------");
        System.out.println("» Valor do Produto = €" + valorProduto);
        System.out.println("» Plano Sem Desconto");
        System.out.println("» Total Final do Produto = €" + (valorProduto));
        System.out.println("------------------------------------------");
        return 0;
    }
}
