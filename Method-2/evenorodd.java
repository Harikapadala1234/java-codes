package Methods;

public class evenorodd {
	public static int even(int a) {
		if(a%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("odd Number");
		}
		return 0;
	}
	public static void main(String[] args) {
		int res=even(6);
		System.out.println(res);
	}

}
