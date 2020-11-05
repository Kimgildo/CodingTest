package exam;

import java.util.Scanner;

public class exam_matrix {
	
	static int n = 12345;
	static int hap = 131;
	
	public static int reverse(int n) { //숫자 바꾸기
		String r = "";
		String revNum = "";
		r = Integer.toString(n);
		for(int i=r.length()-1; i>=0; i--) {
			revNum += r.charAt(i);
		}
		int rev = Integer.parseInt(revNum);
		return rev;
	}
	
	public static boolean isPalindrome(int hap) {
		String r = "";
		String palnum = "";
		r = Integer.toString(hap);
		for(int i = r.length()-1; i>=0; i--) {
			palnum += r.charAt(i);
		}
		if(r.equals(palnum))
			return true;
		else
			return false;
	}
	
	public static int hapNum(int n) {
		int hap = reverse(n) + n;
		return hap;
	}
	
	public static void main(String[] args) {
		int T; // 테스트 수
		int N; // 입력 정수
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		while(T-- != 0) {
			N = sc.nextInt();
			if(isPalindrome(hapNum(N))) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
