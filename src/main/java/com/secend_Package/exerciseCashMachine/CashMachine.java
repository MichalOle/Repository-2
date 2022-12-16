package com.secend_Package.exerciseCashMachine;

import java.lang.reflect.Array;

import static java.lang.Math.abs;

public class CashMachine {
    private int size;
    private double[] tabOfTransactions;
    private double transactionsTotal;
    private double depositsSum;
    private double withdrawsSum;
    private String cashMachineName;
    private double saldoOfCashMachine = 1000000;
    private int numberOfTransactions;


    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine("ul. Królewska 23");
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-4300);
        cashMachine.addTransaction(-6300);
        cashMachine.addTransaction(-2300);
        cashMachine.addTransaction(-1000);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(-500);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(0);

        System.out.println(cashMachine.cashMachineName);

        cashMachine.getDepositSum();
        cashMachine.getTransactionsTotal();
        cashMachine.getWithdrawsSum();

        System.out.println(cashMachine.getNumberOfTransactions());

        cashMachine.getSaldoOfCashMachineAndRestInformations();
//        Bank bank = new Bank();
    }

    public CashMachine(String cashMachine) {
        this.size = 0;
        this.tabOfTransactions = new double[0];
        this.cashMachineName = cashMachine;

    }

    public double[] getTabOfTransactions() {
        return tabOfTransactions;
    }

    public void addTransaction(double amountOfTransaction) {
        if (amountOfTransaction != 0) {
            this.size++;
            double[] newTab = new double[this.size];
            System.arraycopy(tabOfTransactions, 0, newTab, 0, tabOfTransactions.length);
            newTab[this.size - 1] = amountOfTransaction;
            this.tabOfTransactions = newTab;

        } else {
            System.out.println("Nie mozna wykonac pustego przelewu/wplaty");
        }
    }

    public void getTransactionsTotal() {
        double sum = 0;
        for (int i = 0; i < tabOfTransactions.length; i++) {

            if (tabOfTransactions[i] == 0) {
            } else {
                sum += tabOfTransactions[i];
            }
        }
        transactionsTotal = sum;
        System.out.println(transactionsTotal);
    }

    public void getDepositSum() {
        double sum = 0;
        for (double tabOfTransaction : tabOfTransactions) {
            if (tabOfTransaction != 0) {
                if (tabOfTransaction > 0) {
                    sum += tabOfTransaction;
                }
            }
        }
        depositsSum = sum;
        System.out.println(depositsSum);
    }

    public void getWithdrawsSum() {
        double sum = 0;
        for (int i = 0; i < tabOfTransactions.length; i++) {
            if (tabOfTransactions[i] == 0) {
            } else if (tabOfTransactions[i] < 0) {
                sum += tabOfTransactions[i];
            }
        }
        depositsSum = sum;
        System.out.println(depositsSum);
    }

    public int getNumberOfTransactions() {
        numberOfTransactions = tabOfTransactions.length;
        return numberOfTransactions;
    }

    public void getSaldoOfCashMachineAndRestInformations() {
        System.out.println("Saldo bankomatu " + cashMachineName + " wynosiło początkowo 1 000 000 zł");
        System.out.println("Od rana zrealizowano " + numberOfTransactions + " transakcji.");
        System.out.println("Aktualnie saldo wynosi " + (saldoOfCashMachine - abs(transactionsTotal)));
    }
}
