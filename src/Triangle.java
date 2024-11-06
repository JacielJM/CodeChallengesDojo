public class Triangle implements ShapeJM {
    private double baseLength;
    private double heightLength;

    public Triangle(double baseLength, double heightLength) {
        this.baseLength = baseLength;
        this.heightLength = heightLength;
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
        return (getBaseLength()*getHeightLength())/2;
    }
}
