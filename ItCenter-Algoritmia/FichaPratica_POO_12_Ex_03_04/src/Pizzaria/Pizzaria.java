package Pizzaria;

import Pizzaria.Enum.TamanhoPizza;

import java.util.ArrayList;

/**
 * Projeto Pizzaria:
 * Desenvolva uma aplicação que permita gerir Pizzas da Pequena Pizzaria®. Para
 * isso considere os seguintes requisitos funcionais:
 * I    -  Cada pizza é caracterizada pelo seu código, nome, descrição, preço, tamanho [Pequena, Média,
 * Grande] e coleção de ingredientes que representam a composição da pizza.
 * II   -  Cada pizza disponibilizada pelo restaurante é composta por um conjunto de ingredientes associados
 * (no máximo cada pizza terá 5 ingredientes) e respetivas quantidades.
 * III  -  Cada ingrediente é identificado pelo seu código, nome, unidade de medida [Gramas, Litros,
 * Unidades] e número de calorias por unidade de medida (por exemplo: 5Kcal por grama ou 15Kcal por Litro ou 35 Kcal por unidade).
 * <p>
 * Na Classe Pizza deve adicionar métodos que permitam:
 * I    - o Adicionar novos ingredientes a uma Pizza até um máximo de 5.
 * II   - o Editar a quantidade de um ingrediente que pertença à coleção de uma pizza.
 * III  - o Remover um ingrediente (identificando o ingrediente pelo seu id).
 * IV   - o Determinar o número de calorias de uma Pizza.
 */

//todo Refazer leitura da construção de todos os componentes de atributos e métodos da class Pizzaria.java
public class Pizzaria {
    private final int MAX_INGREDIENTE = 5;
    private String saborPizza, descricaoPizza;
    private int codPizza;
    private double precoPizza;
    private TamanhoPizza tamanhoPizza;
    private ArrayList<Ingredientes> igredientesList = new ArrayList<>();

    /**
     * Construtor da SuperClass <b>Pizzaria</b>
     *
     * @param saborPizza     - Nome ou Sabor da Pizza
     * @param descricaoPizza - Descrição da Pizza
     * @param codPizza       - Código da Pizza
     * @param precoPizza     - Preço da Pizza
     * @param tamanhoPizza   - Tamanho da Pizza em Enum [PEQUENA, MEDIA, GRANDE]
     */
    public Pizzaria(String saborPizza, String descricaoPizza, int codPizza, double precoPizza, TamanhoPizza tamanhoPizza) {
        this.saborPizza = saborPizza;
        this.descricaoPizza = descricaoPizza;
        this.codPizza = codPizza;
        this.precoPizza = precoPizza;
        this.tamanhoPizza = tamanhoPizza;
        this.igredientesList = new ArrayList<>();
    }

    /**
     * Métodos Getter e Setter
     */
    public int getMAX_INGREDIENTE() {
        return this.MAX_INGREDIENTE;
    }

    public String getSaborPizza() {
        return this.saborPizza;
    }

    public void setSaborPizza(String saborPizza) {
        this.saborPizza = saborPizza;
    }

    public String getDescricaoPizza() {
        return this.descricaoPizza;
    }

    public void setDescricaoPizza(String descricaoPizza) {
        this.descricaoPizza = descricaoPizza;
    }

    public int getCodPizza() {
        return this.codPizza;
    }

    public void setCodPizza(int codPizza) {
        this.codPizza = codPizza;
    }

    public double getPrecoPizza() {
        return this.precoPizza;
    }

    public void setPrecoPizza(double precoPizza) {
        this.precoPizza = precoPizza;
    }

    public TamanhoPizza getTamanhoPizza() {
        return this.tamanhoPizza;
    }

    public void setTamanhoPizza(TamanhoPizza tamanhoPizza) {
        this.tamanhoPizza = tamanhoPizza;
    }

    public ArrayList<Ingredientes> getIgredientesList() {
        return this.igredientesList;
    }
}
