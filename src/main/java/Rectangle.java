public class Rectangle implements GeometricShape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, Double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return this.height * 2 + this.width * 2;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String getFillColor() {
        return this.fillColor;
    }

    @Override
    public String getBorderColor() {
        return this.borderColor;
    }
}

