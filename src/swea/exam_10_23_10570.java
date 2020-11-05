package swea;

import java.util.Scanner;

public class exam_10_23_10570 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int A, B;
			int count =0;
			A = sc.nextInt();
			B = sc.nextInt();
			for(int i = A; i<=B; i++) {
				String str = Integer.toString(i);
				String newStr = "";
				for(int j = str.length()-1; j>=0; j--) {
					newStr += str.charAt(j);
				}
				double sqrtNum;
				if(str.equals(newStr)) {
					sqrtNum = Math.sqrt(i);
					System.out.println(sqrtNum);					
					if(sqrtNum - (int)sqrtNum==0) {
						str = "";
						str = Integer.toString((int)sqrtNum);
						newStr = "";	
						for(int j = str.length()-1; j>=0; j--) {
							newStr += str.charAt(j);
						}
						if(str.equals(newStr)) {
							count++;
						}
					}
				}
			}
			System.out.println("#"+test_case+" "+count);
			
		}
	}
}
