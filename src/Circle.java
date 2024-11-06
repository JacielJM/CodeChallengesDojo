import java.security.InvalidParameterException;

public class Circle implements ShapeJM {
    private double radiusLength;

    public double getRadiusLength() {
        return radiusLength;
    }

    public void setRadiusLength(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public Circle(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        if (getRadiusLength() <= 0){
            throw new InvalidParameterException("Area cannot be negative");
        }
        return Math.PI*(Math.pow(getRadiusLength(),2));
    }
}
