import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("values of a and b after swaping : ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}