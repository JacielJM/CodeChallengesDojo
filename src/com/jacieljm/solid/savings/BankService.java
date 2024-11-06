package com.jacieljm.solid.savings;

public class BankService {

    public long deposit(long amount, String accountNumber){
        System.out.printf("Money has been added to your account: %s\n", accountNumber);
        System.out.println("Transaction amount:");
        return amount;
    }

    public long withdraw(long amount, String accountNumber){
        System.out.printf("Money had been withdrawn from your %s account\n", accountNumber);
        System.out.println("Transaction amount:");
        return amount;
    }


}
