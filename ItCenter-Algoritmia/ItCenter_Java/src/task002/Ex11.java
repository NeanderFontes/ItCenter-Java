package task002;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        /**
         * 11. Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
         * (montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
         * mantém positivo depois da operação.
         */

        // Scanner input for data
        Scanner input = new Scanner(System.in);

        // Declaration of variables
        double amountValue = 0, amountDeposit = 0, amountWithdraw = 0, finalAmount = 0;
        boolean openAccount = false;
        int userOption;

        // Input data by the user
        System.out.println("------------ Check Bank ------------");
        System.out.println("[ 1 ] - Open Account");
        System.out.println("[ 0 ] - Cancel");
        System.out.println("------------------------------------");
        System.out.print("Please chose an option above: ");
        userOption = input.nextInt();

        if (userOption == 1) {
            openAccount = true;
            System.out.println("******** Welcome to your Bank ********");
            System.out.println("------------ Check Bank ------------");
            System.out.println("[ 1 ] - Bank Balance");
            System.out.println("[ 2 ] - Amount to Deposit");
            System.out.println("[ 3 ] - Amount to Withdraw");
            System.out.println("------------------------------------");
            System.out.print("Please chose an option above: ");
            userOption = input.nextInt();

            switch (userOption) {
                case 1:
                    System.out.println("Current balance $" + finalAmount);
                    System.out.println("Sorry, but you just opened the account");
                    System.out.println("Do you want deposit any amount?");
                    System.out.println("------------ Check Bank ------------");
                    System.out.println("[ 1 ] - Yes");
                    System.out.println("[ 2 ] - No");
                    System.out.println("------------------------------------");
                    System.out.print("Please chose an option above: ");
                    userOption = input.nextInt();
                    if (userOption == 1) {
                        System.out.print("Ok! who much is it? $");
                        finalAmount = input.nextDouble();
                        System.out.println("Current balance $" + finalAmount);
                        System.out.println("------------ Check Bank ------------");
                        System.out.println("[ 1 ] - Amount to Deposit");
                        System.out.println("[ 2 ] - Amount to Withdraw");
                        System.out.println("[ 0 ] - Finish operation");
                        System.out.println("------------------------------------");
                        System.out.print("Please chose an option above: ");
                        userOption = input.nextInt();
                        if (userOption == 1) {
                            System.out.print("Ok! who much is it? $");
                            amountDeposit = input.nextDouble();
                            finalAmount += amountDeposit;
                        } else if (userOption == 2) {
                            System.out.print("Ok! who much is it? $");
                            amountWithdraw = input.nextDouble();
                            if (amountWithdraw >= 0 && amountWithdraw <= finalAmount) {
                                finalAmount -= amountWithdraw;
                            } else if (amountWithdraw < 0) {
                                amountWithdraw = 0;
                                System.out.println("Invalid value!");
                            } else {
                                System.out.println("Sorry, insufficient balance to withdraw!");
                            }
                        } else {
                            System.out.println("I hope see you soon!");
                            input.close();
                        }
                    } else {
                        System.out.println("I hope see you soon!");
                    }
                    break;
                case 2:
                    System.out.println("Current balance $" + finalAmount);
                    System.out.print("Ok! who much is it? $");
                    amountDeposit = input.nextDouble();
                    finalAmount += amountDeposit;
                    break;
                case 3:
                    System.out.println("Current balance $" + finalAmount);
                    System.out.println("Sorry, but you don't have enough balance in your account");
                    System.out.println("Do you want deposit any amount?");
                    System.out.println("------------ Check Bank ------------");
                    System.out.println("[ 1 ] - Yes");
                    System.out.println("[ 2 ] - No");
                    System.out.println("------------------------------------");
                    System.out.print("Please chose an option above: ");
                    userOption = input.nextInt();
                    if (userOption == 1) {
                        System.out.print("Ok! who much is it? $");
                        finalAmount = input.nextDouble();
                        System.out.println("Current balance $" + finalAmount);
                        System.out.println("------------ Check Bank ------------");
                        System.out.println("[ 1 ] - Amount to Deposit");
                        System.out.println("[ 2 ] - Amount to Withdraw");
                        System.out.println("[ 0 ] - Finish operation");
                        System.out.println("------------------------------------");
                        System.out.print("Please chose an option above: ");
                        userOption = input.nextInt();
                        if (userOption == 1) {
                            System.out.print("Ok! who much is it? $");
                            amountDeposit = input.nextDouble();
                            finalAmount += amountDeposit;
                        } else if (userOption == 2) {
                            System.out.print("Ok! who much is it? $");
                            amountWithdraw = input.nextDouble();
                            if (amountWithdraw >= 0 && amountWithdraw <= finalAmount) {
                                finalAmount -= amountWithdraw;
                            } else if (amountWithdraw < 0) {
                                amountWithdraw = 0;
                                System.out.println("Invalid value!");
                            } else {
                                System.out.println("Sorry, insufficient balance to withdraw!");
                            }
                        } else {
                            System.out.println("I hope see you soon!");
                            input.close();
                        }
                    } else {
                        System.out.println("I hope see you soon!");
                    }
                    break;
                default:
            }
        } else if (userOption == 0) {
            System.out.println("Bye!");
        } else {
            System.out.println("Invalid Option, try again");
        }


        // Final data
        if (!openAccount) {
            System.out.println("I Hope see you in next time to open your account with us!");
        } else {
            System.out.println("Thanks you! Final Current balance $" + finalAmount);
        }

        // Close the scanner to prevent resource leak
        input.close();
    }
}
