public class Circle extends Shape{
    private double _x;
    private double _y;
    private double cRadius;

    public Circle (double x, double y, double Radius) {
        _x = x;
        _y = y;
        cRadius = Radius;
    }

        public double getx(){
            return _x;
    }

    public double gety(){
        return _y;
    }

    public double getRadius(){
        return cRadius;
    }

    @Override
    public double area() {
        return Math.PI * cRadius * cRadius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * cRadius;
    }

    public String toString() {
        return ("Circle (" + getx() + ","+ gety() +","+ getRadius() + ")");
    }
}
