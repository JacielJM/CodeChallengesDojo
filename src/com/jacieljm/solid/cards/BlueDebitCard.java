package com.jacieljm.solid.cards;

public class BlueDebitCard implements Card, DebitCardOnly {
    @Override
    public String doTransaction(int amount) {
        return amount + " trxn done with debit card";
    }

    @Override
    public void deposit(String acctNum, long amount) {

    }

    @Override
    public void withdraw(String acctNum, long amount) {

    }
}
