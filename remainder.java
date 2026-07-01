//quotient and reminder
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int quotient = n/2;
		int remainder = n%2;
		System.out.println("quotient = "+quotient);
		System.out.println("remainder = "+remainder);
	}
}