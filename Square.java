public class Square extends Shape {
    private final double side; //sides

    public Square() {
        this(1);
    }
    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        // A = l * l
        return side*side;
    }
}