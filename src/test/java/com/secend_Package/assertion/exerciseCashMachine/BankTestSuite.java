package com.secend_Package.assertion.exerciseCashMachine;

import com.secend_Package.exerciseCashMachine.Bank;
import com.secend_Package.exerciseCashMachine.CashMachine;
import org.junit.jupiter.api.Test;

public class BankTestSuite {

    @Test
    public void doItWorks(){
        Bank bank = new Bank();
        bank.addCashMachine(new CashMachine("Starachowice"));
        bank.addCashMachine(new CashMachine("Ostrowiec"));
        System.out.println(bank.getListOfCashMachinesValues());
    }

    }

