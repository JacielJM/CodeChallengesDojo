package com.jacieljm.solid.lego.extras;

public class AccessoryImpl implements Accessory {
    private String name;
    private String color;

    public AccessoryImpl(String name) {
        this.name = name;
        this.color = "Black";
    }

    public AccessoryImpl(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }
}
