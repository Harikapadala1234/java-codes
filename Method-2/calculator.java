package Methods;

public class calculator {
	public static int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public static int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public static int div(int a,int b) {
		int div=a/b;
		return div;
	}
	public static int rem(int a,int b) {
		int rem=a%b;
		return rem;
	}
public static void main(String[] args) {
	int a=10,b=20;
	System.out.println("Addition Of Two Numbers : "+add(a,b));
	System.out.println("Substraction of Two Numbers : "+sub(a,b));
	System.out.println("Multiplication of Two Numbers : "+mul(a,b));
	System.out.println("Division of Two Numbers : "+div(a,b));
	System.out.println("Modulus of Two Numbers : "+rem(a,b));
	
}
}
