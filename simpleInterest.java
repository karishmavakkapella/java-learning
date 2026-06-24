
//simple interest
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p =  sc.nextInt();//principle amount
		int r = sc.nextInt();//interest
		int t = sc.nextInt();//time
	int SI =(p*t*r)/100;
	int total = SI+p;
	System.out.println("simple interest : "+SI);
	System.out.println("total : "+total);
	}
}