package com.jacieljm.solid.cards;

public interface CreditCardOnly {
    void splitPaymentInMonths(String acctNum, long amount, int months);

    String retention(String acctNum, long amount);
}
