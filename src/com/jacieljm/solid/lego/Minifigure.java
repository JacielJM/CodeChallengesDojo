package com.jacieljm.solid.lego;

import com.jacieljm.solid.lego.body.Legs;
import com.jacieljm.solid.lego.body.Torso;
import com.jacieljm.solid.lego.extras.Accessory;
import com.jacieljm.solid.lego.head.Hair;
import com.jacieljm.solid.lego.head.Hat;
import com.jacieljm.solid.lego.head.Head;
import com.jacieljm.solid.lego.head.HeadComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Minifigure {
    private Hair hair;
    private Hat hat;
    private Head head;
    private Torso torso;
    private Legs legs;
    private List<Accessory> accesories;

    public HeadComponent getHair() {
        return hair;
    }

    public HeadComponent getHat() {
        return hat;
    }

    public Head getHead() {
        return head;
    }

    public Torso getTorso() {
        return torso;
    }

    public Legs getLegs() {
        return legs;
    }

    public List<Accessory> getAccesories() {
        return accesories;
    }

    private Minifigure(MinifigureBuilder builder) {
        this.hair = builder.hair;
        this.hat = builder.hat;
        this.head = builder.head;
        this.torso = builder.torso;
        this.legs = builder.legs;
        this.accesories = builder.accesories;
    }


    public void addAccesories(Accessory accessory) {
        if(accesories == null) {
            accesories = new ArrayList<>();
        }
        accesories.add(accessory);
    }

    public String printDescription() {
    StringBuilder description = new StringBuilder("\nMinifigure Description:");
    if (hair != null) {
        description.append(String.format("\n  Hair: %s %s", hair.getLength(), hair.getColor()));
    }
    if (hat != null) {
        description.append(String.format("\n  Hat: %s %s", hat.getColor(), hat.getStyle()));
    }
    description.append("\n  Head: ").append(head.getExpression());
    description.append("\n  Torso: ").append(torso.getColor());
    description.append("\n  Legs: ").append(legs.getColor());
    if (accesories != null && !accesories.isEmpty()) {
        description.append("\n  Accessories: ").append(accesories.stream().map(Accessory::getName).collect(Collectors.joining(", ")));
    }
    return description.toString();
}

    public static class MinifigureBuilder {
        //required attributes
        private Head head;
        private Torso torso;
        private Legs legs;

        //optional attributes
        private Hair hair;
        private Hat hat;
        private List<Accessory> accesories;

        public MinifigureBuilder(Head head, Torso torso, Legs legs) {
            this.head = head;
            this.torso = torso;
            this.legs = legs;
        }

        public MinifigureBuilder withHair(Hair hair){
            this.hair = hair;
            return this;
        }

        public MinifigureBuilder withHat(Hat hat){
            this.hat = hat;
            return this;
        }

        public MinifigureBuilder withAccessories(List<Accessory> accesories) {
            this.accesories = accesories;
            return this;
        }

        public Minifigure build() {
            return new Minifigure(this);
        }


    }
}
