package com.jacieljm.solid.lego.head;

public class Hair implements HeadComponent {
    private String color;
    private String length;

    public Hair(String color, String length) {
        this.color = color;
        this.length = length;
    }

    public Hair(String color) {
        this.color = color;
        this.length = "Medium";
    }

    public String getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getExpression() {
        return "Neutral";
    }
}
