package com.secend_Package.exerciseCashMachine;

public class Transaction {
    private boolean isWitdraw;
    private int availabeAmount;
   private int myAmount;
    public Transaction(int amount, int availableAmount) {
        this. myAmount = amount;
        this.availabeAmount = availableAmount;
        if (amount >= 0) {
            deposit(amount);
        } else {
            withdraw(amount);
        }
    }

    public int getMyAmount() {
        return myAmount;
    }

    public void deposit(int amount) {
        isWitdraw = false;
        availabeAmount+=amount;
    }

    public void withdraw(int amount) {
        if (availabeAmount > amount) {
            isWitdraw = true;
            availabeAmount -= amount;
        }
    }


    public boolean isWitdraw() {
        return isWitdraw;
    }
}
