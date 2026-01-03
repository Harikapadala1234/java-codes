package Methods;

public class methodas {
	public  void Method() {
		int a=10;
		int b=20;
		System.out.println(a+" and "+b+" Addition "+" is "+(a+b)+"\n"+
		a+" and "+b+" Subtraction "+" is "+(a-b)+"\n"+
		a+" and "+b+" Multiplication "+" is "+a*b+"\n"+
		a+" and "+b+" Division "+" is "+a/b+"\n"+
		a+" and "+b+" Modulus "+" is "+a%b);
		Method1();
	}
	public void Method1() {
		int a=10;
		int b=20;
		System.out.println(a+" and "+b+" Addition "+" is "+(a+b)+"\n"+
		a+" and "+b+" Subtraction "+" is "+(a-b)+"\n"+
		a+" and "+b+" Multiplication "+" is "+a*b+"\n"+
		a+" and "+b+" Division "+" is "+a/b+"\n"+
		a+" and "+b+" Modulus "+" is "+a%b);
		
	
}
	
public static void main(String[] args) {
	methodas obj=new methodas();
obj.Method();
}
}
