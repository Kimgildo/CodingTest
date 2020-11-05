package exam;

import java.util.Scanner;

public class exam1_pibonachi {
	
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}else if(n==1){
			return 1;
		}else {
			return fibo(n-1)+fibo(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}
}
