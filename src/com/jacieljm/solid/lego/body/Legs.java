package com.jacieljm.solid.lego.body;

public class Legs implements BodyComponent {
    private String color;

    public Legs(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
