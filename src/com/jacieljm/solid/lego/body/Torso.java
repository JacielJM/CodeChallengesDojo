package com.jacieljm.solid.lego.body;

public class Torso implements BodyComponent {
    private String color;

    public Torso(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
