package Methods;

public class simpleinterest {
	public static double simpleInterest(double p,double r,double t) {
		double res=(p*r*t)/100;
		return res;
	}
public static void main(String[] args) {
	int res=(int)simpleInterest(1000,5,3);
	System.out.println("Simple Interest : "+res);
}

}
