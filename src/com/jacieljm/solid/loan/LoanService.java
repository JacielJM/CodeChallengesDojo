package com.jacieljm.solid.loan;

public class LoanService {
    public long getInterestInfo(String accountNumber, LoanType loanType){
        System.out.printf("Account number %s has an interest rate of %s", accountNumber, loanType.getLoanInterestInfo());
        return 0;
    }
}
