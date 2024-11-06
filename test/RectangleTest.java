import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private final Rectangle rectangle = new Rectangle();

    @Test
    void shouldInitializeWithDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(0, rectangle.getBaseLength());
        assertEquals(0, rectangle.getHeightLength());
    }

    @Test
    void shouldInitializeWithParameterizedConstructor() {
        double base = 5.0;
        double height = 3.0;
        Rectangle rectangle = new Rectangle(base, height);
        assertEquals(base, rectangle.getBaseLength());
        assertEquals(height, rectangle.getHeightLength());
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 4.5, 10, 7})
    void shouldCalculatePositiveRectangleArea(double base) {
        rectangle.setBaseLength(base);
        rectangle.setHeightLength(2);
        double area = rectangle.getArea();
        assertTrue(area > 0);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-2, -4.5, 0, -3.1})
    void shouldNotCalculateInvalidArea(double base) {
        rectangle.setBaseLength(base);
        rectangle.setHeightLength(2);
        assertThrows(InvalidParameterException.class, rectangle::getArea);
    }
}