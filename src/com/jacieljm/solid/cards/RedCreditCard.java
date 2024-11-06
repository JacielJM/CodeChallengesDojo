package com.jacieljm.solid.cards;

public class RedCreditCard implements Card, CreditCardOnly {
    @Override
    public String doTransaction(int amount) {
        return amount + " txn done with credit card";
    }

    @Override
    public void splitPaymentInMonths(String acctNum, long amount, int months) {

    }

    @Override
    public String retention(String acctNum, long amount) {
        return amount + " retention done with credit card";
    }
}
