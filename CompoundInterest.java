
//Compound interest
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = sc.nextDouble();
		double t = sc.nextDouble();
		double r = sc.nextDouble();
		double total =p*Math.pow((1+r/100),t);
		double interest =total -p;
		System.out.println("Total Amount : "+total);
		System.out.println("Compound interest : "+interest);
	}
}