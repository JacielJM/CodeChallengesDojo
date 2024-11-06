import java.security.InvalidParameterException;

public class Rectangle implements ShapeJM {
    private double baseLength;
    private double heightLength;

    public Rectangle(double baseLength, double heightLength) {
        this.baseLength = baseLength;
        this.heightLength = heightLength;
    }

    public Rectangle() {
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeightLength() {
        return heightLength;
    }

    public void setHeightLength(double heightLength) {
        this.heightLength = heightLength;
    }

    @Override
    public double getArea() {
        if (getHeightLength() <= 0 || getBaseLength() <= 0) {
            throw new InvalidParameterException("Area cannot be negative");
        }
        return getBaseLength()*getHeightLength();
    }
}
