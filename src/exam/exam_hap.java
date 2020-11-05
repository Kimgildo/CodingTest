package exam;

public class exam_hap {
	
	static int[] num = {38, 111, 102, 111, 177}; 
	public static int hap(int[] num) {
		int result = 0;

		for(int i=1; i<num.length; i++) {
			for(int j=0; j<i; j++) {
				if(num[j]<=num[i]) {
					result++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(hap(num));
	}
}
