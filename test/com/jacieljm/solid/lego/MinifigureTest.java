package com.jacieljm.solid.lego;

import com.jacieljm.solid.lego.body.Legs;
import com.jacieljm.solid.lego.body.Torso;
import com.jacieljm.solid.lego.extras.Accessory;
import com.jacieljm.solid.lego.extras.AccessoryImpl;
import com.jacieljm.solid.lego.head.Head;
import com.jacieljm.solid.lego.head.Hair;
import com.jacieljm.solid.lego.head.Hat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinifigureTest {

    private Minifigure minifigure;

    @BeforeEach
    void setUp() {
        Head head = new Head("smile");
        Torso torso = new Torso("blue");
        Legs legs = new Legs("black");
        minifigure = new Minifigure.MinifigureBuilder(head, torso, legs).build();
    }

    @Test
    void shouldBuildMinifigureWithRequiredAttributes() {
        assertNotNull(minifigure);
    }

    @Test
    void shouldBuildMinifigureWithHair() {
        Hair hair = new Hair("short", "brown");
        minifigure = new Minifigure.MinifigureBuilder(minifigure.getHead(), minifigure.getTorso(), minifigure.getLegs())
                .withHair(hair)
                .build();
        assertEquals(hair, minifigure.getHair());
    }

    @Test
    void shouldBuildMinifigureWithHat() {
        Hat hat = new Hat("red", "cap");
        minifigure = new Minifigure.MinifigureBuilder(minifigure.getHead(), minifigure.getTorso(), minifigure.getLegs())
                .withHat(hat)
                .build();
        assertEquals(hat, minifigure.getHat());
    }

    @Test
    void shouldHaveHeadExpression() {
        String expectedExpression = "smile";
        assertEquals(expectedExpression, minifigure.getHead().getExpression());
    }

    @Test
    void shouldHaveTorsoWithColor() {
        String expectedColor = "blue";
        assertEquals(expectedColor, minifigure.getTorso().getColor());
    }

    @Test
    void shouldHaveLegsWithColor() {
        String expectedColor = "black";
        assertEquals(expectedColor, minifigure.getLegs().getColor());
    }

    @Test
    void shouldReturnAccessories() {
        Accessory accessory = new AccessoryImpl("sword");
        minifigure.addAccesories(accessory);
        assertTrue(minifigure.getAccesories().contains(accessory));
        assertEquals(1, minifigure.getAccesories().size());
        assertEquals(accessory.getName(), minifigure.getAccesories().get(0).getName());
    }

    @Test
    void shouldAddAccessories() {
        Accessory accessory1 = new AccessoryImpl("shield");
        Accessory accessory2 = new AccessoryImpl("helmet");
        minifigure.addAccesories(accessory1);
        minifigure.addAccesories(accessory2);
        assertTrue(minifigure.getAccesories().containsAll(Arrays.asList(accessory1, accessory2)));
        assertEquals(2, minifigure.getAccesories().size());
        assertEquals(accessory1.getName(), minifigure.getAccesories().get(0).getName());
        assertEquals(accessory2.getName(), minifigure.getAccesories().get(1).getName());
    }

    @Test
    void shouldPrintMinifigureDescription() {
        String expectedDescription = "\nMinifigure Description:\n  Head: smile\n  Torso: blue\n  Legs: black";
        assertEquals(expectedDescription, minifigure.printDescription());
    }
}