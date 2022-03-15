public class Circle extends Shape{
    private int radius;

    public Circle(int numSides, String color, int radius) {
        super(numSides, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double calcCircumference()
    {
        return 2 * radius * Math.PI;
    }
}
