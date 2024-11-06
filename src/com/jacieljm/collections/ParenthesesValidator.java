package com.jacieljm.collections;
import java.util.Stack;

public class ParenthesesValidator {

    public static boolean isValidChain(String s) {
        Stack<Character> parenthesesStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                parenthesesStack.push(c);
            } else {
                if (parenthesesStack.isEmpty()) {
                    return false;
                }
                char top = parenthesesStack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return parenthesesStack.isEmpty();
    }
}