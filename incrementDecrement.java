//increment and decrement operators
public class Main {
	public static void main(String[] args) {
		int a = 10;
	System.out.println("original value :"+a);//10
	System.out.println("post increment : "+(a++));//10
   System.out.println("After post increment : "+a);//11
   System.out.println("pre incrememt : "+(++a));//12
   System.out.println("post decrement : "+(a--));//12
   System.out.println("After post decrement :"+a);//11
   System.out.println("pre decrement : "+(--a));//10
	}
}