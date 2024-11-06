package com.jacieljm.solid.cards;

public interface DebitCardOnly {
    void deposit(String acctNum, long amount);

    void withdraw(String acctNum, long amount);
}
