package Lab5;

public class Ellipse extends Shape {

   public Ellipse (double semiMajor, double semiMinor){
        super(semiMajor, semiMinor);
    }
    
    public double area() {
        System.out.println("Inside Area for Ellipse");
        return super.PI * super.dim1 * super.dim2;
    }

}