public class TestShape {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5.00, length = 7.00;
        Shape rectangle = new Rectangle(width, length);
        System.out.printf("\nRectangle width %.2f %.2f: ",width,length);
        System.out.printf("\nResulting area: %.2f: ", rectangle.area() );


       //Square test
        double side = 5.00;
        Shape square = new Square(side);
        System.out.printf("\nSquare side %.2f: ", side);
        System.out.printf("\nResulting area: %.2f: ", square.area() );


        // Circle test
        double radius = 5.00;
        Shape circle = new Circle(radius);
        System.out.printf("\nCircle radius: %.2f ", radius);
        System.out.printf("\nResulting Area: %.2f ", circle.area());



        // Triangle test
        double base = 5.00, height = 4.00;
        Shape triangle = new Triangle(base,height);
        System.out.printf("\nTriangle base and height %.2f %.2f: ",base,height);
        System.out.printf("\nResulting area: %.2f: ", triangle.area() );


    }
}