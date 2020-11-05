package exam;

import java.util.Scanner;

public class exam1_pactorial {

	static long fibo(long n) {
		if(n==1) {
			return 1;
		}else {
			return n * fibo(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		long n = sc.nextLong();
		if(n == 0) {
			System.out.println(1);
		}else if(n>=0 && n<=12) {
			long ans = fibo(n);
			System.out.println(ans);
		}else
			System.out.println("다른 수 입력");
	}
	
}
