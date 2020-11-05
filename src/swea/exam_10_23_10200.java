package swea;

import java.util.Scanner;

public class exam_10_23_10200 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			int N, A, B;
            N = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
            int max = 0;
            int min = 0;
            if(A>B)
                max = B;
            else
                max = A;
			if(A+B >= N){
             	   min = (A+B) - N;
            }else
                min = 0;
			System.out.println("#"+test_case+" "+max+ " "+ min);

		}
	}
}
