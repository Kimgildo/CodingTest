package swea;

import java.util.Scanner;

public class exam_10_23_10505 {
	
	public static final int X = 0;
    public static final int D = 1;

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
			int N;
            N = sc.nextInt();
            int sum = 0;
            int[] num = new int[N];
            for(int i =0; i<N; i++){
             	int n = sc.nextInt();
                num[i] = n;
             	sum += n;
            }
            float avg = 0;
            avg = (float)sum/N;
            int count = 0;
            for(int i=0; i<num.length; i++) {
            	if(num[i] <= avg) {
            		count++;
            	}
            }
            System.out.println("#"+test_case+" "+count);
		}
		
	}
}
