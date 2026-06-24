//char-->ascii
//convert ascii--> char
import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	int ascii = ch;//type conversion
	char character = (char)ascii;//type casting
	System.out.println("char------->ascii : "+ascii);
	System.out.println("ascii------>char : "+character);
	}
}