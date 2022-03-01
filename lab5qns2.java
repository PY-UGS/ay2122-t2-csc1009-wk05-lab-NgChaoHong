package Lab5;

public class lab5qns2 {
    public static void main(String[] args){

        Rectangle2 r = new Rectangle2(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle2 c = new Circle2(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);       
        Shape figref;

        figref = r;
        System.out.println("Area of Rectangle is " + figref.area());

        figref = t;
        System.out.println("Area of Triangle is " + figref.area());

        figref = c;
        System.out.println("Area of Circle is " + figref.area());

        figref = e;
        System.out.println("Area of Ellipse is " + figref.area());
        
        figref = s;
        System.out.println("Area of Square is " + figref.area());

    }
    
}
