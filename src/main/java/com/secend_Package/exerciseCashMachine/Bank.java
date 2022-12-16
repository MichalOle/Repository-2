package com.secend_Package.exerciseCashMachine;

public class Bank {
    private int index = 0;
    private CashMachine[] listOfCashMachines = new CashMachine[50];
    private int totalOfTransactions;

    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine(1000);
        cashMachine1.executeTransaction(1000);
        System.out.println(cashMachine1.getTotalSumOfTrans());
        CashMachine cashMachine2 = new CashMachine(2000);
        cashMachine2.executeTransaction(1000);
        System.out.println(cashMachine2.getTotalSumOfTrans());

        Bank bank = new Bank();
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        bank.countTotalOfTransactions();
//        System.out.println(bank.getTotalOfTransactions());
    }

    public void add(CashMachine atm) {
        listOfCashMachines[index] = atm;
        index++;
    }

    public void countTotalOfTransactions() {
        System.out.println("sdasd");
        for (CashMachine listOfCashMachine : listOfCashMachines) {
            for (Transaction tabOfTransaction : listOfCashMachine.getTabOfTransactions()) {
                System.out.println(tabOfTransaction.getMyAmount());
            }
        }
    }

    public int getTotalOfTransactions() {
        return totalOfTransactions;
    }
}
