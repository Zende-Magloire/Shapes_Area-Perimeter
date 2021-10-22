public class Rectangle extends Shape {
    private double xCord;
    private double yCord;
    private double rHeight;
    private double rWidth;

    public Rectangle(double x, double y, double Height, double Width) {
        xCord = x;
        yCord = y;
        rHeight = Height;
        rWidth = Width;
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

    public double getx() {
        return xCord;
    }

    public double gety() {
        return yCord;
    }

    @Override
    public double area() {
        return rHeight * rWidth;
    }

    @Override
    public double perimeter() {
        return (rHeight * 2) + (rWidth * 2);
    }

    public String toString() {
        return ("Rectangle (" + getx() + ","+ gety() +","+ getHeight() +","+ getWidth() + ")");
    }
}