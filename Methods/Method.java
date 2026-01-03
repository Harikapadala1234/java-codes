package Methods;
public class Method {
	public static void add() {
		int a=20,b=10;
		System.out.println(a+" and "+b+" Addition "+" is "+(a+b));
	}
	public static void sub() {
		int a=20,b=10;
		System.out.println(a+" and "+b+" Subtraction "+" is "+(a-b));
	}
	public static void mul() {
		int a=20,b=10;
		System.out.println(a+" and "+b+" Multiplication "+" is "+a*b);
	}
	public static void div() {
		int a=20,b=10;
		System.out.println(a+" and "+b+" Division "+" is "+a/b);
	}
	public static void mod() {
		int a=20,b=10;
		System.out.println(a+" and "+b+" Modulus "+" is "+a%b);
	}
    public static void main(String[] args) {
	Method.add();
	Method.sub();
	Method.mul();
	Method.div();
	Method.mod();
	}
}
