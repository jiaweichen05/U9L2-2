public class Shape {
    private int numSides;
    private String color;

    public Shape(int numSides, String color) {
        this.numSides = numSides;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getNumSides() {
        return numSides;
    }

    public boolean isAPolygon()
    {
        if (numSides < 3)
        {
            return false;
        }
        return true;
    }

}
