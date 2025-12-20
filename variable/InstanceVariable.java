package variables;

public class InstanceVariable {

	byte b1=23;
    short s1=1234;
	int i1=123;
	long l1=1234567877l;
	float f1=123.456f;
	double d1=123.467;
	char ch='$';
	boolean b=true;
	
	public static void main(String[] args) {
		InstanceVariable o=new InstanceVariable();
		System.out.println("Byte:"+o.b1+"\n"+"Short:"+o.s1+"\n"+"Int:"+o.i1+"\n"+"Long:"+o.l1+"\n"+"Float:"+o.f1+"\n"+"Double:"+o.d1+"\n"+"Char:"+o.ch+"\n"+"Boolean:"+o.b);
		System.out.println(o.b1);
		System.out.println(o.s1);
		System.out.println(o.i1);
		System.out.println(o.l1);
		System.out.println(o.f1);
		System.out.println(o.d1);
		System.out.println(o.ch);
		System.out.println(o.b);

	}

}
