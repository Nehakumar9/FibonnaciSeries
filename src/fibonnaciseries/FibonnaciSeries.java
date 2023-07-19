package fibonnaciseries;

import java.util.Scanner;

public class FibonnaciSeries {

	public static int FibonnaciSeries(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return FibonnaciSeries(n-1)+FibonnaciSeries(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int results = FibonnaciSeries(n);
		System.out.println(results);
	}

}
