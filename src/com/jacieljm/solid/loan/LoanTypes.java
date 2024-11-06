package com.jacieljm.solid.loan;

public class LoanTypes {
    public static final LoanType homeLoan = () -> 0.05;
    public static final LoanType personalLoan = () -> 0.25;
    public static final LoanType autoLoan = () -> 0.10;
}
