package com.jacieljm.lambdas;

import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> colors = List.of("Red", "GREEN", "Blue", "Pink");

        List<String> lowerCaseColors = colors.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        List<String> upperCaseColors = colors.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(lowerCaseColors); // [red, green, blue, pink]
        System.out.println(upperCaseColors); // [RED, GREEN, BLUE, PINK]
    }
}
