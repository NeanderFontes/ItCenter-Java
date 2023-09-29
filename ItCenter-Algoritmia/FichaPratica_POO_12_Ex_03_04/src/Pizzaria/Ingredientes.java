package Pizzaria;

import Pizzaria.Enum.TamanhoPizza;

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
//todo Continuar construção dos atributos e métodos class Ingredientes.java
public class Ingredientes {
    private Ingredientes ingredientes;
    private double quantidadeIgredientes;
}
