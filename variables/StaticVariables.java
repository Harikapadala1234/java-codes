package variables;

public class StaticVariables {
	 static byte b1=123;
	 static short s1=134;
	 static int i1=132546;
	 static long l1=1312476898;
	 static float f1=122.24f;
	 static double d1=1567.3456;
	 static char ch='%';
	 static boolean b=true;
	
	public static void main(String[] args) {
		System.out.println("Byte:"+b1+"\n"+"Short:"+s1+"\n"+"Int:"+i1+"\n"+"Long:"+l1+"\n"+"Float:"+f1+"\n"+"Double:"+d1+"\n"+"Char:"+ch+"\n"+"Boolean:"+b);
		System.out.println(StaticVariables.b1);//by using className w e can access 
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(ch);
		System.out.println(b);
        //sum();
	}

}
