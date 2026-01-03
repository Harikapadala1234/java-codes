package Methods;

public class studentres {
	public static int total(int e,int m,int t,int h,int s,int so) {
		int total=e+m+t+h+s+so;
		return total;
	}
	public static double avg(int e,int m,int t,int h,int s,int so) {
		int total=e+m+t+h+s+so;
		int avg=total/6;
		return avg;
	}
public static void main(String[] args) {
	int total=total(80,90,65,70,65,80);
	System.out.println("Total Marks : "+total);
	System.out.println("Average Marks : "+avg(80,90,65,70,65,80));
	
}
}
