package com.jacieljm.lambdas;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeValidator {
    public static IntPredicate isPrime = num -> num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
}
