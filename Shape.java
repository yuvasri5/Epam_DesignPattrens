import java.util.Scanner;

public class Shape {
	public static void main(String arg[])
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle : ");
        double l= sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(l,b);
        System.out.println("Enter side of the square : ");
        double side = sc.nextDouble();
        Square s = new Square(side);
        System.out.println("Enter radius of the circle : ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        
        System.out.println("Rectangle Area : " + r.getArea());
        System.out.println("Square Area : " + s.getArea());
        System.out.println("Circle Area : " + c.getArea());
        System.out.println();
        
        if ((r.getArea() > c.getArea()) && (r.getArea() > s.getArea()))
        {
            System.out.println("Rectangle has the largest area.");
        }
        else if( s.getArea() > c.getArea() )
        {
            System.out.println("Square has the largest area.");
        }
        else
        {
            System.out.println("Circle has the largest area.");
        }    
    }
}
