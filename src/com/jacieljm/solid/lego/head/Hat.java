package com.jacieljm.solid.lego.head;

public class Hat implements HeadComponent {
    private String color;
    private String style;

    public Hat(String color, String style) {
        this.color = color;
        this.style = style;
    }

    public Hat(String color) {
        this.color = color;
        this.style = "Cap";
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getExpression() {
        return "Neutral";
    }
}
