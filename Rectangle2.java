package Lab5;

public class Rectangle2 extends Shape {

    private double height, length;
    
    public Rectangle2(double length, double height) {
        super(length, height);
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double area(){
        System.out.println("Inside Area for Rectangle");
        return length * height;
    }
    
}
