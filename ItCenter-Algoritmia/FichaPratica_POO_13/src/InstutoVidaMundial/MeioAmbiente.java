package InstutoVidaMundial;

import InstutoVidaMundial.Enum.FamiliaPlanta;

import java.util.ArrayList;
import java.util.Random;

/**
 * MeioAmbiente que terá os seguintes atributos:
 * • String nome
 * • Double agua (litros de água no meio)
 * • ArrayList<SerVivo> seres
 */
public class MeioAmbiente {
    private String nomeMeioAmbiente;
    private double qtAguaMeioAmbiente;
    private ArrayList<SerVivo> serVivoList;

    /**
     * Método Construtor para Instanciar MeioAmbiente
     *
     * @param nomeMeioAmbiente   - Nome/Local Meio Ambiente
     * @param qtAguaMeioAmbiente - Quantidade de Água no Meio Ambiente
     */
    public MeioAmbiente(String nomeMeioAmbiente, double qtAguaMeioAmbiente) {
        this.nomeMeioAmbiente = nomeMeioAmbiente;
        this.qtAguaMeioAmbiente = qtAguaMeioAmbiente;
        this.serVivoList = new ArrayList<SerVivo>();
    }

    /**
     * Método para ArrayList<Animal> da SuperClass <b>SerVivo</b>
     *
     */

    /**
     * Boolean plantaBebe(int indexPlanta): analisa a água disponível no meio ambiente e, caso seja
     * possível, de acordo com a família: árvores bebem 1L, flores bebem 0.1L e ervas bebem 0.25L e
     * retorna true (a água em meio ambiente deve também diminuir). Se retornar true, então a planta
     * bebeu e água do meio diminuiu. Se retornar false, a planta não bebe e seca (deve ser retirada do
     * meio ambiente).
     *
     * @param indexPlanta
     * @return
     */
    public boolean plantaBebe(int indexPlanta) {
    /*
        ArrayList<Planta> plantaList = new ArrayList<>();
        for (SerVivo serVivo: this.serVivoList) {
            if (serVivo instanceof Planta) {
                plantaList.add((Planta) serVivo);
            }

        }
    */

        //Se quantidade de agua do meio ambiente for maior que 0L

        //((Planta)serVivoList.get(indexPlanta)).getTipoFamiliaPlanta();
        Planta plantaAtual = (Planta) this.serVivoList.get(indexPlanta);

        double qtAgua = 0.0;
        switch (plantaAtual.getTipoFamiliaPlanta()) {
            case ARVORES: //Bebem 1 Litro
                if (this.qtAguaMeioAmbiente >= 1) {
                    qtAgua = 1;
                    this.qtAguaMeioAmbiente -= qtAgua;
                    return true;
                } else {
                    System.out.println("Quantidade de agua do Meio Ambiente menor que 1L: " + this.qtAguaMeioAmbiente + " L");
                    this.serVivoList.remove(indexPlanta);
                    return false;
                }

            case FLORES: //Bebem 0.1 Litro
                if (this.qtAguaMeioAmbiente >= 0.1) {
                    qtAgua = 0.1;
                    this.qtAguaMeioAmbiente -= qtAgua;
                    return true;
                } else {
                    System.out.println("Quantidade de agua do Meio Ambiente menor que 0.1L: " + this.qtAguaMeioAmbiente + " L");
                    this.serVivoList.remove(indexPlanta);
                    return false;
                }

            case ERVAS: //Bebem 0.25 Litro
                if (this.qtAguaMeioAmbiente >= 0.25) {
                    qtAgua = 0.25;
                    this.qtAguaMeioAmbiente -= qtAgua;
                    return true;
                } else {
                    System.out.println("Quantidade de agua do Meio Ambiente menor que 0.25L: " + this.qtAguaMeioAmbiente + " L");
                    System.out.println("Plata " + plantaAtual.getNomeSerVivo() + " morreu por falta de água.");
                    this.serVivoList.remove(indexPlanta);
                    return false;
                }
        }
        return false;
    }


    /**
     * Boolean plantaComeInsetos(int indexPlanta): a planta come um inseto e retorna true. Caso não
     * existam insetos, a planta morre de fome, é retirada do meio ambiente e a função retorna false.
     *
     * @param indexPlanta - Numero de Index do AraryList<Planta> da SuperClass <b>SerVivo</b>
     * @return - true para a Planta come um inseto aleatório e remove do ambiente.
     * @return - false para ArrayList<Inseto> está vazio, remover a planta do ambiente
     */
    public boolean plantaComeInsetos(int indexPlanta) {
        //Biblioca Random para remover algum inseto do ArrayList<Inseto>
        Random random = new Random();

        //Casting para converter de SerVivo para Planta
        Planta plantaAtual = (Planta) this.serVivoList.get(indexPlanta);


        // Acessar o ArrayList<SerVivo> e Saber se é uma planta come insetos
        if (plantaAtual.getTipoFamiliaPlanta() == FamiliaPlanta.COMEINSETO) {
            System.out.println("Planta " + plantaAtual.getTipoFamiliaPlanta());

            //Criação de ArrayList<Inseto> para adicioar ao ArrayList<SerVivo>
            ArrayList<Inseto> insetoList = new ArrayList<>();

            //
            for (SerVivo serVivoAtual : this.serVivoList) {
                if (serVivoAtual instanceof Inseto) {
                    insetoList.add((Inseto) serVivoAtual);
                }
            }

            //Caso ArrayList<Inseto> está vazio, remover a planta do ArrayList<SerVivo> "Ambiente"
            if (insetoList.isEmpty()) {
                System.out.println("A planta " + plantaAtual.getNomeSerVivo() + " tentou comer mas não há insetos no meio... Morreu de fome");
                this.serVivoList.remove(indexPlanta);
                return false;
            } else {//Remove ArrayList<Inseto> e Remove o Inseto do ArrayList<SerVivo> "Ambiente
                this.serVivoList.remove(insetoList.get(random.nextInt((insetoList.size()))));
                return true;
            }
        } else {
            System.out.println("Ser Vivo é Planta mas não come insetos");
            return false;
        }
    }

    /**
     * Boolean animalBebe(int indexAnimal): analisa a água disponível no meio ambiente e, caso seja
     * possível, de acordo com o seu peso: por cada kg. o animal bebe 0.025L e retorna true (a água em
     * meio ambiente deve também diminuir). Se retornar true, então é porque o animal bebeu e água do
     * meio diminuiu. Se retornar false, o animal não bebe e morre de sede (deve ser retirado do meio
     * ambiente).
     *
     * @param indexAnimal - Animal
     * @return - true Animal bebeu água e diminui a quantidade de Litro do Ambiente
     * @return - false Não contém água no Ambiente e animal removido
     */
    public boolean animalBebe(int indexAnimal) {
        //Casting de SerVivo para Animal
        Animal animalAtua = (Animal) this.serVivoList.get(indexAnimal);

        if (this.qtAguaMeioAmbiente == (animalAtua.getPesoAnimal() * 0.025) && this.qtAguaMeioAmbiente > 0) {
            double qtAgua = (animalAtua.getPesoAnimal() * 0.025);
            this.qtAguaMeioAmbiente -= qtAgua;
            return true;
        } else { //Se quantidade de agua do meio ambiente menor que 0L
            System.out.println("Quantidade de agua do Meio Ambiente = 0L" + this.qtAguaMeioAmbiente);
            this.serVivoList.remove(indexAnimal);
            return false;
        }
    }
}
