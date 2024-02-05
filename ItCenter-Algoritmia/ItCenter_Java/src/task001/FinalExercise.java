package task001;

import java.util.Scanner;

public class FinalExercise {
    public static void main(String[] args) {
        /**
         * Elaborar um programa que permita calcular o vencimento de um colaborador, bem como os descontos e
         * impostos decorrentes desse processamento salarial.
         * Conceitos:
         * a) Vencimento base = $40/dia
         * b) Subsidio alimentação = $5/dia
         * c) Retenção IRS = 10%
         * d) Segurança Social: 11% encargo funcionario e 23.7% engargo da empresa.
         * Deve ser solicitado ao usuário o código do funcionárioe o número de dias que ele trabalhou no mês.
         * Dados a apresentar>
         * - Valor Bruto a receber
         * - Total Subisidio de alimentação
         * - Valor total a entregar Segurança Social(Empresa e Encarregado)
         * - Valor líquido a receber pelo funcinário
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);


        // Declaration of variables
        double salarioBrutoFinal, salarioLiquidoFinal, retencaoIRS;
        double totalSegurancaSocialFuncionario, totalSegurancaSocialEmpresa;
        int codigoFuncionario = 0, totalDiasTrabalhado = 0, valeAlimentacao;

        // Data input by the user
        System.out.print("Employee code: ");
        codigoFuncionario = input.nextInt();
        System.out.print("Total work days: ");
        totalDiasTrabalhado = input.nextInt();

        // Calcule for results
        salarioBrutoFinal = totalDiasTrabalhado * 40;
        valeAlimentacao = totalDiasTrabalhado * 5;
        totalSegurancaSocialFuncionario = (salarioBrutoFinal * 11 / 100);
        totalSegurancaSocialEmpresa = (salarioBrutoFinal * 23.7 / 100);
        retencaoIRS = (salarioBrutoFinal * 10 / 100);
        salarioLiquidoFinal = (salarioBrutoFinal - totalSegurancaSocialFuncionario - retencaoIRS) + valeAlimentacao;

        // Final data
        System.out.println("Gross amount = $" + salarioBrutoFinal);
        System.out.println("Meal Ticket = $" + valeAlimentacao);
        System.out.println("Segurança Social for the emplyee = $" + totalSegurancaSocialFuncionario);
        System.out.println("Segurança Social for the company = $" + totalSegurancaSocialEmpresa);
        System.out.println("Employee's salary = $" + salarioLiquidoFinal);
    }
}
