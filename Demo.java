package variables;

public class Demo {
	 int a;
	 static int b;
     public static void main(String[] args) {
	   Demo obj1=new Demo();
	   Demo obj2=new Demo();
	    obj1.a=10;
	    obj2.a=20;
	    obj2.b=100;
	    int a=30;
	    System.out.println("Local Variable:"+a);
	    System.out.println("Instance Variable:"+"Obj1: "+obj1.a+"\n"+"Obj2: "+obj2.a);
	    System.out.println("Static Variable:"+Demo.b);
	     }
}
