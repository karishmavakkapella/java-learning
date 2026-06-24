//Average of three numbers
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	double average = (a+b+c)/3;
	System.out.println("average of three numbers is : "+average);
	}
}