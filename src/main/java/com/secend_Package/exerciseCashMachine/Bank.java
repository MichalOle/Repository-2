package com.secend_Package.exerciseCashMachine;

public class Bank {
    private int index = 0;
    private CashMachine[] listOfCashMachines = new CashMachine[50];
    private double[] tabOfTransactions;
    private String cashMachine;
    private int numberOfMachines = 1;
    private double saldo;

    public Bank(String cashMachine){
        this.tabOfTransactions = new double[0];
        this.cashMachine = "Cash Machine " + this.numberOfMachines;
        this.numberOfMachines++;
        this.saldo = 1000000;
    }

    public void addCashMachine(CashMachine cashMachine){

        if(listOfCashMachines.length == 0){
            listOfCashMachines[index] = cashMachine;
            index++;
        }
        else if ( listOfCashMachines.length != 0 && listOfCashMachines.length <= 50){
            listOfCashMachines[index] = cashMachine;
            index++;
        }

    }
    // Nie wyświetla pozycji w Stringu tylko Bank@122hbshsa
    public void getListOfCashMachines(){
        for (int i = 0; i < listOfCashMachines.length; i++){
            System.out.println(listOfCashMachines[i]);
        }
    }


    public Bank() {

    }
}
