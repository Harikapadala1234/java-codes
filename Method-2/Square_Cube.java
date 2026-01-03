package Methods;

public class Square_Cube {
	public static double square(int n) {
		double square=Math.sqrt(n);
		return square;
	}
	public static int cube(int n) {
		int cube= (int)Math.pow(n,3);
		return cube;
	}
public static void main(String[] args) {
	System.out.println("Square : " +square(4));
	System.out.println("Cube : "+cube(2));
}
}
