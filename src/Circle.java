public class Circle extends Shape{
    private double _x;
    private double _y;
    private double cRadius;

    public Circle (double _x, double _y, double cRadius) {
        _x = 1.0;
        _y = 1.0;
        cRadius = 1.0;
    }

        public double getCords(){
            return _x + _y;
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
        return ("Circle (" + String.format("%2.f", getCords() + "," + getRadius()) + ")");
    }
}
