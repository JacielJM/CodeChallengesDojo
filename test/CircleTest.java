import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private final Circle circle = new Circle();

    @Test
    void shouldInitializeWithDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(0, circle.getRadiusLength());
    }

    @Test
    void shouldInitializeWithParameterizedConstructor() {
        double radius = 5.0;
        Circle circle = new Circle(radius);
        assertEquals(radius, circle.getRadiusLength());
    }

    @Test
    void shouldSetRadiusLength() {
        Circle circle = new Circle();
        double radius = 7.5;
        circle.setRadiusLength(radius);
        assertEquals(radius, circle.getRadiusLength());
    }

    @Test
    void shouldGetRadiusLength() {
        double radius = 3.3;
        Circle circle = new Circle(radius);
        assertEquals(radius, circle.getRadiusLength());
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2.3, 3.8, 4, 5.0, 6, Double.MAX_VALUE})
    void shouldCalculateCircleAreaWithPositiveValue(double radius) {
        circle.setRadiusLength(radius);
        double area = circle.getArea();
        assertTrue(area > 0);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1, -2, -3.3, -4.6, -5.9, 0})
    void shouldNotCalculateInvalidArea(double radius) {
        circle.setRadiusLength(radius);
        assertThrows(InvalidParameterException.class, circle::getArea);
    }
}