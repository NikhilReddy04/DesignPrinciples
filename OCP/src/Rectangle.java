public class Rectangle implements Shape{
    double length, breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}