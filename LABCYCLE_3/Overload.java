
import java.util.*;

public class Overload {
	int a;
	int area;
	double y;
	
	void area(int l,int b) {
		int length = l;
		int breadth = b;
		a=length*breadth;
		System.out.println("->Area: "+a);
	}
	
	void area(int s) {
		int side = s;
		area = side * side;
		System.out.println("->Area: "+area);	
	}
	
	
	
	void area(double r) {
	    double radius = r;
		y = 3.14*radius*radius;
		System.out.println("->Area: "+y);	
	}
	
	
public static void main(String[] args)	{
	Overload obj = new Overload();
	Scanner sc = new Scanner(System.in);
	System.out.println("Area of different shapes using overloaded functions");
	System.out.println("\n____RECTANGLE____");
	System.out.println("Enter the length and breadth:");
	int l = sc.nextInt();
	int b = sc.nextInt();
	obj.area(l,b);
	System.out.println("\n____SQUARE____");
	System.out.println("->Enter the side:");
	int s = sc.nextInt();
	obj.area(s);
	System.out.println("\n____CIRCLE____");
	System.out.println("->Enter the radius:");
	double r = sc.nextDouble();
	obj.area(r);
	sc.close();
  }
	
}
