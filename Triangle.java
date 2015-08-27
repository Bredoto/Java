public class Triangle extends Shape {
    private final double base, height; 

    public Triangle() {
        this(1,1);
    }
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        double s = 0.5*base*height;
        return s;
    }
 
}