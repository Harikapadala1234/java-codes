public class Variables{
public static void main(String args[]){
String name="Harika";
System.out.println(name);
System.out.println("Swap of two numbers");
int a=10;
int b=20;
System.out.println("Before Swap of two numbers: "+a+"\t"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swap of two numbers: "+a+"\t"+b);
int s=10;
System.out.println("First Assign Value: "+s);
s=20;
System.out.println("After change the value: "+s);
int p=20,q=10,r=30;
System.out.println("p: "+p+"\tq: "+q+"\tr: "+r);
int c=30;
System.out.println("c is int data type");
int i=10;
float f=10.20f;
String str="Hello";
boolean bool=true;
System.out.println("int value: "+i+"\n"+"float value: "+f+"\n"+"String value: "+str+"\n"+"Boolean value: "+bool);
System.out.println("Addition: "+(p+q));
System.out.println("Substraction: "+(p-q));
System.out.println("Multiplication: "+(p*q));
System.out.println("Division: "+(p/q));
}}