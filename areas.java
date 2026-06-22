//area of circle,rectangle,triangle
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int length = sc.nextInt();
int width = sc.nextInt();
int radius = sc.nextInt();
int height = sc.nextInt();
int breadth = sc.nextInt();
double circle = 3.14*radius*radius;
int rectangle = length*width;
double triangle = 0.5*breadth*height;
System.out.println("Area of circle : "+circle);
System.out.println("Area of rectangle : "+rectangle);System.out.println("Area of triangle : "+triangle);	
	}
}