package Lab5;

public class Square extends Shape {
    
    public Square(double width, double height) {
        super(width, height);
    }

    public double area() {
        System.out.println("Inside Area for Square.");
        return super.dim1 * super.dim2;
    }
    
}
