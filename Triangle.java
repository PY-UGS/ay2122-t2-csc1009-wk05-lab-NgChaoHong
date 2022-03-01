package Lab5;

public class Triangle extends Shape {
    private double width, height;

    public Triangle(double width, double height) {
        super(width, height);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        System.out.println("Inside Area for Triangle.");
        return height * width * 0.5;
    }
    
}
