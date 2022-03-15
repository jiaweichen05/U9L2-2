public class Rectangle extends Shape{
    private double sideLength1, sideLength2;


    public Rectangle(int numSides, String color, double sideLength1, double sideLength2) {
        super(numSides, color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    public double getSideLength1() {
        return sideLength1;
    }

    public double getSideLength2() {
        return sideLength2;
    }

    public double calcArea()
    {
        return sideLength1 * sideLength2;
    }
}
