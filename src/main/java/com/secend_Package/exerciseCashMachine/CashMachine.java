package com.secend_Package.exerciseCashMachine;

import java.util.Arrays;

import static java.lang.Math.abs;

public class CashMachine {
    private int amountOfTransactions = 0;
    private int availableFounds = 0;
    private Transaction transaction;
    private Transaction[] tabOfTransactions = new Transaction[amountOfTransactions];
    private int numbOfDeposits;
    private int numbOfWithdraws;
    private int totalSumOfTrans;

    //    private double transactionsTotal;
//    private double depositsSum;
//    private double withdrawsSum;
//    private String cashMachineName;
//    private double actualSaldo = 1000000;
//    private int numberOfTransactions;
    public CashMachine(int availableFounds) {
        this.availableFounds = availableFounds;
    }

    public void executeTransaction(int amount) {
        if (amount < 0) {
            numbOfDeposits++;
        } else {
            numbOfWithdraws++;
        }

        Transaction transaction = new Transaction(amount, availableFounds);
        amountOfTransactions++;
        tabOfTransactions = Arrays.copyOf(tabOfTransactions, amountOfTransactions);
        tabOfTransactions[amountOfTransactions - 1] = transaction;

    }

    public int giveTotalOfTransactions() {
        for (Transaction tabOfTransaction : tabOfTransactions) {
            totalSumOfTrans += Math.abs(tabOfTransaction.getMyAmount());
        }
        return totalSumOfTrans;
    }

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(10000);
        cashMachine.executeTransaction(-1000);
        cashMachine.executeTransaction(1000);
        System.out.println(cashMachine.getAmountOfTransactions());
        System.out.println(cashMachine.getAvailableFounds());
        System.out.println(cashMachine.giveTotalOfTransactions());
    }

    public int getTotalSumOfTrans() {
        return totalSumOfTrans;
    }

    public int getAvailableFounds() {
        return availableFounds;
    }

    public int getAmountOfTransactions() {
        return amountOfTransactions;
    }

    public int getNumbOfDeposits() {
        return numbOfDeposits;
    }

    public int getNumbOfWithdraws() {
        return numbOfWithdraws;
    }

    public Transaction[] getTabOfTransactions() {
        return tabOfTransactions;
    }

    //    public void getSaldoOfCashMachineAndRestInformations() {
//        System.out.println("Saldo bankomatu " + cashMachineName + " wynosiło początkowo 1 000 000 zł");
//        System.out.println("Od rana zrealizowano " + numberOfTransactions + " transakcji.");
//        System.out.println("Aktualnie saldo wynosi " + (actualSaldo - abs(transactionsTotal)));
//    }
}
