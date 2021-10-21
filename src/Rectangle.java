public class Rectangle extends Shape {
    private double xCord;
    private double yCord;
    private double rHeight;
    private double rWidth;

    public Rectangle(double xCord, double yCord, double rHeight, double rWidth) {
        xCord = 1.0;
        yCord = 1.0;
        rHeight = 1.0;
        rWidth = 1.0;
    }

    public double getWidth() {
        if (rWidth < 1)
            return 1;
        else
            return rWidth;
    }

    public double getHeight() {
        if (rHeight < 1)
            return 1;
        else
            return rHeight;
    }

    public double getCord() {
        return xCord + yCord;
    }

   // public double gety() {
      //  return yCord;
    //}

    @Override
    public double area() {
        return rHeight * rWidth;
    }

    @Override
    public double perimeter() {
        return (rHeight * 2) + (rWidth * 2);
    }

    public String toString() {
        return ("Rectangle (" + String.format("%2.f", getCord() + "," + getHeight() + ","
                + getWidth()) + ")");
    }
}

