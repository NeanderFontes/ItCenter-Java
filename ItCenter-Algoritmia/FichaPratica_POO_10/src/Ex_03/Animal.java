package Ex_03;

/**
 * Crie uma classe animal, que tenha como atributos: nome, espécie, país de origem, peso (em kg) e
 * alimentação (array de Strings).
 * I - Crie um método para o animal comer, receba como parâmetro o alimento e o peso (em g).
 * Se o alimento constar na lista de alimentos que o animal come, incremente o seu peso com o peso da
 * refeição e imprima na consola “O animal comeu”. Caso contrário, não deve atualizar e imprimir na
 * consola “O animal recusou essa comida”.
 * II - Teste a classe instanciando um animal e apresentado uma refeição que ele goste, seguidamente
 * imprima o seu novo peso. A seguir, apresente uma refeição que ele não goste e imprima o seu peso.
 */
public class Animal {
    private String nomeAnimel, especieAnimal, origemAnimal;
    private double pesoAnimal;
    private String[] alimentacaoAnimal;

    /**
     * Método Construtor da Class Animal:
     * @param nomeAnimel - Nome do Animal
     * @param especieAnimal - Raça do Animal
     * @param origemAnimal - País de Origem
     * @param pesoAnimal - Peso do Animal
     * @param alimentacaoAnimal - Array para Tipo de ALimentos
     */
    public Animal(String nomeAnimel, String especieAnimal, String origemAnimal, double pesoAnimal, String[] alimentacaoAnimal) {
        this.nomeAnimel = nomeAnimel;
        this.especieAnimal = especieAnimal;
        this.origemAnimal = origemAnimal;
        this.pesoAnimal = pesoAnimal;
        this.alimentacaoAnimal = alimentacaoAnimal;
    }
}
