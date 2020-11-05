package swea;

import java.util.Scanner;

public class exam_10_23_10726 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N,M;
			N = sc.nextInt();
			M = sc.nextInt();
			String res = "ON";
			if(M == 0) {
				res = "OFF";
			}else {
				
				String str = "";
				while(M/2 > 0) {
					
					str += Integer.toString(M%2);
					M = M/2;
				}
				
			if(M==1) {
				str += "1";
			}
			
			String newStr = "";
			
			for(int i=str.length()-1; i>=0; i--) {
				newStr += str.charAt(i);
			}
			
			for(int i=newStr.length()-1; i>=str.length()-N; i--) {
					if(newStr.charAt(i)-'0' == 0) {
						res = "OFF";
						
					}
				}
			}
			System.out.println("#"+test_case+" "+res);
		}
	}
}
