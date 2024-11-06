package com.jacieljm.solid.lego.head;

public class Head implements HeadComponent {
    private String expression;

    public Head(String expression) {
        this.expression = expression;
    }

    @Override
    public String getExpression() {
        return expression;
    }
}
