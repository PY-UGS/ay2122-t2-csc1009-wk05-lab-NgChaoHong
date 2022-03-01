package Lab5;
    

public class Circle2 extends Shape{

    private double radius, radius2;

    public Circle2(double radius, double radius2){
        super(radius, radius2);
        this.radius = radius;
        this.radius2 = radius2;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    public double area(){
        System.out.println("Inside Area for Circle.");
        return radius*radius2*Math.PI;
    }
    
}
